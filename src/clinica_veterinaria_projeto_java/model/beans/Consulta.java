package clinica_veterinaria_projeto_java.model.beans;

import java.sql.Date;

public class Consulta {
	private Integer idConsulta;
	private String resumo;
	private String tipoConsulta;
	private Date dataConsulta;
	
	public Consulta() {
		
	}
	public Consulta(Integer idConsulta, String resumo, String tipoConsulta, Date dataConsulta) {
		
		this.idConsulta = idConsulta;
		this.resumo = resumo;
		this.tipoConsulta = tipoConsulta;
		this.dataConsulta = dataConsulta;
	}
	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	

}
