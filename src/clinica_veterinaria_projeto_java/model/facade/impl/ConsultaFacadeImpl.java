/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade.impl;

import clinica_veterinaria_projeto_java.model.beans.Consulta;
import clinica_veterinaria_projeto_java.model.dao.ConsultaDao;
import clinica_veterinaria_projeto_java.model.facade.ConsultaFacade;
import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class ConsultaFacadeImpl implements ConsultaFacade{

    private ConsultaDao consultaDao;

    public ConsultaFacadeImpl() {
        consultaDao = new ConsultaDao();
    }

    @Override
    public void salvar(Consulta consulta) {
        consultaDao.salvar(consulta);
    }

    @Override
    public ArrayList listarTodos() {
        return consultaDao.listar();
    }

    @Override
    public void remover(int id) {
        consultaDao.remover(id);
    }

    @Override
    public void editar(Consulta consulta) {
        consultaDao.editar(consulta);
    }

}
