/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.controller;

import clinica_veterinaria_projeto_java.model.beans.Remedio;
import clinica_veterinaria_projeto_java.model.facade.impl.RemedioFacadeImpl;
import java.util.ArrayList;

/**
 *
 * @author Selma
 */
public class RemedioController {
    private RemedioFacadeImpl facade;

    public RemedioController() {

        this.facade = new RemedioFacadeImpl();
    }

    public void cadastrar(Remedio remedio) {
        facade.salvar(remedio);

    }

    public void editar(Remedio remedio) {
        facade.editar(remedio);

    }

    public void deletar(int id) {
        facade.remover(id);
    }

    public ArrayList lista() {
        return facade.listarTodos();
    }
}
