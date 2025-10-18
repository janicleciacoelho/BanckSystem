package banco.model;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(String agencia, int numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 0.50; // taxa fixa por saque
        if (valor + taxa <= saldo) {
            saldo -= (valor + taxa);
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + taxa);
            return true;
        }
        System.out.println("Saldo insuficiente para saque com taxa.");
        return false;
    }

    @Override
    public double getValorImposto() {
        return saldo * 0.01; // 1% de imposto sobre o saldo
    }
}
