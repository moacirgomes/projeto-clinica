/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.controller;

import clinica_veterinaria_projeto_java.model.beans.Animal;
import clinica_veterinaria_projeto_java.model.facade.impl.AnimalFacadeImpl;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class AnimalController {
     private AnimalFacadeImpl facade;

    public AnimalController() {

        this.facade = new AnimalFacadeImpl();
    }

    public void cadastrar(Animal animal) {
        facade.salvar(animal);

    }

    public void editar(Animal animal) {
        facade.editar(animal);

    }

    public void deletar(int id) {
        facade.remover(id);
    }

    public ArrayList lista(Integer idCliente) {
        return facade.listarTodos(idCliente);
    }
    
}
