import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o ano de nascimento: ");
            int anoNascimento = input.nextInt();
            System.out.print("Digite o ano atual: ");
            int anoAtual = input.nextInt();
            int idadeAtual = anoAtual - anoNascimento;
            System.out.println("A idade da pessoa no ano atual é: " + idadeAtual);
            int idade2050 = 2050 - anoNascimento;
            System.out.println("A idade da pessoa em 2050 será: " + idade2050);
        }
    }

    @Override
    public String toString() {
        return "Idade []";
    }
}