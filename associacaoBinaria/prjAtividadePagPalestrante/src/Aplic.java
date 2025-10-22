import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;
import fatec.poo.model.Palestra;
import java.text.DecimalFormat;

/**
 *
 * @author h-and-rod
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Palestrante palestrante1 = new Palestrante("12345678910", "Sam Altman", "OpenAI");
        palestrante1.setTaxaCobranca(10.50); 
        
        Participante participante1 = new Participante("11111111111", "João Silva", 'C'); // Comum
        Participante participante2 = new Participante("22222222222", "Maria Santos", 'E'); // Estudante
        Participante participante3 = new Participante("33333333333", "Pedro Costa", 'I'); // Idoso
        Participante participante4 = new Participante("44444444444", "Ana Oliveira", 'E'); // Estudante
        Participante participante5 = new Participante("55555555555", "Carlos Souza", 'C'); // Comum
        
        
        Palestra palestra1 = new Palestra("Inteligência Artificial e o Futuro", 500.00);
        Palestra palestra2 = new Palestra("Inovação Tecnológica", 600.00);
        
        
        palestra1.addParticipante(participante1);
        palestra1.addParticipante(participante2);
        palestra1.addParticipante(participante3);
        
        
        palestra2.addParticipante(participante4);
        palestra2.addParticipante(participante5);
        
        
        palestrante1.addPalestra(palestra1);
        palestrante1.addPalestra(palestra2);
        
        
        System.out.println("CPF palestrante: " + palestrante1.getCpf());
        System.out.println("Nome: " + palestrante1.getNome());
        System.out.println("Taxa de Cobrança: " + df.format(palestrante1.getTaxaCobranca()) + " %");
        System.out.println("Valor total a receber pelas palestras: " + df.format(palestrante1.calcTotalReceberPalestras()));
    }
    
    
}
