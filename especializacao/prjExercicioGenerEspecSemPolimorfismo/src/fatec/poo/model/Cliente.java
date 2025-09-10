package fatec.poo.model;

/**
 *
 * @author h-and-rod
 */
public class Cliente extends Pessoa{
    private String cpf;
    private double peso;
    private double altura;
    
    public Cliente(String doc , String nm , String tl ){
        super(nm,tl);
        cpf = doc;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double calcIMC(){
        double imc;
        imc = peso/(altura*altura);
        return imc;
    }
}
