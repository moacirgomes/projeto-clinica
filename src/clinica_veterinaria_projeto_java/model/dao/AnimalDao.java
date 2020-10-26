/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.dao;

import clinica_veterinaria_projeto_java.model.beans.Animal;
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
 * @author Junior
 */
public class AnimalDao {
    
    private static String createTable = "CREATE TABLE IF NOT EXISTS Animal( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR , COR VARCHAR, RACA VARCHAR, DATANASCIMENTO DATE, OBESERVACAO VARCHAR, SEXO CHAR)";

    public void salvar(Animal animal){

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("INSERT INTO CLIENTE(NOME, COR, RACA, DATANASCIMENTO, OBSERVACAO, SEXO) VALUES ('" + animal.getNome() + "','" + animal.getCor()+ "','" + animal.getRaca()+ "','" + animal.getDataNascimento()+ "','" + animal.getDataNascimento()+ "','" + animal.getObeservacao()+ "','" + animal.getSexo()+ "')");

                JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir - " + e.getMessage());
            }

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    public void editar(Animal animal) {
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("UPDATE animal SET NOME = '" + animal.getNome() + "', COR = '" + animal.getCor()+ "', RACA = '" + animal.getRaca()+ "', DATANASCIMENTO = '" + animal.getDataNascimento()+ "', OBSERVACAO = '" + animal.getObeservacao()+"', Sexo'" + animal.getSexo()+"' WHERE ID = " + animal.getId());

                JOptionPane.showMessageDialog(null, "Animal editado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao editar o animal - " + e.getMessage());
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
                statement.execute("DELETE FROM animal WHERE ID = " + id);

                JOptionPane.showMessageDialog(null, "Animal excluido com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o animal - " + e.getMessage());
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
                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM ANIMAL");
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {

                    lista.add(new Object[]{resultSet.getInt("ID"), resultSet.getString("NOME"), resultSet.getString("COR"), resultSet.getString("RACA"), resultSet.getString("DATANASCIMENTO"), resultSet.getString("OBSERVACAO"), resultSet.getString("SEXO")});
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
