package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais04Exercicio {
    public static void main(String[] args) {

        double salarioAnual = 10000;
        double primeiraFaixa = 9.78 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorComImposto;
        String porcentagemDeImposto = "";

        if(salarioAnual <= 34712){

            valorComImposto = salarioAnual * primeiraFaixa;

            porcentagemDeImposto = "Seu salario bruto é "+salarioAnual+" euros anualmente," +
                    " nessa faixa salarial você paga "+(primeiraFaixa * 100)+" de impostos."+
                    "\nVocê irá pagar "+valorComImposto+" euros em impostos."+
                    "\nValor final depois dos impostos: "+(salarioAnual - valorComImposto)+" euros.";

        } else if (salarioAnual > 34712 && salarioAnual <= 68507){

            valorComImposto = salarioAnual * segundaFaixa;

            porcentagemDeImposto = "Seu salario bruto é "+salarioAnual+" euros anualmente," +
                    " nessa faixa salarial você paga "+(segundaFaixa * 100)+" de impostos."+
                    "\nVocê irá pagar "+valorComImposto+" euros em impostos."+
                    "\nValor final depois dos impostos: "+(salarioAnual - valorComImposto)+" euros.";

        }else{

            valorComImposto = salarioAnual * terceiraFaixa;

            porcentagemDeImposto = "Seu salario bruto é "+salarioAnual+" euros anualmente," +
                    " nessa faixa salarial você paga "+(terceiraFaixa * 100)+" de impostos."+
                    "\nVocê irá pagar "+valorComImposto+" euros em impostos."+
                    "\nValor final depois dos impostos: "+(salarioAnual - valorComImposto)+" euros.";

        }
        System.out.println(porcentagemDeImposto);
    }
}
