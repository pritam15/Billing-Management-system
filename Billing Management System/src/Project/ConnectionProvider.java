
package Project;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","pritam");
            return con;
        } 
        catch (Exception e) 
        {
            return null;
        }
        
    }
}
