package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominicio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Goku";
        funcionario.idade= 65;
        funcionario.salario = new double[]{1000, 2000, 3000};

        funcionario.imprimeDados();
    }
}
