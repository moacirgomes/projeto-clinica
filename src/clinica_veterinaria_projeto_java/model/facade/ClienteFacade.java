/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade;

import clinica_veterinaria_projeto_java.model.beans.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public interface ClienteFacade {
    void salvar(Cliente cliente);
    
    void remover(int id);

    void editar(Cliente cliente);

    ArrayList listarTodos();    
}
