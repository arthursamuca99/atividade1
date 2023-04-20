import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite a diagonal maior do losango: ");
            double diagonalMaior = input.nextDouble();

            System.out.print("Digite a diagonal menor do losango: ");
            double diagonalMenor = input.nextDouble();

            double area = (diagonalMaior * diagonalMenor) / 2;

            System.out.println("A área do losango é: " + area);
        }
    }

    @Override
    public String toString() {
        return "atividade5 []";
    }
}
