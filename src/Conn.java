
import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///projectcrud","root","");
            s=c.createStatement();
        }catch(Exception e){}
    }
}
