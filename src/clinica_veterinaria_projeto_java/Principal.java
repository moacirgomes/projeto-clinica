package clinica_veterinaria_projeto_java;

import clinica_veterinaria_projeto_java.model.beans.Administrador;
import clinica_veterinaria_projeto_java.model.dao.AdministradorDao;


public class Principal {

	public static void main(String[] args) {
		AdministradorDao dao = new AdministradorDao();
		Administrador adm = new Administrador("Junior Silva", "junior", "123456");
		//dao.salvar(adm);
                dao.listar();
                
                //LoginController controller = new LoginController();
		//String usuario = txtUsuario.getText();
		//String senha = new String(pwSenha.getPassword());
		//controller.verificarLoginAdm(usuario, senha);
		
		
	}
}
