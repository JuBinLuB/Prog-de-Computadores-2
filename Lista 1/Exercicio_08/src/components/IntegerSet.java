package components;

public class IntegerSet {

    private static int maximo = 50;

    private boolean[] conjunto;

    public IntegerSet() {
        conjunto = new boolean[maximo];

        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = false;
        }
    }

    public static IntegerSet uniao(IntegerSet objeto1, IntegerSet objeto2) {

        IntegerSet uniao = new IntegerSet();

        for (int i = 0; i < maximo; i++) {

            if (objeto1.conjunto[i] || objeto2.conjunto[i]) {
                uniao.conjunto[i] = true;
            }
        }

        return uniao;
    }

    public static IntegerSet intersecao(IntegerSet objeto1, IntegerSet objeto2) {

        IntegerSet intersecao = new IntegerSet();

        for (int i = 0; i < maximo; i++) {

            if (objeto1.conjunto[i] && objeto2.conjunto[i]) {
                intersecao.conjunto[i] = true;
            }
        }

        return intersecao;
    }

    public static IntegerSet diferenca(IntegerSet objeto1, IntegerSet objeto2) {

        IntegerSet diferenca = new IntegerSet();

        for (int i = 0; i < maximo; i++) {

            if (objeto1.conjunto[i] != objeto2.conjunto[i]) {
                diferenca.conjunto[i] = false;
            }
        }

        return diferenca;
    }

    public void inserirElemento(int elemento) {
        conjunto[elemento] = true;
    }

    public void excluirElemento(int elemento) {
        conjunto[elemento] = false;
    }

}
