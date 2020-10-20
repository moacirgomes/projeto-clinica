package clinica_veterinaria_projeto_java.model.beans;

public class Exame {
	private long idExame;
	private String descricaoExame;
	
	public Exame() {
		
	}
	public Exame(long idExame, String descricaoExame) {
		this.idExame = idExame;
		this.descricaoExame = descricaoExame;
		
	}
	public long getIdExame() {
		return idExame;
	}
	public void setIdExame(long idExame) {
		this.idExame = idExame;
	}
	public String getDescricaoExame() {
		return descricaoExame;
	}
	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
	}
	

}
