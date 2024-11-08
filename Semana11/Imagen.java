import java.awt.*;

import javax.swing.*;

public class Imagen extends JFrame{
    
    public Imagen(){
        setTitle("Mostrar Imagen");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon imagenmostrar = new ImageIcon("logo.png");

        JLabel label = new JLabel(imagenmostrar);
        label.setBounds(15, 15, 680, 402);
        label.setText("Esta es mi imagen");
        label.setFont(new Font("Times New Roman", Font.BOLD, 40));
        label.setBackground(Color.GREEN);
        label.setForeground(Color.YELLOW);
        getContentPane().add(label);

        JButton button = new JButton("Click");
        button.setBounds( 70, 500, 100, 50);
        button.setBackground(Color.ORANGE);
        getContentPane().add(button);



        
    }

    public static void main(String[] args) {
        Imagen i = new Imagen();
        i.setVisible(true);
    }
}
