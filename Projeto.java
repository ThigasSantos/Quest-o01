package br.edu.ifnmg.poo.thiagoevangelistadossantos.av02.impl01.questao01;

import java.time.LocalDate;
import java.util.Arrays;

public class Projeto {

    private LocalDate dataInicio;

    private LocalDate dataTermino;

    private Boolean concluido;

    private Alocacao[] alocacao;

    public Projeto(LocalDate dataInicio, LocalDate dataTermino) {
        this.dataInicio = dataInicio;
        setDataTermino(dataTermino);
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {

        this.dataTermino = dataTermino;
        if (dataTermino == null) {
            this.concluido = false;
        } else if (this.dataTermino.compareTo(LocalDate.now()) <= 0) {
            this.concluido = true;
        } else {
            this.concluido = false;
        }

    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    public Alocacao[] getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Alocacao[] alocacao) {
        this.alocacao = alocacao;
    }

    @Override
    public String toString() {
        return "Projeto{" + "dataInicio="
                + dataInicio + " , dataTermino="
                + dataTermino + ", concluido="
                + concluido + "}" + Arrays.toString(alocacao);
    }

}
