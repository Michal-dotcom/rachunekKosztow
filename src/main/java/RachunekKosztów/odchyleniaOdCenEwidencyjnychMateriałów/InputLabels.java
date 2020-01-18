package RachunekKosztów.odchyleniaOdCenEwidencyjnychMateriałów;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class InputLabels {

    static JTextField textfield1, textfield2, textfield3, textfield4;

    public static void main(String[] args) {

        JFrame f = new JFrame("Text Field Examples");
        f.getContentPane().setLayout(new FlowLayout());
        textfield1 = new JTextField("",10);
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
}

