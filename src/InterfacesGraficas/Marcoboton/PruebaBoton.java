package InterfacesGraficas.Marcoboton;

import javax.swing.*;

public class PruebaBoton {
    public static void main(String[] args) {
        MarcoBoton marcoBoton = new MarcoBoton();
        marcoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBoton.setSize(275,110);
        marcoBoton.setVisible(true);
    }
}
