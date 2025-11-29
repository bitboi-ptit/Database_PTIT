package BUS.AccountServices;

import DataAccess.DataAccessObject.LoginDetailDAO;
import DataTransfer.LoaiSanPham;
import DataTransfer.LoginDetail;

import java.sql.Timestamp;

public class LogoutAction {
    public static void logout(){
        LoginFile loginFile = new LoginFile();
        loginFile.writeToFile();
    }

    public static void storeLogoutTime(LoginDetail loginDetail){
        LoginDetailDAO lgDao = new LoginDetailDAO();
        loginDetail.setLogoutTime(new Timestamp(System.currentTimeMillis()));
        lgDao.update(loginDetail.getLoginId(), loginDetail);
    }
}
