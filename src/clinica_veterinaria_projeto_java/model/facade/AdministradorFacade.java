package clinica_veterinaria_projeto_java.model.facade;

import java.util.List;

import clinica_veterinaria_projeto_java.model.beans.Administrador;
import java.util.ArrayList;

public interface AdministradorFacade {

    void salvar(Administrador adm);

    void remover(int id);

    void editar(Administrador adm);

    ArrayList listarTodos();

    Administrador efeturarLogin(String usuario);

}
