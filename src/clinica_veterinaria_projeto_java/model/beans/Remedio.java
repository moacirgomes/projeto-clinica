package clinica_veterinaria_projeto_java.model.beans;

public class Remedio {
	private Integer idRemedio;
	private double valor;
	private String nome;
	private int quantidade;
        
        public Remedio(String nome, double valor,  int quantidade) {
		
		this.valor = valor;
		this.nome = nome;
		this.quantidade = quantidade;
		
	}
	public Remedio(Integer idRemedio, String nome, double valor,  int quantidade) {
		this.idRemedio = idRemedio;
		this.valor = valor;
		this.nome = nome;
		this.quantidade = quantidade;
		
	}
	public Integer getIdRemedio() {
		return idRemedio;
	}
	public void setIdRemedio(Integer idRemedio) {
		this.idRemedio = idRemedio;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}
