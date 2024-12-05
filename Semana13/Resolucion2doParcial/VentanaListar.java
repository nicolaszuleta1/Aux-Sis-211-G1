import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class VentanaListar extends JFrame{
    private DefaultTableModel model = new DefaultTableModel();
    double suma = 0;

    private JTable tabla;
    private JScrollPane scroll;

    public VentanaListar(){
        setTitle("Lista de Estudiantes");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        model.addColumn("Nombre");
        model.addColumn("CI");
        model.addColumn("Monto Pagado");

        tabla = new JTable(model);
        scroll = new JScrollPane(tabla);
        scroll.setBounds(50, 50, 200, 300);
        getContentPane().add(scroll);

        mostrarTabla();
    }

    public void mostrarTabla(){
        model.setRowCount(0);

            for(Estudiante e : Main.ListaEstudiantes()){
                model.addRow(new Object[]{e.getNombre(), e.getCI(), e.getPago()});
                suma = suma + e.getPago();
            }
            model.addRow(new Object[]{"","",""});
            model.addRow(new Object[]{"","",""});
            model.addRow(new Object[]{"","",""});
            model.addRow(new Object[]{"Total:", "", suma});
    }
}
