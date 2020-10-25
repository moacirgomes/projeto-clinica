/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade.impl;

import clinica_veterinaria_projeto_java.model.beans.Remedio;
import clinica_veterinaria_projeto_java.model.dao.RemedioDao;
import clinica_veterinaria_projeto_java.model.facade.RemedioFacade;
import java.util.ArrayList;

/**
 *
 * @author Selma
 */
public class RemedioFacadeImpl implements RemedioFacade{
    private RemedioDao remedioDao;

    public RemedioFacadeImpl() {
        remedioDao = new RemedioDao();
    }

    @Override
    public void salvar(Remedio remedio) {
        remedioDao.salvar(remedio);
    }

    @Override
    public ArrayList listarTodos() {
        return remedioDao.listar();
    }

    @Override
    public void remover(int id) {
        remedioDao.remover(id);
    }

    @Override
    public void editar(Remedio remedio) {
        remedioDao.editar(remedio);
    }
}
