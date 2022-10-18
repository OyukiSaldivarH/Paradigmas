package InterfacesGraficas.Marcoboton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoBoton extends JFrame {
    private final  JButton botonJButtonSimple;
    private final  JButton getBotonJButtonElegante;

    public MarcoBoton() {
        super("button test");
        setLayout(new FlowLayout());
        botonJButtonSimple = new JButton("single button");
        add(botonJButtonSimple);
        Icon Pato1 = new ImageIcon(getClass().getResource("Pato1.gif"));
        Icon Pato2 = new ImageIcon(getClass().getResource("Pato2.gif"));
        getBotonJButtonElegante = new JButton("elegant button", Pato1);
        getBotonJButtonElegante.setRolloverIcon(Pato2);
        add(getBotonJButtonElegante);
        ManejadorBoton manejador = new ManejadorBoton();
        getBotonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    private class ManejadorBoton implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent evento)
        {
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("you oppressed: %s", evento.getActionCommand()));
        }
    }
}

