import javax.swing.JOptionPane;

public class joption11 {
    public static void main(String[] args) {
        String numStr = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(numStr);

        String tabuada = "";
        for (int i = 1; i <= 10; i++) {
            tabuada += num + " x " + i + " = " + (num * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, tabuada);
    }
}