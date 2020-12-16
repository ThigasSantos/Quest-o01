package br.edu.ifnmg.poo.thiagoevangelistadossantos.av02.impl01.questao01;

public class Desenvolvedor {

    private Long cpf;

    private String nome;

    private String email;

    public Desenvolvedor(Long cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + '}';
    }

}
