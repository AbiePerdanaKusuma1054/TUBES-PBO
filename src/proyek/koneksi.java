package proyek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author asus
 */
class koneksi {
    private static Connection mysqlconfig ;
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/pesawat";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception o) {
            System.err.println("Koneksi Gagal "+o.getMessage());
        }
        return mysqlconfig;
    }
}
