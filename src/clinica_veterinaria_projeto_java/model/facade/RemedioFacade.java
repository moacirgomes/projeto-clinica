/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade;

import clinica_veterinaria_projeto_java.model.beans.Remedio;
import java.util.ArrayList;

/**
 *
 * @author Selma
 */
public interface RemedioFacade {
    void salvar(Remedio remedio);

    void remover(int id);

    void editar(Remedio remedio);

    ArrayList listarTodos();
}
