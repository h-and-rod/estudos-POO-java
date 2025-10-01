package fatec.poo.model;

public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios[]; //implementa a multiplicidade 1..*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5]; //matriz de objetos
        
    }
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios[numFunc] = funcionario;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. de Funcionários: " + numFunc );
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for(int i=0; i < numFunc; i++){
            System.out.print(funcionarios[i].getRegistro() + "\t\t");
            System.out.print(funcionarios[i].getNome() + "\t\t");
            System.out.println(funcionarios[i].getCargo() + "\t\t");
        }
    }
    
}
