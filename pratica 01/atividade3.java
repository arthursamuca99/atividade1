import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacao = input.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = input.nextDouble();

        double valorReal = valorDolar * cotacao;

        System.out.println("O valor em reais é: " + valorReal);

        input.close();
    }
}