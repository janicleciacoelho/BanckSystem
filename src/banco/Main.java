package banco;

import banco.model.*;
import banco.service.CalculadorDeImpostos;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jani Coelho", "123.456.789-00");

        ContaCorrente cc = new ContaCorrente("0001", 101, 1000.0);
        ContaPoupanca cp = new ContaPoupanca("0001", 202, 500.0);

        cliente.adicionarConta(cc);
        cliente.adicionarConta(cp);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo inicial CC: " + cc.getSaldo());
        System.out.println("Saldo inicial CP: " + cp.getSaldo());

        cc.depositar(500);
        cp.depositar(200);

        cc.sacar(100);
        cp.sacar(50);

        cc.transferir(200, cp);

        System.out.println("Saldo final CC: " + cc.getSaldo());
        System.out.println("Saldo final CP: " + cp.getSaldo());

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        calculador.calcular(cc); // ContaCorrente é tributável
    }
}
