import fatec.poo.model.Instrutor;
import fatec.poo.model.Cliente;

/**
 *
 * @author h-and-rod
 */
public class Aplic {

    public static void main(String[] args) {

        Instrutor objInstrutor = new Instrutor(131, "José Ribeiro", "(11) 9657-4289");
        objInstrutor.setAreaAtuacao("Musculação");

        System.out.println("## Dados do Instrutor ##");
        System.out.println("Identificação: " + objInstrutor.getIdentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Área de Atuação: " + objInstrutor.getAreaAtuacao());

        System.out.println("\n--------------------------------------------------\n");

        Cliente objCliente = new Cliente("123.456.789-00", "Ana Julia", "(14) 91234-5678");
        objCliente.setPeso(72.5);
        objCliente.setAltura(1.68);
        
        
        System.out.println("## Dados do Cliente ##");
        System.out.println("CPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Altura: " + objCliente.getAltura());
        System.out.println("IMC: " + objCliente.calcIMC());
    }
}