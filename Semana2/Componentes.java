public class Componentes {
    String procesador, grafica, ram, memoria, monitor;
    boolean estado;

    public Componentes(String procesador, String grafica, String ram, String memoria, String monitor, boolean estado) {
        this.procesador = procesador;
        this.grafica = grafica;
        this.ram = ram;
        this.memoria = memoria;
        this.monitor = monitor;
        this.estado = estado;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    
    public void encender(){
        if(this.estado == false){
            System.out.println("La computadora se esta encendiendo");
            this.estado = true;
        }
        else{
            System.out.println("La computadora ya se esta encendida");
        }
    }
    
    public void apagar(){
        if(this.estado == true){
            System.out.println("La computadora se esta apagando");
            this.estado = false;
        }
        else{
            System.out.println("La computadora ya se esta apagada");
        }
    }
    
    public void reiniciar(){
        if(this.estado == true){
            System.out.println("La computadora se esta reiniciando");
            this.estado = false;
            this.estado = true;
        }
        else{
            System.out.println("La computadora esta apagada, no se puede reiniciar");
        }
    }
}