
public class Interface {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(7);

        System.out.println("Area circulo: " + circulo.calcularArea());
        System.out.println("Area cuadrado: " + cuadrado.calcularArea());
    }
}

    interface Figuras{
    public double calcularArea();
    }
 class Circulo implements Figuras{
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
    class Cuadrado implements Figuras{

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