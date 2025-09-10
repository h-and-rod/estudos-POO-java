package fatec.poo.model;
/**
 *
 * @author h-and-rod
 */

public class Instrutor extends Pessoa {
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int id, String nm, String tl ){
        super(nm,tl);
        identificacao = id;
    }
    
    public void setAreaAtuacao(String area){
        areaAtuacao = area;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
}
