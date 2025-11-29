
package GUI.ManageGroup.Handle.NhanVienHandle;

import DataTransfer.NhanVien;
import GUI.ManagerSale.BasicHandle.EmailExampleTest;


public class NhanVienValidate {
    private final NhanVien nhanvienValidate;
    private final EmailExampleTest emailExampleTest;
    
    public NhanVienValidate(){
        nhanvienValidate = new NhanVien();
        emailExampleTest = new EmailExampleTest();
    }
    
    public boolean validateAll(String tenNhanVien,String soDienThoai, String cmnd, String diachi, String email){
        return checkTenNhanVien(tenNhanVien) && checkSoDienThoai(soDienThoai) && checkCmnd(cmnd)  && checkDiaChi(diachi) && checkEmail(email);
    }
    
    private boolean checkTenNhanVien(String tenNhanVien){
        if(tenNhanVien.length() < 2) return false;
        this.nhanvienValidate.setTenNV(tenNhanVien);
        return true;
    }
    
    private boolean checkSoDienThoai(String soDienThoai){
        if(soDienThoai.length() != 10 && soDienThoai.length() != 9) return false;
        System.out.println(soDienThoai);
        this.nhanvienValidate.setSoDienThoai(soDienThoai);
        return true;
    }
    
    private boolean checkCmnd(String cmnd){
        if(cmnd.length() != 12) return false;
        this.nhanvienValidate.setCmnd(cmnd);
        return true;
    }
    
    private boolean checkEmail(String email){
        return emailExampleTest.checkEmail(email);
    }
    
    private boolean checkDiaChi(String diachi){
        if(diachi.length() < 10) return false;
        this.nhanvienValidate.setDiaChi(diachi);
        return true;
    }
    
}
