package clinica_veterinaria_projeto_java.model.beans;

public class Veterinario {
	private Integer idVeterinario;
	private String nome;
	private String crmv;
	private String especialista;
	
	public Veterinario() {
		
	}
	public Veterinario(String nome, String crmv, String especialista) {
		this.nome = nome;
		this.crmv = crmv;
		this.especialista = especialista;
	}
        
        public Veterinario(Integer id,String nome, String crmv, String especialista) {
            this.idVeterinario = id;	
            this.nome = nome;
            this.crmv = crmv;
            this.especialista = especialista;
	}

	public Integer getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(Integer idVeterinario) {
		this.idVeterinario =  idVeterinario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getEspecialista() {
		return especialista;
	}

	public void setEspecialista(String especialista) {
		this.especialista = especialista;
	}

	
}
