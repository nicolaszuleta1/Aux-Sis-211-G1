package CRUD;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

public class Tabla extends JFrame{
    
    private DefaultTableModel model = new DefaultTableModel();
    
    private JPanel jPanel1 = new JPanel();
    private JButton jButton1 = new JButton("Mostrar");
    private JButton jButton2 = new JButton("Actualizar");
    private JButton jButton3 = new JButton("Eliminar");
    private JLabel jLabel1 = new JLabel("Correo:");
    private JLabel jLabel2 = new JLabel("Contraseña:");
    private JLabel jLabel3 = new JLabel();
    private JTable jTable1 = new JTable(model);
    private JScrollPane scrollPaneTable = new JScrollPane(jTable1);
    private JTextField jTextField1 = new JTextField(12);
    private JTextField jTextField2 = new JTextField(12);
    

    public Tabla (){
        setTitle("Usuarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 470);
        
        model.addColumn("Correo");
        model.addColumn("Contraseña");
        jTable1.setPreferredScrollableViewportSize(new Dimension(400, 250));
        
        
        jLabel3.setBorder(new EmptyBorder(0, 450, 0, 0));
        jLabel1.setBorder(new EmptyBorder(15, 0, 20, 0));
        jLabel2.setBorder(new EmptyBorder(15, 0, 20, 0));
        
        jPanel1.add(scrollPaneTable);
        jPanel1.add(jButton1);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel1);
        jPanel1.add(jTextField1);
        jPanel1.add(jLabel2);
        jPanel1.add(jTextField2);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        
        jPanel1.setBackground(Color.CYAN);
        add(jPanel1);
        
        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                actualizarTabla();
        
            }
        });
        
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                int selectedRow = jTable1.getSelectedRow();
        
                String correoTabla = jTable1.getValueAt(selectedRow, 0).toString();
                String contraseñaTabla = jTable1.getValueAt(selectedRow, 1).toString();
        
                Usuario usuarioActualizar = null;
        
                for (Usuario usuario : CRUD.obtenerLista()) {
                    if (usuario.correo.equals(correoTabla) && usuario.contraseña.equals(contraseñaTabla)) {
                        usuarioActualizar = usuario;
                        break;
                    }
                }
        
        
                if (usuarioActualizar != null) {
                    usuarioActualizar.setCorreo(jTextField1.getText());
                    usuarioActualizar.setContraseña(jTextField2.getText());
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                    actualizarTabla();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
        
            }
        });
        
        jButton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            
                String correoText = jTextField1.getText();
                String contraseñaText = jTextField2.getText();
        
                Usuario usuarioEliminar = null;
                for (Usuario usuario : CRUD.obtenerLista()) {
                    if (usuario.correo.equals(correoText) && usuario.contraseña.equals(contraseñaText)) {
                        usuarioEliminar = usuario;
                        break;
                    }
                }

                if (usuarioEliminar != null) {
                    CRUD.obtenerLista().remove(usuarioEliminar);
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                    actualizarTabla();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
        
            }
        });
        
        jTable1.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e) {
                
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow != -1) {
                    jTextField1.setText(jTable1.getValueAt(selectedRow, 0).toString());
                    jTextField2.setText(jTable1.getValueAt(selectedRow, 1).toString());
                }
                
            }
        });
        
    }
    
    public void actualizarTabla(){
    
        model.setRowCount(0);

        for(Usuario u : CRUD.obtenerLista()){
        
            model.addRow(new Object[] {u.correo, u.contraseña});

        }
    
    }
}