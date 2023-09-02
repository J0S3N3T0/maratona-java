package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominicio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        System.out.println("Dados do funcionario !");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario != null) {
            for (int i = 0; i < this.salario.length; i++) {
                System.out.println((i + 1) + "º salario: " + this.salario[i]);
            }
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {



        if (salario == null) {
            return;
        }
        double somatorio = 0;

        for (int i = 0; i < this.salario.length; i++) {
            somatorio += this.salario[i];
        }
        System.out.println("A media salario eh: " + (somatorio / this.salario.length));
    }
}
