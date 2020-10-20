package clinica_veterinaria_projeto_java.controller;

import java.util.List;

import clinica_veterinaria_projeto_java.model.beans.Administrador;
import clinica_veterinaria_projeto_java.model.facade.impl.AdministradorFacadeImpl;
import javax.swing.JOptionPane;

public class LoginController {
	
	private AdministradorFacadeImpl facade;

	public LoginController() {

		this.facade = new AdministradorFacadeImpl();
	}
	
	public boolean verificarLoginAdm(String usuario, String senha) {
		boolean loginEf = false;
		Administrador adm =  facade.efeturarLogin(usuario);
		
		if(adm.getUsuario() != null) {
			
			if(adm.getSenha().equals(senha) ) {
				loginEf = true;
				
			}else {
                            JOptionPane.showMessageDialog(null,"Senha incorreta!" );
				
			}
			
		}else {
                            JOptionPane.showMessageDialog(null,"Usuario nao existe!" );

			
		}
                return loginEf;
	}
	

}
