import javax.swing.*;
import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String entrada = JOptionPane.showInputDialog(null, "Introduce el radio de un círculo:");
        int num = Integer.parseInt(entrada);
        double radio = Math.pow(num, 2);
        double area = Math.PI*radio;
        JOptionPane.showMessageDialog(null,
                "El radio del círculo es " + radio + " y su área " + area + ".");
    }
}
