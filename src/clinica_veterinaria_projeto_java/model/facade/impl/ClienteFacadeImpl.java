/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade.impl;

import clinica_veterinaria_projeto_java.model.beans.Cliente;
import clinica_veterinaria_projeto_java.model.dao.ClienteDao;
import clinica_veterinaria_projeto_java.model.facade.ClienteFacade;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class ClienteFacadeImpl implements ClienteFacade{

    private ClienteDao clienteDao;

    public ClienteFacadeImpl() {
        clienteDao = new ClienteDao();
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDao.salvar(cliente);
    }

    @Override
    public ArrayList listarTodos() {
        return clienteDao.listar();
    }

    @Override
    public void remover(int id) {
        clienteDao.remover(id);
    }

    @Override
    public void editar(Cliente cliente) {
        clienteDao.editar(cliente);
    }

}
