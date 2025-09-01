public class ContaCorrente {
    private int numero;
    private double saldo;

    public ContaCorrente(int num, double sal) {
        numero = num;
        saldo = sal;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("\nSaque realizado com sucesso!");
        } else {
            System.out.println("\nSaldo insuficiente ou valor inválido!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }
}