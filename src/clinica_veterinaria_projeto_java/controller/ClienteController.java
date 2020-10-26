/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.controller;

import clinica_veterinaria_projeto_java.model.beans.Cliente;
import clinica_veterinaria_projeto_java.model.facade.impl.ClienteFacadeImpl;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class ClienteController {

    private ClienteFacadeImpl facade;

    public ClienteController() {

        this.facade = new ClienteFacadeImpl();
    }

    public void cadastrar(Cliente cliente) {
        facade.salvar(cliente);

    }

    public void editar(Cliente cliente) {
        facade.editar(cliente);

    }

    public void deletar(int id) {
        facade.remover(id);
    }

    public ArrayList lista() {
        return facade.listarTodos();
    }
}
