public class Computadoras {

    public static void main(String[] args) {
        boolean estado1 = false;
        boolean estado2 = false;
        boolean estado3 = true;
        
        Componentes computadora1 = new Componentes ("Intel", "integrada", "16 gb", "512 gb", "60 hz", estado1);
        Componentes computadora2 = new Componentes ("ryzen", "dedicada", "8 gb", "256 gb", "75 hz", estado2);
        Componentes computadora3 = new Componentes ("Intel", "dedicada", "32 gb", "512 gb", "144 hz", estado3);
        
        System.out.println("Computadora 1:");
        System.out.println(computadora1.procesador);
        System.out.println(computadora1.grafica);
        System.out.println(computadora1.ram);
        System.out.println(computadora1.memoria);
        System.out.println(computadora1.monitor);
        System.out.println("Computadora 2:");
        System.out.println(computadora2.procesador);
        System.out.println(computadora2.grafica);
        System.out.println(computadora2.ram);
        System.out.println(computadora2.memoria);
        System.out.println(computadora2.monitor);
        System.out.println("Computadora 3:");
        System.out.println(computadora3.procesador);
        System.out.println(computadora3.grafica);
        System.out.println(computadora3.ram);
        System.out.println(computadora3.memoria);
        System.out.println(computadora3.monitor);
        
        computadora1.setProcesador("ryzen");
        computadora1.setGrafica("rtx 2060");
        computadora1.setRam("8 gb");
        computadora1.setMemoria("1 tera");
        computadora1.setMonitor("144 hz");
        
        System.out.println("Computadora 1 atributos modificados:");
        System.out.println(computadora1.procesador);
        System.out.println(computadora1.grafica);
        System.out.println(computadora1.ram);
        System.out.println(computadora1.memoria);
        System.out.println(computadora1.monitor);
        
        computadora1.apagar();
        computadora1.reiniciar();
        computadora1.encender();
        computadora1.reiniciar();
        computadora1.apagar();
        System.out.println("---------------------");
        
        computadora2.apagar();
        computadora2.reiniciar();
        computadora2.encender();
        computadora2.reiniciar();
        computadora2.apagar();
        System.out.println("----------------------");
        
        computadora3.encender();
        computadora3.reiniciar();
        computadora3.apagar();
    }
    
}