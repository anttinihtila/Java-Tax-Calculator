import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TaxCalculator {

    public static void main(String[] args) {
        String num1, num2;
        float n1, n2, tax, nontax;

        num1 = JOptionPane.showInputDialog(null, "Price?", "Tax Calculator", JOptionPane.QUESTION_MESSAGE);
        n1 = Float.parseFloat(num1);

        num2 = JOptionPane.showInputDialog(null, "Tax percent?", "Tax Calculator", JOptionPane.QUESTION_MESSAGE);
        n2 = Float.parseFloat(num2);

        tax=n1*n2/100;
        nontax=n1-tax;

        JOptionPane.showMessageDialog(null, "Tax: " +tax +" e\n" +"Price without tax: " +nontax +" e", "Tax Calculator", JOptionPane.PLAIN_MESSAGE );

        System.exit(0);
    }
}
