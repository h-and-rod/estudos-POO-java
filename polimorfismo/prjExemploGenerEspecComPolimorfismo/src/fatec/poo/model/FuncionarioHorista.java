package fatec.poo.model;

/**
 *
 * @author h-and-rod
 */

public class FuncionarioHorista extends Funcionario {

    private double valHorTrab;
    private int qtdeHorTrab;
    

    public FuncionarioHorista(int r, String n, String dtAdm, double vht, String carg) {
        super(r, n, dtAdm, carg); // construtor da superclasse
        valHorTrab = vht;
    }

    public double calcGratificacao(){
        return (calcSalBruto() * 0.075);
    }

    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }

    public void setQtdHorTrab(int qht) {
        qtdeHorTrab = qht;
    }

    
    public double calcSalBruto() {
        return qtdeHorTrab * valHorTrab;
    }

    
    public double getValHorTrab() {
        return valHorTrab;
    }

    public int getQtdHorTrab() {
        return qtdeHorTrab;
    }
}
