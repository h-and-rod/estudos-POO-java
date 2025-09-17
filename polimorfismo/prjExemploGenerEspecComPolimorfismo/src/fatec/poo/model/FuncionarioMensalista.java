package fatec.poo.model;

/**
 *
 * @author h-and-rod
 */
public class FuncionarioMensalista extends Funcionario{
    
    private double valSalMin;
    private double numSalMin;
    
    
    public FuncionarioMensalista(int r, String n, String dtAdm, double vSalMin, double nSalMin, String carg){
        super(r, n, dtAdm, carg);
        valSalMin = vSalMin;
        numSalMin = nSalMin;
        
    }
    
    
    public double calcSalBruto(){
        return valSalMin * numSalMin;
    }    


    public double getValSalMin(){
        return valSalMin;
    }

    public double getNumSalMin(){
        return numSalMin;
    }

    public void setValSalMin(double val){
        valSalMin = val;
    }

    public void setNumSalMin(double num){
        valSalMin = num;
    }

    
}
