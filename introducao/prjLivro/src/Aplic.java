import java.util.Scanner;

/**
 *
 * @author h-and-rod
 */

public class Aplic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Insira o título do livro: ");
        String nomeLivro = input.next();
        
        System.out.print("Insira o identificador do livro: ");
        int id = input.nextInt();
        
        System.out.print("Valor a ser cobrado por dia em atraso na entrega do livro: ");
        double valor = input.nextDouble();
        
        Livro livro = new Livro(id, nomeLivro);
        livro.setValMultaDiaria(valor);
        int opcao;
        do {
            System.out.println("\n\n--- Menu ---");
            System.out.println("1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Título do livro: " + livro.getTitulo());
                System.out.println("Identificação do livro: " + livro.getIdentificacao());
                
                String estado = "Disponível";
                if (livro.getSituacao()) {
                    estado = "Emprestado";    
                } else {
                    estado = "Disponível";    
                }

                System.out.println("Estado do livro: " + estado);

            } else if (opcao == 2) {
                if (livro.getSituacao()) {
                    System.out.println("O livro está emprestado!");
                } else {
                    livro.emprestar();
                    System.out.println("O estado do livro foi alterado!");
                }
                
            } else if (opcao == 3) {
                if (livro.getSituacao()) {
                    System.out.print("Insira os dias de atraso para a entrega do livro: ");
                    int diasAtraso = input.nextInt();
                    double multa = livro.devolver(diasAtraso);
                    System.out.println(multa);
                    if(multa>0){
                        System.out.println("O valor devido por conta de atraso é de: R$" + multa);
                    }
                    System.out.println("O livro foi devolvido!");
                } else {
                    System.out.println("O livro já está disponível!");
                }
                
            } else if (opcao == 4) {
                System.out.println("Encerrando o programa...");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);
    }
}

