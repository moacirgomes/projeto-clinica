/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade;

import clinica_veterinaria_projeto_java.model.beans.Animal;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public interface AnimalFacade {
    void salvar(Animal animal);
    
    void remover(int id);

    void editar(Animal animal);

    ArrayList listarTodos();  
    
}
