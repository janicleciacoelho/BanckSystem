package banco.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, int numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado (sem taxa)");
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }
}
