package clinica_veterinaria_projeto_java;

import clinica_veterinaria_projeto_java.model.beans.Administrador;
import clinica_veterinaria_projeto_java.model.dao.AdministradorDao;
import clinica_veterinaria_projeto_java.view.TelaLoginView;


public class Principal {

	public static void main(String[] args) {
            
            
                TelaLoginView tela = new TelaLoginView();
                tela.show();
		//AdministradorDao dao = new AdministradorDao();
		//Administrador adm = new Administrador("Junior Teste", "junior", "123456");
		//dao.salvar(adm);
                //System.out.println(dao.listar());
                
                //LoginController controller = new LoginController();
		//String usuario = txtUsuario.getText();
		//String senha = new String(pwSenha.getPassword());
		//controller.verificarLoginAdm(usuario, senha);
		
		
	}
}
