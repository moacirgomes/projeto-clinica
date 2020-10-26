/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.controller;

import clinica_veterinaria_projeto_java.model.beans.Consulta;
import clinica_veterinaria_projeto_java.model.facade.impl.ConsultaFacadeImpl;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class ConsultaController {
    private ConsultaFacadeImpl facade;

    public ConsultaController() {

        this.facade = new ConsultaFacadeImpl();
    }

    public void cadastrar(Consulta cliente) {
        facade.salvar(cliente);

    }

    public void editar(Consulta cliente) {
        facade.editar(cliente);

    }

    public void deletar(int id) {
        facade.remover(id);
    }

    public ArrayList lista() {
        return facade.listarTodos();
    }
    
    
}
