/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectSQL;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vup60
 */
public class Connect {
    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyKhoHang;user=sa;password=123456;encrypt=true;trustServerCertificate=true;");
            if(conn != null){
                System.out.println("Ket noi thanh cong!");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
}
