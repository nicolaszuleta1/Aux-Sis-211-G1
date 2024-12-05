import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaEditar extends JFrame{
    private JLabel lblNombre, lblCI, lblSemestre, lblPago;
    private JTextField txtNombre, txtCI, txtSemestre, txtPago;
    private JButton btnAceptar, btnCancelar, btnBuscar;
    Estudiante estudiante = null;

    public VentanaEditar(){
        setTitle("Editar Pago");
        setSize(440, 260);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(null);

        lblCI = new JLabel("CI:");
        lblCI.setBounds(50, 35, 50, 25);
        getContentPane().add(lblCI);

        txtCI = new JTextField();
        txtCI.setBounds(90, 35, 110, 25);
        getContentPane().add(txtCI);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(210, 35, 110, 25);
        getContentPane().add(btnBuscar);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 80, 60, 25);
        getContentPane().add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 80, 90, 25);
        getContentPane().add(txtNombre);
        txtNombre.setEditable(false);

        lblSemestre = new JLabel("Semestre:");
        lblSemestre.setBounds(220, 80, 80, 25);
        getContentPane().add(lblSemestre);

        txtSemestre = new JTextField();
        txtSemestre.setBounds(310, 80, 90, 25);
        getContentPane().add(txtSemestre);
        txtSemestre.setEditable(false);

        lblPago = new JLabel("Pago Realizado:");
        lblPago.setBounds(50, 125, 120, 25);
        getContentPane().add(lblPago);

        txtPago = new JTextField();
        txtPago.setBounds(190, 125, 120, 25);
        getContentPane().add(txtPago);
        txtPago.setEditable(false);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(50, 170, 140, 25);
        getContentPane().add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(200, 170, 140, 25);
        getContentPane().add(btnCancelar);

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String CI = txtCI.getText();
                for(Estudiante e2 : Main.ListaEstudiantes()){
                    if(e2.getCI().equals(CI)){
                        JOptionPane.showMessageDialog(null, "Usuario encontrado");
                        estudiante = e2;
                    }
                }
                if(estudiante != null){
                    String semestre = "" + estudiante.getSemestre();
                    txtNombre.setText(estudiante.getNombre());
                    txtSemestre.setText(semestre);
                    txtPago.setEditable(true);
                }
                else
                    JOptionPane.showMessageDialog(null, "Usuario no registrado");

            }
        });

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    String Pago = txtPago.getText();
                    double pagorealizado = Double.parseDouble(Pago);
                    estudiante.setPago(pagorealizado);
                    JOptionPane.showMessageDialog(null, "Pago editado correctamente");
                    Main.Guardar();
                } catch (Exception args) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores correctos");
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
