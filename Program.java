package br.edu.ifnmg.poo.thiagoevangelistadossantos.av02.impl01.questao01;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Desenvolvedor dev[] = new Desenvolvedor[3];
        Projeto proj[] = new Projeto[2];
        Alocacao aloc[] = new Alocacao[4];

        dev[0] = new Desenvolvedor(1000001L, "Desenvolvedor1", "desenvolvedor1@gmail.com");
        dev[1] = new Desenvolvedor(2000002L, "Desenvolvedor2", "desenvolvedor2@gmail.com");
        dev[2] = new Desenvolvedor(3000003L, "Desenvolvedor3", "desenvolvedor3@gmail.com");

        proj[0] = new Projeto(LocalDate.of(2020, 10, 10), LocalDate.of(2020, 10, 30));
        proj[1] = new Projeto(LocalDate.of(2020, 10, 15), LocalDate.of(2020, 12, 20));

        aloc[0] = new Alocacao(LocalDate.of(2020, 10, 10), LocalDate.of(2020, 10, 30), dev[0]);
        aloc[1] = new Alocacao(LocalDate.of(2020, 10, 15), LocalDate.of(2020, 10, 25), dev[1]);
        aloc[2] = new Alocacao(LocalDate.of(2020, 10, 15), null, dev[0]);
        aloc[3] = new Alocacao(LocalDate.of(2020, 10, 20), null, dev[2]);

        proj[0].setAlocacao(new Alocacao[]{aloc[0], aloc[1]});
        proj[1].setAlocacao(new Alocacao[]{aloc[2], aloc[2]});

        System.out.println(proj[0] + "\n");
        System.out.println(proj[1] + "\n");
        System.out.println("VALIDACAO:\n" + dev[0] + "\n" + dev[1] + "\n" + dev[2]);
        System.out.println("\n" + aloc[0] + aloc[1] + aloc[2] + aloc[3]);
    }

}
