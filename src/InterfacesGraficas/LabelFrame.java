package InterfacesGraficas;
import java.awt.FlowLayout;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame
{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;


    public LabelFrame() {

        super("Test Jlabel");
        setLayout(new FlowLayout());
         label1= new JLabel("label with text");
        label1.setToolTipText("this is tag1");
        add(label1);

        Icon Amy = new ImageIcon(getClass().getResource("Amy.png"));
        label2 = new JLabel("label with text and icon",Amy, SwingConstants.LEFT);
        label2.setToolTipText("this is tag2");
        add(label2);

        label3 = new JLabel();
        label3.setToolTipText("label with icon and text at the bottom");
        label3.setIcon(Amy);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("this is tag3");
        add(label3);
    }

}
