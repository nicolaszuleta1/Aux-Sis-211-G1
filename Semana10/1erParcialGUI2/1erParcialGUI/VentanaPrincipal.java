
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
    JButton btnRegistrar;
    JButton btnListar;
    JButton btnBuscar;
    JButton btnOrdenAlfabetico;
    JButton btnOrdenSemestre;
    JButton btnGuardar;
    JButton btnCargar;

    public VentanaPrincipal (){

        setTitle("Escuela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
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
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(80, 320, 200, 30);
        getContentPane().add(btnGuardar);

        btnCargar = new JButton("Cargar");
        btnCargar.setBounds(80, 370, 200, 30);
        getContentPane().add(btnCargar);

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

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Escuela.Guardar();
            }
        });
        
        btnCargar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Escuela.Cargar();
            }
        });
    }
    
    
}
