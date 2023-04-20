import javax.swing.JOptionPane;

public class joption4 {
  public static void main(String[] args) {
    String salarioStr = JOptionPane.showInputDialog("Digite o salário do funcionário:");
    double salario = Double.parseDouble(salarioStr);

    double novoSalario = salario * 1.25;

    JOptionPane.showMessageDialog(null, "O novo salário do funcionário é: " + novoSalario);
  }
}