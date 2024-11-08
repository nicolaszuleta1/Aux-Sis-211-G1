import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{
    
    private JLabel label;
    private JLabel labelS;
    private JRadioButton opcion1;
    private JRadioButton opcion2;
    private JButton button;

    public Ventana(){
        setSize(300, 200);
        setTitle("Ejemplo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Seleccione una opcion: ");
        labelS = new JLabel("Ninguna opcion ha sido seleccionada");
        opcion1 = new JRadioButton("Opcion 1");
        opcion2 = new JRadioButton("Opcion 2");
        button = new JButton("Click Aquí");

        ButtonGroup agrupar = new ButtonGroup();

        agrupar.add(opcion1);
        agrupar.add(opcion2);

        opcion1.addActionListener(this);
        opcion2.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));
        panel.add(label);
        panel.add(opcion1);
        panel.add(opcion2);
        panel.add(labelS);
        //panel.add(button);

        add(panel);

    }
    public void actionPerformed(ActionEvent e){
        if(opcion1.isSelected()){
            labelS.setText("Opcion 1 seleccionada");
        }
        else if(opcion2.isSelected()){
            labelS.setText("Opcion 2 seleccionada");
        }
    }
    
}
