import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame{
    private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    private JButton suma, resta, multiplicacion, division, igual, punto;
    private JTextField mostrar;
    private JButton borrar, borrar2;

    double numero1 = 0, numero2 = 0;

    String operacion;

    public Calculadora(){
        setSize(320, 450);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        mostrar = new JTextField();
        -060

        borrar = new JButton("AC");
        borrar.setBounds(155, 65, 55, 55);
        getContentPane().add(borrar);

        borrar2 = new JButton("←");
        borrar2.setBounds(225, 65, 55, 55);
        getContentPane().add(borrar2);

        num1 = new JButton("1");
        num1.setBounds(15, 125, 55, 55);
        getContentPane().add(num1);

        num2 = new JButton("2");
        num2.setBounds(85, 125, 55, 55);
        getContentPane().add(num2);

        num3 = new JButton("3");
        num3.setBounds(155, 125, 55, 55);
        getContentPane().add(num3);

        num4 = new JButton("4");
        num4.setBounds(15, 195, 55, 55);
        getContentPane().add(num4);

        num5 = new JButton("5");
        num5.setBounds(85, 195, 55, 55);
        getContentPane().add(num5);

        num6 = new JButton("6");
        num6.setBounds(155, 195, 55, 55);
        getContentPane().add(num6);

        num7 = new JButton("7");
        num7.setBounds(15, 265, 55, 55);
        getContentPane().add(num7);

        num8 = new JButton("8");
        num8.setBounds(85, 265, 55, 55);
        getContentPane().add(num8);

        num9 = new JButton("9");
        num9.setBounds(155, 265, 55, 55);
        getContentPane().add(num9);

        punto = new JButton(".");
        punto.setBounds(15, 335, 55, 55);
        getContentPane().add(punto);

        num0 = new JButton("0");
        num0.setBounds(85, 335, 55, 55);
        getContentPane().add(num0);

        igual = new JButton("=");
        igual.setBounds(155, 335, 55, 55);
        getContentPane().add(igual);

        division = new JButton("/");
        division.setBounds(225, 125, 55, 55);
        getContentPane().add(division);

        multiplicacion = new JButton("x");
        multiplicacion.setBounds(225, 195, 55, 55);
        getContentPane().add(multiplicacion);

        suma = new JButton("+");
        suma.setBounds(225, 265, 55, 55);
        getContentPane().add(suma);

        resta = new JButton("-");
        resta.setBounds(225, 335, 55, 55);
        getContentPane().add(resta);
        

        borrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                mostrar.setText("");
            }
        });

        borrar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String obtener = mostrar.getText();
                String devolver = "";
                for(int i=0; i<obtener.length()-1; i++){
                    devolver = devolver + obtener.charAt(i);
                }
                mostrar.setText(devolver);
            }
        });

        num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "1");
            }
        });

        num2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "2");
            }
        });

        num3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "3");
            }
        });

        num4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "4");
            }
        });

        num5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "5");
            }
        });

        num6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "6");
            }
        });

        num7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "7");
            }
        });

        num8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "8");
            }
        });

        num9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "9");
            }
        });

        num0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + "0");
            }
        });

        punto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String numero = mostrar.getText();
                mostrar.setText(numero + ".");
            }
        });

        suma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    numero1 = Double.parseDouble(mostrar.getText());
                    mostrar.setText("");
                    operacion = "sumar";
                } catch (Exception args) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores iniciales");
                }  
            }
        });

        resta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    numero1 = Double.parseDouble(mostrar.getText());
                    mostrar.setText("");
                    operacion = "restar";
                }
                catch (Exception args) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores iniciales");
                }
            }
        });

        multiplicacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    numero1 = Double.parseDouble(mostrar.getText());
                    mostrar.setText("");
                    operacion = "multiplicar";
                }
                catch (Exception args) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores iniciales");
                }
            }
        });

        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    numero1 = Double.parseDouble(mostrar.getText());
                    mostrar.setText("");
                    operacion = "dividir";
                }
                catch (Exception args) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores iniciales");
                }
            }
        });

        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                String resultado;
                numero2 = Double.parseDouble(mostrar.getText());
                switch (operacion) {
                    case "sumar":
                            double suma = numero1 + numero2;
                            resultado = String.valueOf(suma);
                            mostrar.setText(resultado);
                        break;
                    case "restar":
                        double resta = numero1 - numero2;
                        resultado = String.valueOf(resta);
                        mostrar.setText(resultado);
                        break;
                    case "multiplicar":
                        double multiplicacion = numero1 * numero2;
                        resultado = String.valueOf(multiplicacion);
                        mostrar.setText(resultado);
                        break;
                    case "dividir":
                        double division = numero1 / numero2;
                        resultado = String.valueOf(division);
                        mostrar.setText(resultado);
                        break;
                    default:
                        break;
                }
            }
            catch (Exception args) {
            JOptionPane.showMessageDialog(null, "Ingrese valores iniciales");
            }
    }
        });

    }

    public static void main(String[] args){
        Calculadora c = new Calculadora();
        c.setVisible(true);
    }    
}

