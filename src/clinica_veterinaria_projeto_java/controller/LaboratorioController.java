/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.controller;

import clinica_veterinaria_projeto_java.model.beans.Laboratorio;
import clinica_veterinaria_projeto_java.model.facade.impl.LaboratorioFacadeImpl;
import java.util.ArrayList;

/**
 *
 * @author Selma
 */
public class LaboratorioController {
    private LaboratorioFacadeImpl facade;

    public LaboratorioController() {

        this.facade = new LaboratorioFacadeImpl();
    }

    public void cadastrar(Laboratorio lab) {
        facade.salvar(lab);

    }

    public void editar(Laboratorio lab) {
        facade.editar(lab);

    }

    public void deletar(int id) {
        facade.remover(id);
    }

    public ArrayList lista() {
        return facade.listarTodos();
    }
}
