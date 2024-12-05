package CRUD;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class InicioSesion extends JFrame{
    
    private JPanel jPanel1 = new JPanel();
    private JButton jButton1 = new JButton("Iniciar Sesión");
    private JLabel jLabel1 = new JLabel("Inicio Sesión");
    private JLabel jLabel2 = new JLabel("Correo:");
    private JLabel jLabel3 = new JLabel("Contraseña:");
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JPasswordField jPasswordField1 = new JPasswordField(12);
    private JTextField jTextField1 = new JTextField(12);
    
    public InicioSesion (){
        setTitle("Iniciar Sesión");
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
        jPanel1.add(jPasswordField1);
        jPanel1.add(jLabel6);
        jPanel1.add(jButton1);
        
        jPanel1.setBackground(Color.CYAN);
        add(jPanel1);
        
        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                String correoText = jTextField1.getText();
                String contraseñaText = new String(jPasswordField1.getPassword());
        
                Usuario usuarioBuscar = null;
                for (Usuario usuario : CRUD.obtenerLista()) {
                    if (usuario.correo.equals(correoText) && usuario.contraseña.equals(contraseñaText)) {
                    usuarioBuscar = usuario;
                    break;
                    }
                }   

                if (usuarioBuscar != null) {
                    JOptionPane.showMessageDialog(null, "Usuario encontrado correctamente");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
        
                jTextField1.setText("");
                jPasswordField1.setText("");
        
            }
        });
    }
}
