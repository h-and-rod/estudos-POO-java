package fatec.poo.model;

public class Palestra {
    private String data;
    private String tema;
    private double valor;
    private Participante[] participantes;
    private int indiceParticipante;
    private Palestrante palestrante;

    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
        this.participantes = new Participante[100]; // tamanho fixo, pode ser ajustado
        this.indiceParticipante = 0;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public int getIndiceParticipante() {
        return indiceParticipante;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void addParticipante(Participante participante){
        participantes[indiceParticipante] = participante;
        indiceParticipante++;
    }

    public double calcTotalFaturado(){
        double totalFaturado = 0;
        for (int i = 0; i < indiceParticipante; i++) {
            Participante participante = participantes[i];
            if (participante.getTipo() == 'E') {
                totalFaturado += valor * 0.85;
            } else if (participante.getTipo() == 'I') {
                totalFaturado += valor * 0.8;
            } else {
                totalFaturado += valor;
            }
        }
        return totalFaturado;
    }

    
}
