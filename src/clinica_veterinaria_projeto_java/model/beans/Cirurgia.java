package clinica_veterinaria_projeto_java.model.beans;

import java.sql.Date;

public class Cirurgia {
	private long idCirurgia;
	private Date data;
	private String procedimentocirugico;
	
	public Cirurgia() {
		
	}
	public Cirurgia(long id, Date data, String procedimentocirugico) {
		this.idCirurgia = id;
		this.data = data;
		this.procedimentocirugico = procedimentocirugico;
	}
	public long getId() {
		return idCirurgia;
	}
	public void setId(long id) {
		this.idCirurgia = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getProcedimentocirugico() {
		return procedimentocirugico;
	}
	public void setProcedimentocirugico(String procedimentocirugico) {
		this.procedimentocirugico = procedimentocirugico;
	}
	

}
