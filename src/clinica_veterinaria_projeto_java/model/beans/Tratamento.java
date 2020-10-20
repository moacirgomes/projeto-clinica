package clinica_veterinaria_projeto_java.model.beans;

public class Tratamento {
	private long idTratamento;
	private String descricaoTatamento;
	public Tratamento(long idTratamento, String descricaoTatamento) {
		this.idTratamento = idTratamento;
		this.descricaoTatamento = descricaoTatamento;
	}
	public long getIdTratamento() {
		return idTratamento;
	}
	public void setIdTratamento(long idTratamento) {
		this.idTratamento = idTratamento;
	}
	public String getDescricaoTatamento() {
		return descricaoTatamento;
	}
	public void setDescricaoTatamento(String descricaoTatamento) {
		this.descricaoTatamento = descricaoTatamento;
	}
	

}
