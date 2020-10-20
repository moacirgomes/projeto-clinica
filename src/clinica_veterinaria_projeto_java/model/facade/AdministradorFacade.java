package clinica_veterinaria_projeto_java.model.facade;

import java.util.List;

import clinica_veterinaria_projeto_java.model.beans.Administrador;


public interface AdministradorFacade {
	void salvar(Administrador adm);
    void remover(Administrador adm);
    void editar(Administrador adm);
    List<Administrador> listarTodos();
    Administrador efeturarLogin(String usuario);
    
}
