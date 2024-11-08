import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Buscar extends JFrame{

    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnBuscar;

    public Buscar(){
        setTitle("Buscar Estudiante");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(350,400);
        setLayout(null);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(80, 120, 50, 20);
        getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 120, 140, 20);
        getContentPane().add(txtNombre);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(125, 220, 100, 25);
        getContentPane().add(btnBuscar);


        btnBuscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nombre = txtNombre.getText();
                buscarEstudiante(nombre);
                txtNombre.setText("");
            }
        });
    }

    public void buscarEstudiante(String nombre){
                Estudiante mostrar = null;
                boolean exists = false;
                for(Estudiante e: Escuela.enviarLista()){
                    if(e.getNombre().equals(nombre)){
                    mostrar = e;
                    exists = true;
                    }
                }
        
                if(exists == true)
                    JOptionPane.showMessageDialog(null, "Estudiante Encontrado: Nombre: " + mostrar.getNombre() + " Semestre: " + mostrar.getSemestre());
                else{
                    JOptionPane.showMessageDialog(null, "Estudiante no Encontrado");
                }
    }
}
