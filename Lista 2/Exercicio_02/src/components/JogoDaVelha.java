package components;

import java.util.Scanner;

public class JogoDaVelha {

    Scanner scan = new Scanner(System.in);

    private char[][] grade;

    private char jogador;
    private int numJogadas;
    private int linha;
    private int coluna;

    public JogoDaVelha() {

        this.grade = new char[3][3];

        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                this.grade[i][j] = StatusPlace.EMPTY.getSimbolo();
            }
        }

        this.numJogadas = 1;
        this.linha = 0;
        this.coluna = 0;
    }

    public void exibirGrade() {

        for (int i = 0; i < grade.length; i++) {

            System.out.print(" ");
            for (int j = 0; j < grade[i].length; j++) {

                this.grade[linha][coluna] = this.jogador;
                System.out.printf("|%2c ", grade[i][j]);
            }

            System.out.print("|");
            System.out.println();
            if (i <= 1) {

                for (int k = 0; k < grade[i].length; k++) {
                    System.out.print("-----");
                }

                System.out.println();
            }
        }

        System.out.println();
    }

    public void jogar() {

        System.out.println("Faça sua jogada atribuindo valores de 1 a 3 para as linhas e para as colunas...\n");

        boolean terminar = false;
        while (!terminar) {

            if (numJogadas % 2 == 1) {

                System.out.println("Vez do jogador 1...");
                this.jogador = StatusPlace.PLAYER_ONE.getSimbolo();
            } else {

                System.out.println("Vez do jogador 2...");
                this.jogador = StatusPlace.PLAYER_TWO.getSimbolo();
            }

            validarJogada();
            exibirGrade();

            if (verificarVencedor(StatusPlace.PLAYER_ONE.getSimbolo())) {

                terminar = true;
                System.out.println("Jogador 1 é o vencedor!");
            } else if (verificarVencedor(StatusPlace.PLAYER_TWO.getSimbolo())) {

                terminar = true;
                System.out.println("Jogador 2 é o vencedor!");
            } else if (verificarEmpate()) {

                terminar = true;
                System.out.println("EMPATE!");
            }
        }
    }

    public void validarJogada() {

        boolean valida = false;
        while (!valida) {

            System.out.print("Linha: ");
            this.linha = scan.nextInt();
            System.out.print("Coluna: ");
            this.coluna = scan.nextInt();

            System.out.println();
            if (linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3) {

                linha--;
                coluna--;

                if (grade[linha][coluna] == StatusPlace.PLAYER_ONE.getSimbolo() ||
                        grade[linha][coluna] == StatusPlace.PLAYER_TWO.getSimbolo()) {

                    System.out.println("Posição já preenchida! Tente novamente...");
                } else {

                    valida = true;
                    this.numJogadas++;
                }
            } else {
                System.out.println("Jogada inválida! Tente novamente...");
            }
        }
    }

    public boolean verificarVencedor(char jogador) {

        if ((grade[0][0] == jogador && grade[0][1] == jogador && grade[0][2] == jogador) ||
                (grade[1][0] == jogador && grade[1][1] == jogador && grade[1][2] == jogador) ||
                (grade[2][0] == jogador && grade[2][1] == jogador && grade[2][2] == jogador) ||
                (grade[0][0] == jogador && grade[1][0] == jogador && grade[2][0] == jogador) ||
                (grade[0][1] == jogador && grade[1][1] == jogador && grade[2][1] == jogador) ||
                (grade[0][2] == jogador && grade[1][2] == jogador && grade[2][2] == jogador) ||
                (grade[0][0] == jogador && grade[1][1] == jogador && grade[2][2] == jogador) ||
                (grade[0][2] == jogador && grade[1][1] == jogador && grade[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate() {

        if (this.numJogadas > 9) {
            return true;
        }
        return false;
    }
}
