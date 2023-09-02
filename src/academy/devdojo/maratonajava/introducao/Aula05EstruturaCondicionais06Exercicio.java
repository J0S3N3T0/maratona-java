package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 5;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Hoje é dia "+dia+", logo é final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Hoje é dia "+dia+", logo é dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
