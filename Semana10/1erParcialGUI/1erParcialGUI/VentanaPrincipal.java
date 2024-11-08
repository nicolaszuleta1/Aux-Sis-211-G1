
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame{
    JButton btnRegistrar;
    JButton btnListar;
    JButton btnBuscar;
    JButton btnOrdenAlfabetico;
    JButton btnOrdenSemestre;

    public VentanaPrincipal (){

        setTitle("Escuela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(80, 70, 200, 30);
        getContentPane().add(btnRegistrar);

        btnListar = new JButton("Listar");
        btnListar.setBounds(80, 120, 200, 30);
        getContentPane().add(btnListar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(80, 170, 200, 30);
        getContentPane().add(btnBuscar);

        btnOrdenAlfabetico = new JButton("Ordenar Alfabeticamente");
        btnOrdenAlfabetico.setBounds(80, 220, 200, 30);
        getContentPane().add(btnOrdenAlfabetico);

        btnOrdenSemestre = new JButton("Ordenar por Semestre");
        btnOrdenSemestre.setBounds(80, 270, 200, 30);
        getContentPane().add(btnOrdenSemestre);
        

        btnRegistrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Registro r = new Registro();
                r.setVisible(true);
            }
        });

        btnListar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Listar l = new Listar();
                l.setVisible(true);
            }
        });

        btnBuscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Buscar b = new Buscar();
                b.setVisible(true);
            }
        });
        
        btnOrdenAlfabetico.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Alfabetico a = new Alfabetico();
                a.setVisible(true);
            }
        });

        btnOrdenSemestre.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Semestre s = new Semestre();
                s.setVisible(true);
            }
        });
    }
    
}
