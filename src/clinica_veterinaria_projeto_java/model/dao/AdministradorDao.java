package clinica_veterinaria_projeto_java.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JOptionPane;

import clinica_veterinaria_projeto_java.model.beans.Administrador;

public class AdministradorDao {

	private static String createTable = "CREATE TABLE IF NOT EXISTS ADMINISTRADOR( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR , USUARIO VARCHAR, SENHA VARCHAR)";

	public void salvar(Administrador adm) {

		try {

			Class.forName("org.sqlite.JDBC");

			try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

				System.out.println("Conexao realizada !!!!");

				Statement statement = connection.createStatement();

				statement.execute(createTable);

				// inserindo registros
				statement.execute("INSERT INTO ADMINISTRADOR(NOME,USUARIO,SENHA) VALUES ('" + adm.getNome()
						+ "','"+adm.getUsuario()+"','"+adm.getSenha()+"')");

				JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!");

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir - " + e.getMessage());
			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void editar(Administrador adm) {

	}

	public void remover(Administrador adm) {

	}

	public Administrador consultar(Integer id) {

		return null;

	}

	public List<Administrador> listar() {

		List<Administrador> lista = null;
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

		return lista;
	}
	

	public Administrador verificarLoginUsuario(String usuario) {

		Administrador adm = new Administrador();
		try {

			Class.forName("org.sqlite.JDBC");

			try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

				// lendo os registros
				PreparedStatement stmt = connection.prepareStatement(
						"select * from administrador where usuario='" + usuario + "'");
				ResultSet resultSet = stmt.executeQuery();

				if (resultSet.next()) {
					adm.setId(resultSet.getInt("ID"));
					adm.setNome(resultSet.getString("NOME"));
					adm.setUsuario(resultSet.getString("USUARIO"));
					adm.setSenha(resultSet.getString("SENHA"));
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return adm;
	}

}
