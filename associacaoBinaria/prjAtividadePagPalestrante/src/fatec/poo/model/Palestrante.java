package fatec.poo.model;

public class Palestrante extends Pessoa {
    private String empresa;
    private double taxaCobranca;
    private Palestra[] palestras;
    private int indicePalestra;
    
    public Palestrante(String cpf, String nome, String empresa) {
        super(cpf, nome);
        this.empresa = empresa;
        this.palestras = new Palestra[100]; // tamanho fixo, pode ser ajustado
        this.indicePalestra = 0;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca;
    }

    public void addPalestra(Palestra palestra){
        palestras[indicePalestra] = palestra;
        indicePalestra++;
    }

    public double calcTotalReceberPalestras(){
        double totalFaturado = 0;

        for(int i = 0; i < indicePalestra; i++){
            totalFaturado += palestras[i].calcTotalFaturado();
        }

        return totalFaturado;
    }
    

    
}
