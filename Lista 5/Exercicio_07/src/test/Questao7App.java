package test;

import components.ContaB;
import components.ContaException;

public class Questao7App {
    public static void main(String[] args) throws Exception {

        ContaB minhaConta = new ContaB(2L, "Hidetaka Miyazaki");

        minhaConta.setSaldo(5.55);
        minhaConta.setLimite(200);
        minhaConta.depositar(100);

        try {
            minhaConta.sacar(1000);
        } catch (ContaException e) {

            // 5. Por fim...
            // 5. Chamando o método getSaldoRecuperado de ContaException dentro do catch.
            System.out.println("Saldo atual: " + e.getSaldoRecuperado());
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}
