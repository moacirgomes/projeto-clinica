package clinica_veterinaria_projeto_java.model.facade.impl;

import java.util.List;

import clinica_veterinaria_projeto_java.model.beans.Administrador;
import clinica_veterinaria_projeto_java.model.dao.AdministradorDao;
import clinica_veterinaria_projeto_java.model.facade.AdministradorFacade;


public class AdministradorFacadeImpl implements AdministradorFacade {
	
	

	private AdministradorDao admDao; 
    
    public AdministradorFacadeImpl() {
    	admDao = new AdministradorDao();
    }
    
    @Override
    public void salvar(Administrador adm) {
        admDao.salvar(adm);
    }
    
    @Override
    public List<Administrador> listarTodos() {
        return admDao.listar();
    }

    @Override
    public void remover(Administrador adm) {
    	admDao.remover(adm);
    }

    @Override
    public void editar(Administrador adm) {
        admDao.editar(adm);
    }
    
    @Override
    public Administrador efeturarLogin(String usuario) {
    	return admDao.verificarLoginUsuario(usuario);
    }

}
