package entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String verificarAprovacao() {
        if (calcularNotaFinal() < 60) {
            return "FAILED";
        } else {
            return "PASS";
        }
    }

    public double calcularPontosRestantes() {
        if (calcularNotaFinal() < 60) {
             double pontosRestantes = 60 - calcularNotaFinal();
             return pontosRestantes;
        }else {
            return 0;
        }
        }
}
