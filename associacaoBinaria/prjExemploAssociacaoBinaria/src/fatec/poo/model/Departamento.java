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
    
}
