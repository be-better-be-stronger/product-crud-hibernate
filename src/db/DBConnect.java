package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/product_db";
        String username = "root";
        String password = "abc123"; // sửa nếu bạn có mật khẩu

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
}
