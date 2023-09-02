package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominicio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20,2);

        System.out.println("Resultado: "+resultado);
        System.out.println("-------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(20,0);
    }
}
