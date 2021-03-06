package clinica_veterinaria_projeto_java.model.beans;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Animal {

    private Integer idAnimal;
    private String nome;
    private String cor;
    private String raca;
    private Date dataNascimento;
    private String obeservacao;
    private String sexo;
    private Integer idCliente;

    public Animal() {

    }

    public Animal(Integer id, String nome, String cor, String raca, Date dataNascimento, String obeservacao, String sexo, Integer idCliente) {
        this.idAnimal = id;
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.obeservacao = obeservacao;
        this.sexo = sexo;
        this.idCliente = idCliente;
    }

    public Animal(String nome, String cor, String raca, Date dataNascimento, String obeservacao, String sexo, Integer idCliente) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.obeservacao = obeservacao;
        this.sexo = sexo;
        this.idCliente = idCliente;
    }

    public Integer getId() {
        return idAnimal;
    }

    public void setId(Integer id) {
        this.idAnimal = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getObeservacao() {
        return obeservacao;
    }

    public void setObeservacao(String obeservacao) {
        this.obeservacao = obeservacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade(Date dataNascimento) {
        LocalDate dataNasc = LocalDateTime.ofInstant(dataNascimento.toInstant(), ZoneId.systemDefault()).toLocalDate();
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNasc.getYear();
    }
    
     public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    

}
