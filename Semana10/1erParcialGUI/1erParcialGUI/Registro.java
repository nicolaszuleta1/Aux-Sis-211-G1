
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Registro extends JFrame{
    
    private JLabel lblNombre;
    private JLabel lblSemestre;
    private JTextField txtNombre;
    private JTextField txtSemestre;
    private JButton btnRegistrar;

    public Registro(){
        setTitle("Registrar Estudiante");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(350,400);
        setLayout(null);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(80, 120, 50, 20);
        getContentPane().add(lblNombre);

        lblSemestre = new JLabel("Semestre:");
        lblSemestre.setBounds(80, 180, 80, 20);
        getContentPane().add(lblSemestre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 120, 140, 20);
        getContentPane().add(txtNombre);

        txtSemestre = new JTextField();
        txtSemestre.setBounds(150, 180, 140, 20);
        getContentPane().add(txtSemestre);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(125, 220, 100, 25);
        getContentPane().add(btnRegistrar);


        btnRegistrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nombre = txtNombre.getText();
                int semestre = Integer.parseInt(txtSemestre.getText());

                Estudiante estudiante = new Estudiante(nombre, semestre);

                Escuela.registrar(estudiante);

                JOptionPane.showMessageDialog(null, "Estudiante Registrado Correctamente");

                txtNombre.setText("");
                txtSemestre.setText("");
            }
        });
    }
}
