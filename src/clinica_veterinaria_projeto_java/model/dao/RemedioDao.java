/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.dao;

import clinica_veterinaria_projeto_java.model.beans.Remedio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Selma
 */
public class RemedioDao {
    private static String createTable = "CREATE TABLE IF NOT EXISTS REMEDIO( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR, VALOR DOUBLE, QUANTIDADE INT)";

    public void salvar(Remedio remedio) {

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("INSERT INTO REMEDIO(NOME,VALOR,QUANTIDADE) VALUES ('" + remedio.getNome() + "',"+remedio.getValor()+","+remedio.getValor()+")");

                JOptionPane.showMessageDialog(null, "Remedio cadastrado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir - " + e.getMessage());
            }

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    public void editar(Remedio remedio) {
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("UPDATE REMEDIO SET NOME = '" + remedio.getNome() + "', VALOR = "+remedio.getValor()+", QUANTIDADE = "+remedio.getQuantidade()+" WHERE ID = " + remedio.getIdRemedio());

                JOptionPane.showMessageDialog(null, "Remedio editado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao editar o remedio - " + e.getMessage());
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
                statement.execute("DELETE FROM REMEDIO WHERE ID = " + id);

                JOptionPane.showMessageDialog(null, "Remedio excluido com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o remedio - " + e.getMessage());
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
                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM REMEDIO");
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {

                    lista.add(new Object[]{resultSet.getInt("ID"), resultSet.getString("NOME"), resultSet.getDouble("VALOR"),resultSet.getInt("QUANTIDADE")});
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
