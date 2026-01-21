package utilities;

public class Conversor {

    public static final double IOF = 0.06;

    public static double calcularValorAPagar(double cotaçãoDolar, double dolaresComprados) {
        double valorPagoSemIOF = dolaresComprados * cotaçãoDolar;
        double valorComIOF = valorPagoSemIOF * (1 + IOF);
        return valorComIOF;
    }

}
