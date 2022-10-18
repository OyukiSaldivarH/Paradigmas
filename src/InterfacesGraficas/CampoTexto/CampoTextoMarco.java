package InterfacesGraficas.CampoTexto;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import  javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField PasswordField;


    public CampoTextoMarco() {
        super("Test JTextField and JPasswordField");
        setLayout(new FlowLayout());

        campoTexto1 = new JTextField(10);
        add(campoTexto1);

        campoTexto2 = new JTextField("write the text here");
        add(campoTexto2);

        campoTexto3 = new JTextField("non-editable text field", 21);
        campoTexto3.setEditable(false);
        add(campoTexto3);

        PasswordField = new JPasswordField("hidden text");
        add(PasswordField);
        TextFieldHandler handler = new TextFieldHandler();
        campoTexto1.addActionListener(handler);
        campoTexto2.addActionListener(handler);
        PasswordField.addActionListener(handler);
    }

        private class TextFieldHandler implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent event){
                String cadena = "";

                if (event.getSource() == campoTexto1)
                    cadena = String.format("textField1: %s", event.getActionCommand());

    else if (event.getSource() == campoTexto2)
        cadena = String.format("textField2: %s",event.getActionCommand());

    else if (event.getSource()== campoTexto3)
        cadena = String.format("TextFiel3: %s",event.getActionCommand());

    JOptionPane.showMessageDialog(null,cadena);

            }



    }
}
