/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade;

import clinica_veterinaria_projeto_java.model.beans.Laboratorio;
import java.util.ArrayList;

/**
 *
 * @author Selma
 */
public interface LaboratorioFacade {

    void salvar(Laboratorio lab);

    void remover(int id);

    void editar(Laboratorio lab);

    ArrayList listarTodos();
}
