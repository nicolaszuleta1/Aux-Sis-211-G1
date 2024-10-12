

public class AbstractClass {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(7.5);

        System.out.println(circulo.calcularArea());
        System.out.println(cuadrado.calcularArea());
    }
}

 abstract class Figuras{
    int x, y;
    public Figuras(){}

    public abstract double calcularArea();

 }

    class Circulo extends Figuras{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double pi = 3.14;
        double resultado = pi*radio*radio;
        return resultado;
    }
    }
    class Cuadrado extends Figuras{

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        double resultado = lado*lado;
        return resultado;
    }
 }

