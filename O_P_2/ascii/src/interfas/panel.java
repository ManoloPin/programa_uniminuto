package interfas;

import CARACTERES.*;///////////////////////////////////////////////////////////
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;

/**
 *
 * @author manuel
 */
public class panel extends JPanel implements ActionListener {

    public String dato;
    public final static String BUSCAR = "Buscar";

    // Ventana principal del programa
    private interfaz principal;

    //-----------------
    //  Atributos de la ventana
    //-----------------
    private JTextField txtDatoB;
    private JLabel labDatoB;
    private JLabel Info;
    private JButton butBuscar;
    private JTextArea resul;

    //------------------------
    // Constructores
    //------------------------
    public panel(interfaz PrincipalP) {

        principal = PrincipalP;

        setLayout(new GridLayout(5, 2));
        setPreferredSize(new Dimension(0, 130));
        TitledBorder border = BorderFactory.createTitledBorder("Datos del vehículo");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        labDatoB = new JLabel("ingrese dato");
        txtDatoB = new JTextField();
        txtDatoB.setPreferredSize(new Dimension(2, 1));
        resul = new JTextArea("hola");
        butBuscar = new JButton("Buscar");
        butBuscar.setActionCommand(BUSCAR);
        butBuscar.addActionListener(this);

        add(labDatoB);
        add(txtDatoB);

//        add(new JLabel(""));
//        add(resul);
        add(new JLabel(""));
        add(butBuscar);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        // TODO Auto-generated method stub
        String comando = evento.getActionCommand();
        if (comando.equals(BUSCAR)) {
            String dato1;
           CONTROL cn = new CONTROL();
           controlador c = new controlador();
           imprimibles im = new imprimibles();
            dato = (txtDatoB.getText());
            dato1 = c.controlador(dato);
            resul.setText(dato1);
           // resul.setText(dato2);
            
            principal.add(this.resul);
        }
    }
}
