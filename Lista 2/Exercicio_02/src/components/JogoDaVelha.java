package components;

public class JogoDaVelha {

    private char[][] grade;

    private char jogadorOne = StatusPlace.PLAYER_ONE.getSimbolo();
    private char jogadorTwo = StatusPlace.PLAYER_TWO.getSimbolo();

    private int jogada;
    private boolean terminar;

    public JogoDaVelha() {

        grade = new char[3][3];

        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                grade[i][j] = StatusPlace.EMPTY.getSimbolo();
            }
        }

        jogada = 1;
        terminar = false;
    }

    public char[][] getGrade() {
        return this.grade;
    }

    public char getJogadorOne() {
        return this.jogadorOne;
    }

    public char getJogadorTwo() {
        return this.jogadorTwo;
    }

    public void exibirGrade() {

        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; i++) {

                System.out.print(grade[i][j] + " | ");
            }
        }
    }

    public void jogar(int linha, int coluna) {

        while (!terminar) {

            if (jogada % 2 == 1) {

                System.out.println("Vez do Jogador 1...");
                for (int i = 0; i < grade.length; i++) {
                    for (int j = 0; j < grade.length; j++) {

                        grade[linha][coluna] = jogadorOne;
                        System.out.print(grade[i][j]);
                    }

                    System.out.println();
                    jogada++;
                }

            } else {

                System.out.println("Vez do jogador 2...");
                for (int i = 0; i < grade.length; i++) {
                    for (int j = 0; j < grade[i].length; j++) {

                        grade[linha][coluna] = jogadorTwo;
                        System.out.print(grade[i][j]);
                    }

                    System.out.println();
                    jogada++;
                }

            }
        }

    }

    public void verificarVencedor() {

    }
}
