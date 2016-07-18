package crud.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/clientes","root","210390");
		} catch (SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
