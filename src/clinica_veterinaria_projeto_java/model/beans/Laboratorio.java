package clinica_veterinaria_projeto_java.model.beans;

public class Laboratorio {

    private Integer idLabaratorio;
    private String nome;

    public Laboratorio(Integer idLabaratorio, String nome) {
        this.idLabaratorio = idLabaratorio;
        this.nome = nome;
    }

    public Laboratorio(String nome) {
        this.nome = nome;
    }

    public Integer getIdlabaratorio() {
        return idLabaratorio;
    }

    public void setIdlabaratorio(Integer idLabaratorio) {
        this.idLabaratorio = idLabaratorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
