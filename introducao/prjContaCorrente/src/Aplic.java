import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = input.nextInt();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = input.nextDouble();

        ContaCorrente conta = new ContaCorrente(numero, saldo);

        int opcao;
        do {
            System.out.println("\n\n--- Menu ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.print("\n\nDigite o valor para depósito: ");
                double valorDeposito = input.nextDouble();
                conta.depositar(valorDeposito);

            } else if (opcao == 2) {
                System.out.print("\n\nDigite o valor para saque: ");
                double valorSaque = input.nextDouble();
                conta.sacar(valorSaque);

            } else if (opcao == 3) {
                System.out.println("Número da conta: " + conta.getNumero());
                System.out.println("\n\n__________________________\n");
                System.out.println("Saldo atual: R$ " + conta.getSaldo());
                System.out.println("__________________________");

            } else if (opcao == 4) {
                System.out.println("Encerrando o programa...");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);
    }
}
