package interfas;

import CARACTERES.imprimibles;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author manuel
 */
public class interfaz extends JFrame {
    imprimibles im = new imprimibles();

private JTextField txtDatoB;
    private JTextArea resultado;
    
    private final panel panel1;
   

    public interfaz() throws Exception {

        setTitle("Calculos de Impuestos");
        setSize(290, 230);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        resultado = new JTextArea();
        resultado.setFocusable(false);
        resultado.setForeground(Color.BLUE);
        resultado.setBackground(Color.BLACK);
        //resultado.setText(im.imprimibles(txtDatoB));
   
        add(resultado);

        panel1 = new panel(this);
        add(panel1, BorderLayout.NORTH);

    }
    
}
