package DataAccess.DatabaseConnector;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties; //Dùng để đọc file cấu hình dạng key-value
import org.apache.commons.dbutils.DbUtils;

public class ConnectManager {
    private Connection connect;
    private String url;
    private String username;
    private String password;
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    public ConnectManager() {
        DbUtils.loadDriver(JDBC_DRIVER);//ổ cứng lôi cái class Driver kia lên RAM và chuẩn bị sẵn sàng làm việc
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/java/DataAccess/DatabaseConnector/dbconfig.properties")); //đọc file cấu hình
            this.url = properties.getProperty("url");
            this.username = properties.getProperty("username");
            this.password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connect;
    }

    public void openConnection(){
        try {
            this.connect = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Can't connect database " + url);
        }
    }

    public void closeConnection() {
        try {
            DbUtils.close(connect);
        } catch (SQLException e) {
            System.out.println("Something went wrong when closing database");;
        }
    }

    public static void main(String[] args) {
        ConnectManager cm = new ConnectManager();
        cm.openConnection();
    }
}