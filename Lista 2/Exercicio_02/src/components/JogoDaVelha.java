package components;

public class JogoDaVelha {

    private char[][] grade;

    private char jogador;
    private int numJogadas;
    private int linha;
    private int coluna;

    public JogoDaVelha() {

        this.grade = new char[3][3];

        for (int i = 0; i < this.grade.length; i++) {
            for (int j = 0; j < this.grade[i].length; j++) {
                this.grade[i][j] = StatusPlace.EMPTY.getSimbolo();
            }
        }

        this.numJogadas = 1;
        this.linha = 0;
        this.coluna = 0;
    }

    public char getJogador() {
        return jogador;
    }

    public void setJogador(char jogador) {
        this.jogador = jogador;
    }

    public int getNumJogadas() {
        return numJogadas;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void exibirGrade() {

        for (int i = 0; i < this.grade.length; i++) {

            System.out.print(" ");
            for (int j = 0; j < this.grade[i].length; j++) {

                System.out.printf("|%2c ", this.grade[i][j]);
            }

            System.out.print("|");
            System.out.println();
            if (i <= 1) {

                for (int k = 0; k < this.grade[i].length; k++) {
                    System.out.print("-----");
                }

                System.out.println();
            }
        }

        System.out.println();
    }

    public void jogar() {

        System.out.println("Entre com valores de 1 a 3, seja para as linhas ou para as colunas.\n");

        boolean terminar = false;
        while (!terminar) {

            if (getNumJogadas() % 2 == 1) {

                System.out.println("Vez do jogador 1...");
                setJogador(StatusPlace.PLAYER_ONE.getSimbolo());
            } else {

                System.out.println("Vez do jogador 2...");
                setJogador(StatusPlace.PLAYER_TWO.getSimbolo());
            }

            this.validarJogada();
            this.exibirGrade();

            if (this.verificarVencedor(StatusPlace.PLAYER_ONE.getSimbolo())) {

                terminar = true;
                System.out.println("Jogador 1 é o vencedor!");
            } else if (this.verificarVencedor(StatusPlace.PLAYER_TWO.getSimbolo())) {

                terminar = true;
                System.out.println("Jogador 2 é o vencedor!");
            } else if (this.verificarEmpate()) {

                terminar = true;
                System.out.println("EMPATE!");
            }
        }
    }

    public void validarJogada() {

        boolean validar = false;
        while (!validar) {

            setLinha(LerDados.lerJogada("Linha"));
            setColuna(LerDados.lerJogada("Coluna"));

            System.out.println();
            if (getLinha() >= 1 && getLinha() <= 3 && getColuna() >= 1 && getColuna() <= 3) {

                this.linha--;
                this.coluna--;

                if (this.grade[getLinha()][getColuna()] == StatusPlace.PLAYER_ONE.getSimbolo() ||
                        this.grade[getLinha()][getColuna()] == StatusPlace.PLAYER_TWO.getSimbolo()) {

                    System.out.println("Posição já preenchida! Tente novamente...");
                } else {

                    validar = true;
                    this.numJogadas++;
                    this.grade[getLinha()][getColuna()] = this.jogador;
                }
            } else {
                System.out.println("Jogada inválida! Tente novamente...");
            }
        }
    }

    public boolean verificarVencedor(char jogador) {

        if ((this.grade[0][0] == jogador && this.grade[0][1] == jogador && this.grade[0][2] == jogador) ||
                (this.grade[1][0] == jogador && this.grade[1][1] == jogador && this.grade[1][2] == jogador) ||
                (this.grade[2][0] == jogador && this.grade[2][1] == jogador && this.grade[2][2] == jogador) ||
                (this.grade[0][0] == jogador && this.grade[1][0] == jogador && this.grade[2][0] == jogador) ||
                (this.grade[0][1] == jogador && this.grade[1][1] == jogador && this.grade[2][1] == jogador) ||
                (this.grade[0][2] == jogador && this.grade[1][2] == jogador && this.grade[2][2] == jogador) ||
                (this.grade[0][0] == jogador && this.grade[1][1] == jogador && this.grade[2][2] == jogador) ||
                (this.grade[0][2] == jogador && this.grade[1][1] == jogador && this.grade[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate() {

        if (getNumJogadas() > 9) {
            return true;
        }
        return false;
    }
}
