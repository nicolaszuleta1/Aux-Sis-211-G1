import java.util.ArrayList;

import java.io.*;

public class Main {

    public static ArrayList <Estudiante> lista = new ArrayList<>();
    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
        Cargar();
    }

    public static void añadirLista(Estudiante e){
        lista.add(e);
    }

    public static ArrayList<Estudiante> ListaEstudiantes(){
        return lista;
    }

    public static void Guardar(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))){
            oos.writeObject(lista);            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public static void Cargar(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("estudiantes.dat"))){
            lista = (ArrayList<Estudiante>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
