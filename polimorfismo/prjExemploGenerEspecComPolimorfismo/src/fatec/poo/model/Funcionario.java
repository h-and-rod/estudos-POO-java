package fatec.poo.model;

/**
 *
 * @author h-and-rod
 */
abstract public class Funcionario {

    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;

    public Funcionario(int r, String n, String dtAdm, String carg) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
        cargo = carg;
    }

    abstract public double calcSalBruto();

    public double calcDesconto() {
        
        return (calcSalBruto() * 0.1);
    }

    public double calcSalLiquido() {
        return (calcSalBruto() - calcDesconto());
    }

    // Getters e Setters
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int r) {
        registro = r;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(String dtAdm) {
        dtAdmissao = dtAdm;
    }

    public String getCargo(){
       return cargo;
    }

    public void setCargo(String carg){
        cargo = carg;
    }
}
