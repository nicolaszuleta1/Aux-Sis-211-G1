package CRUD;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Registro extends JFrame{
    
    private JPanel jPanel1 = new JPanel();
    private JLabel jLabel1 = new JLabel("Registro");
    private JLabel jLabel2 = new JLabel("Correo:");
    private JLabel jLabel3 = new JLabel("Contraseña:");
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JTextField jTextField1 = new JTextField(12);
    private JTextField jTextField2 = new JTextField(12);
    private JButton jButton1 = new JButton("Registrar");
    
    public Registro (){
        setTitle("Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(310, 370);
        
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 18));
        jLabel4.setBorder(new EmptyBorder(0, 250, 0, 0));
        jLabel5.setBorder(new EmptyBorder(0, 250, 0, 0));
        jLabel1.setBorder(new EmptyBorder(40, 0, 20, 0));
        jLabel2.setBorder(new EmptyBorder(10, 20, 15, 0));
        jLabel6.setBorder(new EmptyBorder(50, 0, 20, 0));
        jLabel3.setBorder(new EmptyBorder(17, 0, 20, 0));
        
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel2);
        jPanel1.add(jTextField1);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel3);
        jPanel1.add(jTextField2);
        jPanel1.add(jLabel6);
        jPanel1.add(jButton1);
        
        jPanel1.setBackground(Color.CYAN);
        add(jPanel1);
        
        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                String correo = jTextField1.getText();
                String contraseña = jTextField2.getText();
        
                Usuario user = new Usuario(correo,contraseña);
                CRUD.agregarUsuario(user);
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
        
                jTextField1.setText("");
                jTextField2.setText("");
        
            }
        });
    }
    
}