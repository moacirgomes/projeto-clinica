package clinica_veterinaria_projeto_java.model.beans;

public class Cliente {
	private Integer clinte;
	private String nome;
	private String endreco;
	private String telefone;
	private String email;
	private String cpf;
	
	public Cliente() {
		
	}
	public Cliente(Integer clinte, String nome, String endreco, String telefone, String email, String cpf) {
		this.clinte = clinte;
		this.nome = nome;
		this.endreco = endreco;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
	}
	public Integer getIdClinte() {
		return clinte;
	}
	public void setIdClinte(Integer clinte) {
		this.clinte = clinte;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndreco() {
		return endreco;
	}
	public void setEndreco(String endreco) {
		this.endreco = endreco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
