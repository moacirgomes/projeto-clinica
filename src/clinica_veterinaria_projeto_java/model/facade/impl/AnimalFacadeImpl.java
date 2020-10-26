/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade.impl;

import clinica_veterinaria_projeto_java.model.beans.Animal;
import clinica_veterinaria_projeto_java.model.dao.AnimalDao;
import clinica_veterinaria_projeto_java.model.facade.AnimalFacade;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class AnimalFacadeImpl implements AnimalFacade {

    private AnimalDao animalDao;

    public AnimalFacadeImpl() {
        animalDao = new AnimalDao();
    }

    @Override
    public void salvar(Animal animal) {
        animalDao.salvar(animal);
    }

    @Override
    public ArrayList listarTodos() {
        return animalDao.listar();
    }

    @Override
    public void remover(int id) {
        animalDao.remover(id);
    }

    @Override
    public void editar(Animal animal) {
        animalDao.editar(animal);
    }

}
