package clinica_veterinaria_projeto_java.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {

	public static Connection conectarBanco() {
		
		
		Connection conn = null;
		try {

			Class.forName("org.sqlite.JDBC");
			try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {
				conn =  connection;
				System.out.println("Conexao bem sucedida!");
				
				
			} catch (SQLException e) {
				
				JOptionPane.showMessageDialog(null, "Erro ao cenectar com banco! " + e.getMessage());
				
			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
		return conn;

		

	}
	
	
	
	
	
	
}
