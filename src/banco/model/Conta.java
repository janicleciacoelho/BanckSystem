package banco.model;

public abstract class Conta {
    private String agencia;
    private int numero;
    protected double saldo; // protegido para uso das subclasses

    public Conta(String agencia, int numero, double saldoInicial) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }

    // método que será sobrescrito nas subclasses
    public abstract boolean sacar(double valor);
}
