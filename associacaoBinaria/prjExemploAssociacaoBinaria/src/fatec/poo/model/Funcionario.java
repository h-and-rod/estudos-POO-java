package fatec.poo.model;

/**
 *
 * @author Dimas + h-and-rod
 */
abstract public class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;  
    private String cargo;
    private Departamento departamento;
    private Projeto projeto;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;  
    }   
    
    public int getRegistro(){
        return(registro);
    }
    public String getNome(){
        return(nome);
    }
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    public String getCargo(){
        return(cargo);
    }
    public void setCargo(String c){
        cargo = c;
    }
    
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }   
}
