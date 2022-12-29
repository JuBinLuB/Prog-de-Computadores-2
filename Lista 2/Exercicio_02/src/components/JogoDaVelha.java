package components;

public class JogoDaVelha {

    private StatusPlace[][] grade;

    private StatusPlace jogadorOne = StatusPlace.PLAYER_ONE;
    private StatusPlace jogadorTwo = StatusPlace.PLAYER_TWO;

    private boolean terminar;

    public JogoDaVelha() {

        grade = new StatusPlace[3][3];

        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                grade[i][j] = StatusPlace.EMPTY;
            }
        }

        terminar = false;
    }

    public StatusPlace[][] getGrade() {
        return this.grade;
    }

    public StatusPlace getJogadorOne() {
        return this.jogadorOne;
    }

    public StatusPlace getJogadorTwo() {
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

            System.out.println("Vez do Jogador 1...");
            for (int i = 0; i < grade.length; i++) {
                for (int j = 0; j < grade.length; j++) {

                    grade[linha][coluna] = jogadorOne;
                    System.out.println(grade[i][j]);
                }
            }

            System.out.println("Vez do jogador 2...");
            
        }

    }

    public void verificarVencedor() {

    }
}
