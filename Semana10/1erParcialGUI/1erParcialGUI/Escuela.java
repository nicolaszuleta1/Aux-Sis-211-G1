
import java.util.*;

public class Escuela {

    public static ArrayList <Estudiante> lista = new ArrayList<>();

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
    
    public static void registrar(Estudiante estudiante){
        lista.add(estudiante);
    }

    public static ArrayList<Estudiante> enviarLista(){
        return lista;
    }
}
