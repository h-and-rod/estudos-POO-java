package faculdade.poo.model;

/**
 *
 * @author h-and-rod
 */

public class Aluno extends Pessoa{ //estabelece vínculo de herança
				   //entre classe e subclasse
    
    private int regEscolar;
    private double mensalidade;

    public Aluno(int re, String n, String dn){
        super(n, dn); //chamada do método construtor
                      //herdado da super classe
                      
        regEscolar = re;
    }

    public void setMensalidade(double m){
        mensalidade = m;
    }

    public int getRegEscolar(){
        return regEscolar;
    }

    public double getMensalidade(){
        return mensalidade;
    }
}
