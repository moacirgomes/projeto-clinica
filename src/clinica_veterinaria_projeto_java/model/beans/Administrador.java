package clinica_veterinaria_projeto_java.model.beans;


public class Administrador {
	private Integer id;
	private String nome;
	private String usuario;
	private String senha;
	
	
	
	public Administrador() {
		
	}

	public Administrador( String nome, String usuario, String senha) {
		
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
        
        public Administrador(Integer id, String nome, String usuario, String senha) {
		
                this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
