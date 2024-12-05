
import java.io.*;
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

    public static void Guardar(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.txt"))){
            oos.writeObject(lista);            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public static void Cargar(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("estudiantes.txt"))){
            lista = (ArrayList<Estudiante>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
