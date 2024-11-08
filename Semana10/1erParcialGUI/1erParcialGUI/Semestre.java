import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

public class Semestre extends JFrame{
    
    private JTable tabla;
    private JButton btnListar;

    private DefaultTableModel model = new DefaultTableModel();

    public Semestre(){
        setTitle("Lista Ordenada por Semestre");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        model.addColumn("Nombre");
        model.addColumn("Semestre");

        tabla = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(100, 40, 300, 300);
        getContentPane().add(scrollPane);

        btnListar = new JButton("Listar");
        btnListar.setBounds(200, 380, 100, 25);
        getContentPane().add(btnListar);

        btnListar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                actualizarTabla();
            }
        });
    }
        public void actualizarTabla(){
            ArrayList <Estudiante> listaOrdenadaS = new ArrayList<>();
            listaOrdenadaS = Escuela.enviarLista();
            Collections.sort(listaOrdenadaS, (e1, e2) -> Integer.compare(e1.getSemestre(),(e2.getSemestre())));
            model.setRowCount(0);
                for(Estudiante e : listaOrdenadaS){
                    model.addRow(new Object[]{e.nombre, e.semestre});
                }
        }
}
