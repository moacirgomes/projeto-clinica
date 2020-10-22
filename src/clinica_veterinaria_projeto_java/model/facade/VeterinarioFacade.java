/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade;

import clinica_veterinaria_projeto_java.model.beans.Veterinario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Junior
 */
public interface VeterinarioFacade {
    void salvar(Veterinario vet);
    void remover(Veterinario vet);
    void editar(Veterinario vet);
    ArrayList listarTodos();
    
    
}
