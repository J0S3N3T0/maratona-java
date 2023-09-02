package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04Exercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra um quantas vezes ele pode ser parcelado
        // Condição: Valor da Parcela >= 1000

        double valorDoCarro = 10000;

        System.out.println("Com o carro no valor de: R$"+valorDoCarro);

        for (int parcela = 1; parcela < valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+parcela+" no valor R$"+valorParcela);
        }

    }
}
