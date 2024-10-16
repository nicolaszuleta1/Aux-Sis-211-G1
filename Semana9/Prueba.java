package Semana9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prueba extends JFrame{

    public Prueba(){

    //Titulo de la venta
        setTitle("Eventos");
        //Tamaño en pixeles de la ventana
        setSize(550, 520);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Localizacion de la ventana al ejecutar el programa, en este caso en el centro
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 2, 10, 8));
        
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //Creación de un componente JLabel
        JLabel label1 = new JLabel("TextField:");
        //Creación de un componente JTextField
        JTextField textField = new JTextField(30);
        //Creación de un componente JButton
        JButton button = new JButton("Click aquí");
        panel1.add(label1);
        panel1.add(textField);
        panel1.add(button);
    
        
        panel.add(panel1);
        
        add(panel);
        //Mi boton por el momento no hace nada si se presiona, vamos a darle un evento o acción cuando sea presionado
        button.addActionListener(new ActionListener(){
        //Con la funcion de actionPerformed le estamos asignando una acción al boton cuando lo presionen
            public void actionPerformed(ActionEvent e){
                //La accion que le damos es mostrar una pequeña ventana con un JOptionPane que me indique que el boton fue presionado
                JOptionPane.showMessageDialog(null, "Haz hecho click en el boton" + textField.getText());
                //Con esta otra acción cambiaremos el mensaje del TextField
                textField.setText("Boton presionado");
        }
        
        });
    }
     
    
    public static void main(String[] args) {
        
        Prueba p = new Prueba();
        p.setVisible(true);
        
    }
    
}