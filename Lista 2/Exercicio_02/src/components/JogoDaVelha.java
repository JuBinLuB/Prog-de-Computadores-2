package components;

import java.util.Scanner;

public class JogoDaVelha {

    Scanner scan = new Scanner(System.in);

    private char[][] grade;

    private char jogadorOne;
    private char jogadorTwo;
    private char jogador;
    private int jogada;
    private int linha;
    private int coluna;
    private boolean terminar;

    public JogoDaVelha() {

        this.grade = new char[3][3];

        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                this.grade[i][j] = StatusPlace.EMPTY.getSimbolo();
            }
        }

        this.jogadorOne = StatusPlace.PLAYER_ONE.getSimbolo();
        this.jogadorTwo = StatusPlace.PLAYER_TWO.getSimbolo();

        this.jogada = 1;
        this.linha = 0;
        this.coluna = 0;
        this.terminar = false;
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
    }

    public void jogar() {

        System.out.println("Faça sua jogada inserindo valores de 1 a 3, para as linhas e para as colunas...\n");

        while (!terminar) {

            if (jogada % 2 == 1) {

                System.out.println("Vez do jogador 1...");
                this.jogador = jogadorOne;
            } else {

                System.out.println("Vez do jogador 2...");
                this.jogador = jogadorTwo;
            }

            boolean valida = false;

            while (!valida) {

                System.out.print("Linha: ");
                linha = scan.nextInt();
                System.out.print("Coluna: ");
                coluna = scan.nextInt();

                System.out.println();

                if (linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3) {

                    linha--;
                    coluna--;

                    if (grade[linha][coluna] == jogadorOne || grade[linha][coluna] == jogadorTwo) {

                        System.out.println("Jogada inválida! Tente novamente...");
                    } else {

                        valida = true;
                    }
                }
            }

            exibirGrade();

            System.out.println();
            this.jogada++;

            verificarVencedor();
        }
    }

    public void verificarVencedor() {

        if (this.jogada >= 5 && this.jogada < 10) {

            if ((grade[0][0] == this.jogadorOne && grade[0][1] == this.jogadorOne && grade[0][2] == this.jogadorOne) ||
                (grade[1][0] == this.jogadorOne && grade[1][1] == this.jogadorOne && grade[1][2] == this.jogadorOne) ||
                (grade[2][0] == this.jogadorOne && grade[2][1] == this.jogadorOne && grade[2][2] == this.jogadorOne) ||
                (grade[0][0] == this.jogadorOne && grade[1][0] == this.jogadorOne && grade[2][0] == this.jogadorOne) ||
                (grade[0][1] == this.jogadorOne && grade[1][1] == this.jogadorOne && grade[2][1] == this.jogadorOne) ||
                (grade[0][2] == this.jogadorOne && grade[1][2] == this.jogadorOne && grade[2][2] == this.jogadorOne) ||
                (grade[0][0] == this.jogadorOne && grade[1][1] == this.jogadorOne && grade[2][2] == this.jogadorOne) ||
                (grade[0][2] == this.jogadorOne && grade[1][1] == this.jogadorOne && grade[2][0] == this.jogadorOne)) {

                System.out.println("Jogador 1 é o vencedor!");
                this.terminar = true;
            }
            if ((grade[0][0] == this.jogadorTwo && grade[0][1] == this.jogadorTwo && grade[0][2] == this.jogadorTwo) ||
                (grade[1][0] == this.jogadorTwo && grade[1][1] == this.jogadorTwo && grade[1][2] == this.jogadorTwo) ||
                (grade[2][0] == this.jogadorTwo && grade[2][1] == this.jogadorTwo && grade[2][2] == this.jogadorTwo) ||
                (grade[0][0] == this.jogadorTwo && grade[1][0] == this.jogadorTwo && grade[2][0] == this.jogadorTwo) ||
                (grade[0][1] == this.jogadorTwo && grade[1][1] == this.jogadorTwo && grade[2][1] == this.jogadorTwo) ||
                (grade[0][2] == this.jogadorTwo && grade[1][2] == this.jogadorTwo && grade[2][2] == this.jogadorTwo) ||
                (grade[0][0] == this.jogadorTwo && grade[1][1] == this.jogadorTwo && grade[2][2] == this.jogadorTwo) ||
                (grade[0][2] == this.jogadorTwo && grade[1][1] == this.jogadorTwo && grade[2][0] == this.jogadorTwo)) {

                System.out.println("Jogador 2 é o vencedor!");
                this.terminar = true;
            }

        } else if (this.jogada > 9) {

            System.out.println("EMPATE!");
            this.terminar = true;
        }
    }
}
