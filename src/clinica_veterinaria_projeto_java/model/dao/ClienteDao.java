package clinica_veterinaria_projeto_java.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import clinica_veterinaria_projeto_java.model.beans.Administrador;
import clinica_veterinaria_projeto_java.model.beans.Cliente;

public class ClienteDao {
	private static String createTable = "CREATE TABLE IF NOT EXISTS CLIENTE ( ID Long PRIMARY KEY AUTOINCREMENT, NOME VARCHAR , USUARIO VARCHAR, SENHA VARCHAR)";

	public void inserir(Cliente cliente) {

		try {

			Class.forName("org.sqlite.JDBC");

			try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

				System.out.println("Conexao realizada !!!!");

				Statement statement = connection.createStatement();

				statement.execute(createTable);

				// inserindo registros
				statement.execute("INSERT INTO ADMINISTRADOR(NOME,USUARIO,SENHA) VALUES ('" +cliente.getNome()
						+ "','junior','123456')");

				JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!");

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir - " + e.getMessage());
			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void listar() {
		try {

			Class.forName("org.sqlite.JDBC");

			try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

				// lendo os registros
				PreparedStatement stmt = connection.prepareStatement("select * from administrador");
				ResultSet resultSet = stmt.executeQuery();

				while (resultSet.next()) {
					Integer id = resultSet.getInt("ID");
					String nome = resultSet.getString("NOME");

					System.out.println(id + " - " + nome);
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
