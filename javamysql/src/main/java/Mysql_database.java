
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class Mysql_database {
	
	public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/bus_reservation_system";
         String username="root";
         String password="ani@2002";
         try {
			Connection connection=DriverManager.getConnection(url,username,password);
		    String sql="SELECT * FROM bus_info";
		    Statement statement=connection.createStatement();
		    ResultSet result=statement.executeQuery(sql);
		    
		    while(result.next())
		    {
		    	int Bus_No=result.getInt("Bus_No");
		    	String Source=result.getString("Source");
		    	String Destination=result.getString("Destination");
		    	String Dept_location=result.getString("Dept_location");
		    	
		    	System.out.println("Route " + Bus_No + "           " + Source+"            " + Destination +"             " + Dept_location);
		    	
		    }
			connection.close();
			
         } catch (SQLException e) {
 			System.out.println("error!");
 			e.printStackTrace();
 		}
	}

}
