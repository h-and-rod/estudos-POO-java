import faculdade.poo.model.Aluno; //importa as coisas da classe Aluno - se faz necessário, pois 
                                    // o arquivo Aplic não está na mesma pasta que Aluno

import faculdade.poo.model.Professor; //importa as coisas da classe Professor

/**
 *
 * @author h-and-rod
 */
public class Aplic {

    public static void main(String[] args) {

        Aluno objAlu = new Aluno(1010, "Carlos Silveira", "15/03/1978"); //instanciação do objeto aluno
        objAlu.setMensalidade(1500);

        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());

        System.out.println("\n--------------------------------------------------\n");

        Professor objProf = new Professor(15231, "Alessandro Almeida", "12/05/1960"); //instanciação do objeto aluno
        objProf.setSalario(3500);
        System.out.println("Registro funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de nascimento: " + objProf.getDataNascimento());
        System.out.println("Salario: " + objProf.getSalario());
    }
    
}
