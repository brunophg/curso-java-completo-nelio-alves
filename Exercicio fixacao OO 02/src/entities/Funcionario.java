package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double mostrarSalarioLiquido() {
        double salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;

    }

    public void aumentarSalario(double porcentagem) {
        this.salarioBruto += this.salarioBruto * (porcentagem / 100);
    }

    public String toString() {
        return nome + ", Salario Liquido: $" + String.format("%.2f", mostrarSalarioLiquido());
    }

}
