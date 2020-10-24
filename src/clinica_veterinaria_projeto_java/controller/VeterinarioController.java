/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.controller;

import clinica_veterinaria_projeto_java.model.beans.Veterinario;
import clinica_veterinaria_projeto_java.model.facade.impl.VeterinarioFacadeImpl;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class VeterinarioController {

    private VeterinarioFacadeImpl facade;

    public VeterinarioController() {

        this.facade = new VeterinarioFacadeImpl();
    }

    public void cadastrar(Veterinario vet) {
        facade.salvar(vet);

    }
    
    public void editar(Veterinario vet) {
        facade.editar(vet);

    }
    
    public void deletar(int id){
        facade.remover(id);
    }

    public ArrayList lista() {
        return facade.listarTodos();
    }
    
     public ArrayList pesquisar(String characters) {
        return facade.pesquisar(characters);
    }

}
