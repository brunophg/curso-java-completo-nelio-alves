package entities;

public class Retangulo {

    public double largura;
    public double altura;

    public double calcularArea() {
       double area = this.largura * this.altura;
       return area;
    }

    public double calcularPerimetro() {
        double perimetro = (this.altura + this.largura) * 2;
        return perimetro;
    }

    public double calcularDiagonal() {
        double diagonal = Math.sqrt(altura * altura + largura * largura);
        return diagonal;
    }
}
