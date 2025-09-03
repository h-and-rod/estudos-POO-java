/**
 *
 * @author h-and-rod
 */

public class Livro {
    
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;

    public Livro( int id, String nomeLivro){
        titulo = nomeLivro;
        identificacao = id;
    }

    public void setValMultaDiaria( double valor ){
        valMultaDiaria = valor;
    }

    public int getIdentificacao(){
        return identificacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean getSituacao(){
        return situacao;
    }

    public void emprestar(){
        situacao = true;
    }

    public double devolver(int diasAtraso){
        situacao = false;

        double valorDevido;
        valorDevido = valMultaDiaria * diasAtraso;

        return valorDevido;

    }
}
