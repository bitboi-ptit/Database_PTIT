package DataTransfer;

import java.sql.Timestamp;

public class LoginDetail {
    private int loginId;
    private String authKey;
    private String ipAddress;
    private String macAddress;
    private Timestamp loginTime;
    private Timestamp logoutTime;
    private int soTK;
    public LoginDetail(){}

    public LoginDetail(int loginId, String authKey, String ipAddress, String macAddress, Timestamp loginTime, Timestamp logoutTime, int soTK) {
        this.loginId = loginId;
        this.authKey = authKey;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.soTK = soTK;
    }

    public int getLoginId() {
        return loginId;
    }

    public String getAuthKey() {
        return authKey;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public Timestamp getLogoutTime() {
        return logoutTime;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public void setLogoutTime(Timestamp logoutTime) {
        this.logoutTime = logoutTime;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    @Override
    public String toString() {
        return "LoginDetail{" +
                "loginId=" + loginId +
                ", authKey='" + authKey + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", macAddress='" + macAddress + '\'' +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", soTK=" + soTK +
                '}';
    }
}
