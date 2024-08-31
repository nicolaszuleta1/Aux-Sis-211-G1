
public class EjemploClasesyObjetos {
    public static void main(String[] args) {
        
        vehiculo moto = new vehiculo("1234","verde","0");
        vehiculo automovil = new vehiculo("4321","azul","4");
        vehiculo vehiculo1 = new vehiculo();
        vehiculo vehiculo2 = new vehiculo("1111", "blanco");
        
        System.out.println(moto.getPlaca());
        System.out.println(moto.getColor());
        System.out.println(moto.getPuertas());

        System.out.println(automovil.getPlaca());
        System.out.println(automovil.getColor());
        System.out.println(automovil.getPuertas());
        
        System.out.println(moto.color);
        System.out.println(moto.placa);
        System.out.println(moto.puertas);

        System.out.println(vehiculo1.color);
        System.out.println(vehiculo1.placa);
        System.out.println(vehiculo1.puertas);

        System.out.println(vehiculo2.color);
        System.out.println(vehiculo2.placa);
        System.out.println(vehiculo2.puertas);
        
        moto.setColor("rojo");
        moto.setPlaca("5678");
        
        System.out.println(moto.color);
        System.out.println(moto.placa);
        System.out.println(moto.puertas);
        
        moto.arrancar();
        automovil.arrancar();
    }
    
}
class vehiculo{

    String placa, color, puertas;

    public vehiculo(String placa, String color, String puertas) {
        this.placa = placa;
        this.color = color;
        this.puertas = puertas;
    }

    public vehiculo(String placa, String color) {
        this.placa = placa;
        this.color = color;
    }

    public vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
    
    public void arrancar(){
    System.out.println("El vehiculo arrancó");
    }
}