package fatec.poo.model;

/**
 *
 * @author h-and-rod
 */

public class Pessoa {
    private String nome;
    private String telefone;
    
    public Pessoa(String nm, String tl){
        nome = nm;
        telefone = tl;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    

}
