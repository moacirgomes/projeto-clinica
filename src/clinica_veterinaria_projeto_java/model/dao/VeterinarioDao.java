/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JOptionPane;

import clinica_veterinaria_projeto_java.model.beans.Veterinario;
import java.util.ArrayList;

public class VeterinarioDao {

    private static final String createTable = "CREATE TABLE IF NOT EXISTS VETERINARIO( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR ,CRMV VARCHAR, ESPECIALIDADE VARCHAR)";

    public void salvar(Veterinario vet) {

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("INSERT INTO VETERINARIO(NOME,CRMV, ESPECIALIDADE) VALUES ('" + vet.getNome()
                        + "','" + vet.getCrmv() + "','" + vet.getEspecialista() + "')");

                JOptionPane.showMessageDialog(null, "Veterinario cadastrado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir - " + e.getMessage());
            }

        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    public void editar(Veterinario vet) {

    }

    public void remover(Veterinario vet) {

    }

    public Veterinario consultar(long id) {

        return null;

    }

    public ArrayList listar() {

        ArrayList lista = new ArrayList();
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {
                Statement statement = connection.createStatement();

                statement.execute(createTable);
                // lendo os registros
                PreparedStatement stmt = connection.prepareStatement("SELECT ID,NOME,CRMV,ESPECIALIDADE FROM VETERINARIO");
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {

                    lista.add(new Object[]{resultSet.getInt("ID"), resultSet.getString("NOME"), resultSet.getString("CRMV"), resultSet.getString("ESPECIALIDADE")});
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
