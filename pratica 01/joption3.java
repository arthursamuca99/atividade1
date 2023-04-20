import javax.swing.JOptionPane;

public class joption3 {
    public static void main(String[] args) {
        String cotacaoStr = JOptionPane.showInputDialog(null, "Digite a cotação do dólar em reais:");
        double cotacao = Double.parseDouble(cotacaoStr);

        String valorDolarStr = JOptionPane.showInputDialog(null, "Digite o valor em dólares:");
        double valorDolar = Double.parseDouble(valorDolarStr);

        double valorReal = valorDolar * cotacao;

        JOptionPane.showMessageDialog(null, "O valor em reais é: " + valorReal);
    }
}