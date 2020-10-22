/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_veterinaria_projeto_java.model.facade.impl;

import java.util.List;

import clinica_veterinaria_projeto_java.model.beans.Veterinario;
import clinica_veterinaria_projeto_java.model.dao.VeterinarioDao;
import clinica_veterinaria_projeto_java.model.facade.VeterinarioFacade;
import java.util.ArrayList;


public class VeterinarioFacadeImpl implements VeterinarioFacade {
	
	

	private VeterinarioDao vetDao; 
    
    public VeterinarioFacadeImpl() {
    	vetDao = new VeterinarioDao();
    }
    
    @Override
    public void salvar(Veterinario vet) {
        vetDao.salvar(vet);
    }
    
    @Override
    public ArrayList<Veterinario> listarTodos() {
        return vetDao.listar();
    }

    @Override
    public void remover(Veterinario vet) {
    	vetDao.remover(vet);
    }

    @Override
    public void editar(Veterinario vet) {
        vetDao.editar(vet);
    }
    
}
