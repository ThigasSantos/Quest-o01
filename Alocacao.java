package br.edu.ifnmg.poo.thiagoevangelistadossantos.av02.impl01.questao01;

import java.time.LocalDate;

public class Alocacao {

    private LocalDate dataEntrada;

    private LocalDate DataSaida;

    private Desenvolvedor desenvolvedor;

    public Alocacao(LocalDate dataEntrada, LocalDate DataSaida, Desenvolvedor desenvolvedor) {
        this.dataEntrada = dataEntrada;
        this.DataSaida = DataSaida;
        this.desenvolvedor = desenvolvedor;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return DataSaida;
    }

    public void setDataSaida(LocalDate DataSaida) {
        this.DataSaida = DataSaida;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    @Override
    public String toString() {
        return "\nAlocacao{" + "dataEntrada=" + dataEntrada
                + ", DataSaida=" + DataSaida
                + ", desenvolvedor=" + desenvolvedor.getNome() + "}";
    }

}
