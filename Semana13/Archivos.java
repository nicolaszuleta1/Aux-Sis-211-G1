import java.io.*;

public class Archivos {

    public static void main(String[] args) {
        String filename = "NombredelArchivo.txt";
        String contenido = "Hola Mundo";

        // Crear archivo
        crearArchivo(filename);

        // Escribir en un archivo
        escribirArchivo(filename, contenido);

        // Leer archivo
        leerArchivo(filename);

        // Eliminar archivo
        eliminarArchivo(filename);
    }
    // Crear un archivo
    public static void crearArchivo(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
    }

    // Escribir en un archivo
    public static void escribirArchivo(String filename, String contenido) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(contenido);
            System.out.println("Se escribio en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
    }

    // Leer un archivo
    public static void leerArchivo(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
    }

    // Eliminar un archivo
    public static void eliminarArchivo(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("El archivo fue eliminado: " + file.getName());
        } else {
            System.out.println("Fallo la eliminación del archivo.");
        }
    }

}