package test;

import components.Conta;
import components.ContaExcecao;

public class Questao6App {
    public static void main(String[] args) throws Exception {

        Conta minhaConta = new Conta(1L, "Hidetaka Miyazaki");

        minhaConta.setSaldo(5.55);
        minhaConta.setLimite(200);
        minhaConta.depositar(100);

        try {
            minhaConta.sacar(1000);
        } catch (ContaExcecao e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}
