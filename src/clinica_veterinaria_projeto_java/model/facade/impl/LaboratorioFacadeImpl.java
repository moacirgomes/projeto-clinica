package clinica_veterinaria_projeto_java.model.facade.impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import clinica_veterinaria_projeto_java.model.beans.Laboratorio;
import clinica_veterinaria_projeto_java.model.dao.LaboratorioDao;
import clinica_veterinaria_projeto_java.model.facade.LaboratorioFacade;
import java.util.ArrayList;

/**
 *
 * @author Selma
 */
public class LaboratorioFacadeImpl implements LaboratorioFacade {

    private LaboratorioDao labDao;

    public LaboratorioFacadeImpl() {
        labDao = new LaboratorioDao();
    }

    @Override
    public void salvar(Laboratorio lab) {
        labDao.salvar(lab);
    }

    @Override
    public ArrayList listarTodos() {
        return labDao.listar();
    }

    @Override
    public void remover(int id) {
        labDao.remover(id);
    }

    @Override
    public void editar(Laboratorio lab) {
        labDao.editar(lab);
    }
}
