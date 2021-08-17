package AgendaConSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
public static Connection getConnection() {
		
		String conexionUrl = "jdbc:sqlserver://localhost:1433;"
				+ "database = Agenda;"
				+ "user = ****;"
				+ "password = ****;"
				;			
			
			try {
				Connection con =  DriverManager.getConnection(conexionUrl);
				return con;
				
			}catch (SQLException e){
				System.out.println(e.toString());
				return null;
			}
		}

}
