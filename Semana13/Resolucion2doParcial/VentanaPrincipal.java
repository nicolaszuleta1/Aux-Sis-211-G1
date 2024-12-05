import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame{

    private JButton btnRegistrar, btnEditar, btnListar;


    public VentanaPrincipal(){
        setTitle("Ventana Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        btnRegistrar = new JButton("Registrar Estudiante");
        btnRegistrar.setBounds(90, 70, 200, 25);
        getContentPane().add(btnRegistrar);

        btnEditar = new JButton("Editar Pago");
        btnEditar.setBounds(90, 120, 200, 25);
        getContentPane().add(btnEditar);

        btnListar = new JButton("Listar Estudiantes");
        btnListar.setBounds(90, 170, 200, 25);
        getContentPane().add(btnListar);
        
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                VentanaRegistrar VR = new VentanaRegistrar();
                VR.setVisible(true);
            }
        });
    
        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                VentanaEditar VE = new VentanaEditar();
                VE.setVisible(true);
            }
        });
    
        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                VentanaListar VL = new VentanaListar();
                VL.setVisible(true);
            }
        });
    }
    
}
