package BUS.AccountServices;

import java.sql.Timestamp;

import DataAccess.DataAccessObject.LoginDetailDAO;
import DataAccess.DataAccessObject.NhanVienDAO;
import DataAccess.DataAccessObject.TaiKhoanDAO;
import DataTransfer.LoaiSanPham;
import DataTransfer.LoginDetail;
import DataTransfer.NhaCungCap;
import GUI.ManageGroup.ManageItem.ManagerFrame.ManageFrame;
import GUI.ManageGroup.ManageItem.ManagerPanel.NhapXuatPanel;

public class LoginAction {
    private final TaiKhoanDAO taiKhoanDAO;
    private final LoginDetailDAO loginDetailDAO;
    private NhanVienDAO nhanVienDAO;
    public ManageFrame manager;
    private LoginDetail loginDetail;
    private final int AUTH_KEY_EXPIRE_TIME = 1000*60*60*2;
    private int soTK;
    private boolean rememberLogin;
    public LoginAction(){
        taiKhoanDAO = new TaiKhoanDAO();
        loginDetailDAO = new LoginDetailDAO();
        nhanVienDAO = new NhanVienDAO();
    }
    public LoginAction(ManageFrame manager){
        this.manager = manager;
        taiKhoanDAO = new TaiKhoanDAO();
        loginDetailDAO = new LoginDetailDAO();
        nhanVienDAO = new NhanVienDAO();
    }
    public boolean loginInput(String username, String password, boolean rememberLogin){
        this.rememberLogin = rememberLogin;
        NhaCungCap.TaiKhoan tk = taiKhoanDAO.selectByTenTK(username);
        if(tk == null){
            return false;
        }
        if(!tk.getMatKhau().equals(password)){
            setWrongPasswordTime(tk.getSoTK(), tk, tk.getSoLanSai() + 1);
            return false;
        }
        soTK = tk.getSoTK();
        setWrongPasswordTime(tk.getSoTK(), tk,0);
        storeLoginAuth(rememberLogin);
        return true;
    }

    public boolean checkAuthKey(){
        LoginFile loginFile = new LoginFile();
        String authKey = loginFile.readFromFile();
        if(authKey == null){
            return false;
        }
        loginDetail = loginDetailDAO.selectByAuthKey(authKey);
        if(loginDetail == null){
            LogoutAction.logout();
            return false;
        }
        this.rememberLogin = true;
        loginDetail.setLogoutTime(new Timestamp(System.currentTimeMillis() + AUTH_KEY_EXPIRE_TIME));
        soTK = loginDetail.getSoTK();
        loginDetailDAO.update(loginDetail.getLoginId(), loginDetail);
        return true;
    }


    public void showFrame(){
        System.out.println("Khoi tao frame nhan vien quan ly");
        ManageFrame.maNV = taiKhoanDAO.select(soTK).getMaNV();
        NhapXuatPanel.maNhanVien = ManageFrame.maNV;
        manager.setVisible(true);
    }
    protected void storeLoginAuth(boolean rememberLogin){
        if(rememberLogin){
            LoginFile loginFile = new LoginFile();
            String authKey = loginFile.createAuthKey(50);
            System.out.println("Auth Key: " + authKey);
            loginFile.setAuthKey(authKey);
            loginFile.writeToFile();
            loginDetail = new LoginDetail(0,authKey,"192.168.1.1","None_MAC", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()+AUTH_KEY_EXPIRE_TIME),soTK);
        }else{
            loginDetail = new LoginDetail(0,null,"192.168.1.1","None_MAC", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),soTK);
        }
        loginDetailDAO.insert(loginDetail);
    }

    public void setWrongPasswordTime(int soTK, NhaCungCap.TaiKhoan tk, int times){
        tk.setSoLanSai(times);
        taiKhoanDAO.update(soTK, tk);
    }

    public LoginDetail getLoginDetail() {
        return loginDetail;
    }

    public boolean isRememberLogin() {
        return rememberLogin;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setLoginDetail(LoginDetail loginDetail) {
        this.loginDetail = loginDetail;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public void setRememberLogin(boolean rememberLogin) {
        this.rememberLogin = rememberLogin;
    }
}
