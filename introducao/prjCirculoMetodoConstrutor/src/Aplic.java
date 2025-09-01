import java.util.Scanner;

/**
 *
 * @author h-and-rod
 */


public class Aplic {
    public static void main(String[] args) {
        double medidaRaio;
        int opcao;
        String unidadeMedida;
        
        // Instanciação de um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a medida do raio do círculo: ");
        medidaRaio = entrada.nextDouble(); 
        System.out.print("Digite a unidade de medida: ");
        unidadeMedida = entrada.next(); 
        // Instanciação de um objeto da classe Circulo
        Circulo circulo = new Circulo(unidadeMedida);
        circulo.definirRaio(medidaRaio);
        
        do {
            System.out.println("\n\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida do diâmetro");
            System.out.println("4 - Encerrar");
            System.out.print("\n\t\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1) {
                System.out.println("\n\nMedida da área: " + circulo.calcularArea()
                                            + " " + circulo.obterUnidadeMedida() + "²");
            } else if (opcao == 2) {
                System.out.println("\n\nMedida do perímetro: " + circulo.calcularPerimetro()
                                            + " " + circulo.obterUnidadeMedida());
            } else if (opcao == 3) {
                System.out.println("\n\nMedida do diâmetro: " + circulo.calcularDiametro()
                                            + " " + circulo.obterUnidadeMedida());
            }
        } while (opcao < 4);
    }
}

