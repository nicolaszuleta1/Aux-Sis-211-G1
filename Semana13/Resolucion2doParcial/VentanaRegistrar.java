import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaRegistrar extends JFrame{

    private JLabel lblNombre, lblCI, lblSemestre;
    private JTextField txtNombre, txtCI, txtSemestre;
    private JButton btnAceptar, btnCancelar;

    public VentanaRegistrar(){
        setTitle("Registrar Estudiante");
        setSize(400, 230);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(null);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 50, 60, 25);
        getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(140, 50, 200, 25);
        getContentPane().add(txtNombre);

        lblCI = new JLabel("CI:");
        lblCI.setBounds(50, 90, 40, 25);
        getContentPane().add(lblCI);

        txtCI = new JTextField();
        txtCI.setBounds(90, 90, 100, 25);
        getContentPane().add(txtCI);

        lblSemestre = new JLabel("Semestre:");
        lblSemestre.setBounds(210, 90, 70, 25);
        getContentPane().add(lblSemestre);

        txtSemestre = new JTextField();
        txtSemestre.setBounds(280, 90, 60, 25);
        getContentPane().add(txtSemestre);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 130, 140, 25);
        getContentPane().add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(200, 130, 140, 25);
        getContentPane().add(btnCancelar);

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    String nombre = txtNombre.getText();
                    String CI = txtCI.getText();
                    int Semestre = Integer.parseInt(txtSemestre.getText());
                    
                    Estudiante estudiante = new Estudiante (nombre, CI, Semestre);
                    Main.añadirLista(estudiante);
                    JOptionPane.showMessageDialog(null, "Estudiante registrado correctamen");
                    Main.Guardar();
                    txtNombre.setText("");
                    txtCI.setText("");
                    txtSemestre.setText("");
                } catch (Exception args) {
                    JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
                }
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });


    }
    
}
