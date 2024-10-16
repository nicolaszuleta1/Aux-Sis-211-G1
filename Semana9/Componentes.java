import javax.swing.*;
import java.awt.*;

public class Componentes extends JFrame {

    public Componentes() {
        //Titulo de la venta
        setTitle("Componentes");
        //Tamaño en pixeles de la ventana
        setSize(550, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Localizacion de la ventana al ejecutar el programa, en este caso en el centro
        setLocationRelativeTo(null);

        //Creación del panel principal que contendrá los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 2, 10, 15));

        
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //Creación de un componente JLabel
        JLabel label1 = new JLabel("TextField:");
        //Creación de un componente JTextField
        JTextField textField = new JTextField(30);
        panel1.add(label1);
        panel1.add(textField);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label2 = new JLabel("Botón:");
        //Creación de un componente JButton
        JButton button = new JButton("Click aquí");
        panel2.add(label2);
        panel2.add(button);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label3 = new JLabel("Lista:");
        //Creación de un componente JList
        JList <String> lista = new JList<>(new String[]{"Opción 1", "Opción 2"});
        panel3.add(label3);
        panel3.add(lista);

        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label4 = new JLabel("Combo Box:");
        //Creación de un componente JComboBox
        JComboBox <String> comboBox = new JComboBox<>(new String[]{"Seleccionar", "Opción A", "Opción B", "Opción C"});
        panel4.add(label4);
        panel4.add(comboBox);

        JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label5 = new JLabel("Radio Button:");
        //Creación de dos componentes JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        panel5.add(label5);
        panel5.add(radioButton1);
        panel5.add(radioButton2);

        JPanel panel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label6 = new JLabel("Checkbox:");
        //Creación de un componente JCheckBox
        JCheckBox checkBox = new JCheckBox("Seleccionar");
        panel6.add(label6);
        panel6.add(checkBox);

        JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label7 = new JLabel("Área de Texto:");
        //Creación de un componente JTextArea
        JTextArea textArea = new JTextArea(2, 25);
        JScrollPane scrollPaneTextArea = new JScrollPane(textArea);
        panel7.add(label7);
        panel7.add(scrollPaneTextArea);

        JPanel panel8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label8 = new JLabel("Contraseña:");
        //Creación de un componente JPasswordField
        JPasswordField passwordField = new JPasswordField(20);
        panel8.add(label8);
        panel8.add(passwordField);

        JPanel panel9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label9 = new JLabel("Spinner:");
        //Creación de un componente JSpinner
        JSpinner spinner = new JSpinner();
        panel9.add(label9);
        panel9.add(spinner);

        JPanel panel10 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label10 = new JLabel("Tabla:");
        //Creación de un componente JTable
        JTable table = new JTable(2, 3);
        table.setPreferredScrollableViewportSize(new Dimension(300, 10));
        JScrollPane scrollPaneTable = new JScrollPane(table);
        panel10.add(label10);
        panel10.add(scrollPaneTable);

        JPanel panel11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label11 = new JLabel("Barra de Desplazamiento:");
        //Creación de un componente JScrollBar
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        scrollBar.setPreferredSize(new Dimension(350, 17));
        panel11.add(label11);
        panel11.add(scrollBar);

        JPanel panel12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label12 = new JLabel("Control Deslizante:");
        //Creación de un componente JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
        slider.setPreferredSize(new Dimension(250, 17));
        panel12.add(label12);
        panel12.add(slider);

        //Añadimos todos los panels al panel principal
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);
        panel.add(panel7);
        panel.add(panel8);
        panel.add(panel9);
        panel.add(panel10);
        panel.add(panel11);
        panel.add(panel12);

        //Añadimos el panel principal a la ventana JFrame
        add(panel);
    }

    public static void main(String[] args) {
        //Hacemos visible la ventana
        Componentes c = new Componentes();
        c.setVisible(true);
    }
}