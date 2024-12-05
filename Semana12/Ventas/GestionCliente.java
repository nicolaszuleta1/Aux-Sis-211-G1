import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

import javax.swing.border.*;
import javax.swing.table.*;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.event.MouseEvent;

public class GestionCliente extends JFrame{
    private DefaultTableModel model = new DefaultTableModel();

    private JButton btnRegistrar, btnActualizar, btnEliminar, btnMostrar;
    private JTable tablaClientes;
    private JTextField txtNombre, txtApellido, txtCI, txtDireccion;
    private JLabel lblNombre, lblApellido, lblCI, lblDireccion;

    public GestionCliente (){
        setTitle("Clientes");
        setSize(770, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("CI");
        model.addColumn("Direccion");

        tablaClientes = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tablaClientes);
        scrollPane.setBounds(100, 20, 550, 300);
        getContentPane().add(scrollPane);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 350, 70, 25);
        getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(110, 350, 100, 25);
        getContentPane().add(txtNombre);

        lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(220, 350, 70, 25);
        getContentPane().add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(280, 350, 100, 25);
        getContentPane().add(txtApellido);

        lblCI = new JLabel("CI:");
        lblCI.setBounds(390, 350, 40, 25);
        getContentPane().add(lblCI);

        txtCI = new JTextField();
        txtCI.setBounds(420, 350, 100, 25);
        getContentPane().add(txtCI);

        lblDireccion = new JLabel("Direccion:");
        lblDireccion.setBounds(530, 350, 70, 25);
        getContentPane().add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(600, 350, 100, 25);
        getContentPane().add(txtDireccion);

        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(50, 400, 100, 30);
        getContentPane().add(btnMostrar);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(230, 400, 100, 30);
        getContentPane().add(btnRegistrar);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(410, 400, 100, 30);
        getContentPane().add(btnActualizar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(590, 400, 100, 30);
        getContentPane().add(btnEliminar);

        btnMostrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                actualizarTabla();
            }
        });

        btnRegistrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String CI = txtCI.getText();
                String direccion = txtDireccion.getText();

                Cliente cliente = new Cliente(nombre, apellido, CI, direccion);
                Tienda.ListaClientes().add(cliente);

                JOptionPane.showMessageDialog(null, "El cliente ha sido registrado correctamente");

                txtNombre.setText("");
                txtApellido.setText("");
                txtCI.setText("");
                txtDireccion.setText("");

                actualizarTabla();
            }
        });

        btnActualizar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });

        btnEliminar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });

        tablaClientes.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tablaClientes.getSelectedRow();
                if (selectedRow != -1) {
                    txtNombre.setText(tablaClientes.getValueAt(selectedRow, 0).toString());
                    txtApellido.setText(tablaClientes.getValueAt(selectedRow, 1).toString());
                    txtCI.setText(tablaClientes.getValueAt(selectedRow, 2).toString());
                    txtDireccion.setText(tablaClientes.getValueAt(selectedRow, 3).toString());
                }
                
            }
        });

    }

    public void actualizarTabla(){
            model.setRowCount(0);
                for(Cliente c : Tienda.ListaClientes()){
                    model.addRow(new Object[]{c.getNombre(), c.getApellido(), c.getCI(), c.getDireccion()});
                }
        }
}
