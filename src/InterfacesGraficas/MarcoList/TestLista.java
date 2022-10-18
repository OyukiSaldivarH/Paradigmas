package InterfacesGraficas.MarcoList;
import  javax.swing.JFrame;

public class TestLista {



        public static void main(String[] args) {
            MarcoLista marcoList = new MarcoLista();//create ListFrame object
            marcoList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marcoList.setSize(800,600);
            marcoList.setVisible(true);
        }
    }

