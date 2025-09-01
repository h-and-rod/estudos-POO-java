/**
 *
 * @author h-and-rod
 */


public class Circulo {
    private double raio;
    private String unidadeMedida;

    public Circulo(String unMedida) {
        unidadeMedida = unMedida;
    }

    public String obterUnidadeMedida() {
        return unidadeMedida;
    }

    public void definirRaio(double medRaio) {
        raio = medRaio;
    }

    public double obterRaio() {
        return raio;
    }

    public double calcularPerimetro() {
        return (2 * 3.14 * raio);
    }

    public double calcularArea() {
        return (3.14 * Math.pow(raio, 2));
    }

    public double calcularDiametro() {
        return (2 * raio);
    }
}
