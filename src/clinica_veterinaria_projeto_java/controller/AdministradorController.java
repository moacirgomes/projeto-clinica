package clinica_veterinaria_projeto_java.controller;

import clinica_veterinaria_projeto_java.model.beans.Administrador;
import clinica_veterinaria_projeto_java.model.facade.impl.AdministradorFacadeImpl;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Selma
 */
public class AdministradorController {

    private AdministradorFacadeImpl facade;

    public AdministradorController() {

        this.facade = new AdministradorFacadeImpl();
    }

    public void cadastrar(Administrador adm) {
        facade.salvar(adm);

    }

    public void editar(Administrador adm) {
        facade.editar(adm);

    }

    public void deletar(int id) {
        facade.remover(id);
    }

    public ArrayList lista() {
        return facade.listarTodos();
    }
}
