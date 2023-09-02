package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;

        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500 para o DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);

    }
}
