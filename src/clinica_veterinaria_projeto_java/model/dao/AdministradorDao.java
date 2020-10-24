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
import java.util.ArrayList;

public class AdministradorDao {

    private static String createTable = "CREATE TABLE IF NOT EXISTS ADMINISTRADOR( ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR , USUARIO VARCHAR, SENHA VARCHAR)";

    public void salvar(Administrador adm) {

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {



                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("INSERT INTO ADMINISTRADOR(NOME,USUARIO,SENHA) VALUES ('" + adm.getNome()
                        + "','" + adm.getUsuario() + "','" + adm.getSenha() + "')");

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
        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

                Statement statement = connection.createStatement();

                statement.execute(createTable);

                // inserindo registros
                statement.execute("UPDATE administrador SET NOME = '" + adm.getNome() + "', USUARIO = '" + adm.getUsuario() + "', SENHA = '" + adm.getSenha() + "' WHERE ID = " + adm.getId());

                JOptionPane.showMessageDialog(null, "Administrador editado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao editar o administrador - " + e.getMessage());
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
                statement.execute("DELETE FROM administrador WHERE ID = " + id);

                JOptionPane.showMessageDialog(null, "Administrador excluido com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o administrador - " + e.getMessage());
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
                PreparedStatement stmt = connection.prepareStatement("SELECT ID,NOME,USUARIO,SENHA FROM ADMINISTRADOR");
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {

                    lista.add(new Object[]{resultSet.getInt("ID"), resultSet.getString("NOME"), resultSet.getString("USUARIO"), resultSet.getString("SENHA")});
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
                Statement statement = connection.createStatement();

                statement.execute(createTable);
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
