package InterfacesGraficas;

import javax.swing.*;

public class Addition
{
    public static void main(String[] args)
    {
        String firstNumber =
                JOptionPane.showInputDialog("Enter the first integer");
        String secondNumber =
                JOptionPane.showInputDialog("Enter the two interger");
        int Number1 = Integer.parseInt(firstNumber);
        int Number2= Integer.parseInt(secondNumber);
        int Addition = Number1 + Number2;
                JOptionPane.showMessageDialog(null, "the sum is: " + Addition,"sum of two integers",JOptionPane.PLAIN_MESSAGE);

    }
}
