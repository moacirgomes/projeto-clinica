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
import java.util.ArrayList;

public class ClienteDao {

    private static String createTable = "CREATE TABLE IF NOT EXISTS CLIENTE ( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR , ENDERECO VARCHAR, TELEFONE VARCHAR, EMAIL VARCHAR, CPF VARCHAR)";

    public void salvar(Cliente cliente) {

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("INSERT INTO CLIENTE(NOME, ENDERECO, TELEFONE, EMAIL, CPF) VALUES ('" + cliente.getNome() + "','" + cliente.getEndreco() + "','" + cliente.getTelefone() + "','" + cliente.getEmail() + "','" + cliente.getCpf() + "')");

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir - " + e.getMessage());
            }

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    public void editar(Cliente cliente) {
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("UPDATE cliente SET NOME = '" + cliente.getNome() + "', ENDERECO = '" + cliente.getEndreco()+ "', TELEFONE = '" + cliente.getTelefone()+ "', EMAIL = '" + cliente.getEmail()+ "', CPF = '" + cliente.getCpf()+"' WHERE ID = " + cliente.getIdClinte());

                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao editar o cliente - " + e.getMessage());
            }

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public void remover(int id) {
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("DELETE FROM cliente WHERE ID = " + id);

                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o cliente - " + e.getMessage());
            }

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    public ArrayList listar() {

        ArrayList lista = new ArrayList();
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {
                Statement statement = connection.createStatement();

                statement.execute(createTable);
                // lendo os registros
                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM CLIENTE");
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {

                    lista.add(new Object[]{resultSet.getInt("ID"), resultSet.getString("NOME"), resultSet.getString("ENDERECO"), resultSet.getString("TELEFONE"), resultSet.getString("EMAIL"), resultSet.getString("CPF")});
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

}
