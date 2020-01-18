package RachunekKosztów.odchyleniaOdCenEwidencyjnychMateriałów;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    static JTextField textfield1, textfield2, textfield3, textfield4;

    public void setInputs(int x, int y, int z, int i) {

        JFrame f = new JFrame("Text Field Examples");
        f.getContentPane().setLayout(new FlowLayout());
        textfield1 = new JTextField("Text field 1",10);
        textfield2 = new JTextField("Text field 2",10);
        textfield3 = new JTextField("Text field 3",10);
        textfield4 = new JTextField("Text field 4",10);
        f.getContentPane().add(textfield1);
        f.getContentPane().add(textfield2);
        f.getContentPane().add(textfield3);
        f.getContentPane().add(textfield4);

        f.pack();
        f.setVisible(true);
    }



    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }

}