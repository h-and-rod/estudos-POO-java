import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 * @author h-and-rod
 */
public class Aplic {
    public static void main(String[] args) {
        System.out.println("\n"); //pula a primeira linha no terminal para melhor visualização
        FuncionarioHorista funcHor = new FuncionarioHorista(
            123,
            "José Guimarães",
            "24/02/1970",
            25.3,
            "Pedreiro");
            
        funcHor.setQtdHorTrab(90);
        
        System.out.println("Dados " + funcHor.getNome() + ":");
        System.out.println("Salário bruto: " + funcHor.calcSalBruto());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Salário líquido: " + funcHor.calcSalLiquido());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("Gratificação: " + funcHor.calcGratificacao());
        System.out.println(""); //pula uma linha no terminal para melhor visualização
        
        FuncionarioMensalista funcMens = new FuncionarioMensalista(
            124,
            "Junior Augusto",
            "12/10/1972",
            1045,
            3,
            "Astronauta");
            
            System.out.println("Dados " + funcMens.getNome() + ":");
            System.out.println("Salário bruto: " + funcMens.calcSalBruto());
            System.out.println("Desconto: " + funcMens.calcDesconto());
            System.out.println("Salário líquido: " + funcMens.calcSalLiquido());
            System.out.println("Cargo: " + funcMens.getCargo());
            

    }
}