
import java.util.*;

public class Escuela {

    public static ArrayList <Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Registrar Estudiante");
        System.out.println("2. Listar Estudiantes");
        System.out.println("3. Ordenar Alfabeticamente");
        System.out.println("4. Ordenar por Semestre");
        System.out.println("5. Buscar por nombre");
        System.out.println("6. Salir");
        opcion=x.nextInt();
            switch(opcion){
                case 1:
                    Registrar();
                    break;
                case 2:
                    Listar();
                    break;
                case 3:
                    OrdenAlfabetico();
                    break;
                case 4:
                    OrdenSemestre();
                    break;
                case 5:
                    Buscar();
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
        while(opcion != 6);
        
    }
    //Registro
        public static void Registrar(){
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el nombre completo del estudiante:");
        String nombreCompleto = x.nextLine();
        System.out.println("Ingrese el semestre del estudiante:");
        int semestre = x.nextInt();
        
        Estudiante estudiante = new Estudiante(nombreCompleto, semestre);
        listaEstudiantes.add(estudiante);
        }
        
    //Listado
        public static void Listar(){
        int i = 1;
        for(Estudiante e: listaEstudiantes){
            System.out.println("----------------------------");
            System.out.println("Estudiante N:" + i);
            System.out.println("Nombre Completo: " + e.getNombre());
            System.out.println("Semestre: " + e.getSemestre());
            System.out.println("----------------------------");
            i++;
        }
    }
    //Buscar
        public static void Buscar(){
        Scanner x = new Scanner(System.in);
        System.out.println("Introduzca el nombre del estudiante:");
        String nombreE = x.nextLine();
        Estudiante mostrar = null;
        
        boolean exists = false;
        
        for(Estudiante e: listaEstudiantes){
            if(e.getNombre().equals(nombreE)){
                mostrar = e;
                exists = true;
            }
        }
        
        if(exists == false)
            System.out.println("El estudiante no se encuentra registrado");
        else{
            System.out.println("Nombre: " + mostrar.getNombre());
            System.out.println("Semestre: " + mostrar.getSemestre());
        }
        }
    //Orden Alfabetico
        public static void OrdenAlfabetico(){
        ArrayList <Estudiante> listaOrdenadaA = new ArrayList<>();
        listaOrdenadaA = listaEstudiantes;
        Collections.sort(listaOrdenadaA, (e1, e2) -> e1.getNombre().compareTo(e2.getNombre()));
        int i = 1;
        for(Estudiante e: listaOrdenadaA){
            System.out.println("----------------------------");
            System.out.println("Estudiante N:" + i);
            System.out.println("Nombre Completo: " + e.getNombre());
            System.out.println("Semestre: " + e.getSemestre());
            System.out.println("----------------------------");
            i++;
        }
        
        }
    //Orden Semestre
        public static void OrdenSemestre(){
        ArrayList <Estudiante> listaOrdenadaS = new ArrayList<>();
        listaOrdenadaS = listaEstudiantes;
        Collections.sort(listaOrdenadaS, (e1, e2) -> Integer.compare(e1.getSemestre(),(e2.getSemestre())));
        int i = 1;
        for(Estudiante e: listaOrdenadaS){
            System.out.println("----------------------------");
            System.out.println("Estudiante N:" + i);
            System.out.println("Nombre Completo: " + e.getNombre());
            System.out.println("Semestre: " + e.getSemestre());
            System.out.println("----------------------------");
            i++;
        }
        }
}


