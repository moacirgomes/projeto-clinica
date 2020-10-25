/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.dao;

import clinica_veterinaria_projeto_java.model.beans.Laboratorio;
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
public class LaboratorioDao {

    private static String createTable = "CREATE TABLE IF NOT EXISTS LABORATORIO( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR)";

    public void salvar(Laboratorio lab) {

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("INSERT INTO LABORATORIO(NOME) VALUES ('" + lab.getNome() + "')");

                JOptionPane.showMessageDialog(null, "Laboratório cadastrado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir - " + e.getMessage());
            }

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    public void editar(Laboratorio lab) {
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("UPDATE laboratorio SET NOME = '" + lab.getNome() + "' WHERE ID = " + lab.getIdlabaratorio());

                JOptionPane.showMessageDialog(null, "Laboratório editado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao editar o Laboratório - " + e.getMessage());
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
                statement.execute("DELETE FROM laboratorio WHERE ID = " + id);

                JOptionPane.showMessageDialog(null, "Laboratório excluido com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o laboratório - " + e.getMessage());
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
                PreparedStatement stmt = connection.prepareStatement("SELECT ID,NOME FROM LABORATORIO");
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {

                    lista.add(new Object[]{resultSet.getInt("ID"), resultSet.getString("NOME")});
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
