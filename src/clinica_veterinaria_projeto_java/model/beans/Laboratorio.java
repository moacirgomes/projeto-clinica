package clinica_veterinaria_projeto_java.model.beans;

public class Laboratorio {
	private long idlabaratorio;
	private String nome;
	
	public Laboratorio(long idlabaratorio, String nome) {
		this.idlabaratorio = idlabaratorio;
		this.nome = nome;
	}

	public long getIdlabaratorio() {
		return idlabaratorio;
	}

	public void setIdlabaratorio(long idlabaratorio) {
		this.idlabaratorio = idlabaratorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
