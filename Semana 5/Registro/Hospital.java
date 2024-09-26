import java.util.*;

public class Hospital {
    
    public static ArrayList <Paciente> listaPacientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int opcion;
        do{
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Registrar Paciente");
        System.out.println("2. Listar Pacientes");
        System.out.println("3. Eliminar Paciente");
        System.out.println("4. Actualizar Datos");
        System.out.println("5. Salir");
        opcion=x.nextInt();
        x.nextLine();
            switch(opcion){
                case 1:
                    Registrar();
                    break;
                case 2:
                    Listar();
                    break;
                case 3:
                    Eliminar();
                    break;
                case 4:
                    Actualizar();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            
            }
            
        }
        while(opcion != 5);
        
    }
    //Registro
        public static void Registrar(){
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el nombre completo del paciente:");
        String nombreCompleto = x.nextLine();
        System.out.println("Ingrese el CI del paciente:");
        String CI = x.nextLine();
        System.out.println("Ingrese la edad del paciente:");
        int edad = x.nextInt();
        System.out.println("Ingrese el peso del paciente:");
        double peso = x.nextDouble();
        x.nextLine();
        System.out.println("Ingrese el diagnostico del paciente:");
        String diagnostico = x.nextLine();

        
        Paciente paciente = new Paciente(nombreCompleto, CI, diagnostico, edad, peso);
        listaPacientes.add(paciente);
        }
        
    //Listado
        public static void Listar(){
        int i = 1;
        for(Paciente p: listaPacientes){
            System.out.println("----------------------------");
            System.out.println("Paciente N:" + i);
            System.out.println("Nombre Completo: " + p.getNombreCompleto());
            System.out.println("CI: " + p.getCI());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("Diagnostico: " + p.getDiagnostico());
            System.out.println("----------------------------");
            i++;
        }
    }
    //Eliminar
        public static void Eliminar(){
        Scanner x = new Scanner(System.in);
        System.out.println("Introduzca el CI del paciente que desea eliminar:");
        String CIEliminado = x.next();
        x.nextLine();
        boolean exists = false;
        Paciente eliminar = null;
        
        for(Paciente p: listaPacientes){
            if(p.getCI().equals(CIEliminado)){
                eliminar = p;
                exists = true;
            }
        }
        
        if(exists == false)
            System.out.println("El paciente no existe");
        else{
            listaPacientes.remove(eliminar);
            System.out.println("Paciente eliminado");
        }
        }
    
    //Actualizar
        public static void Actualizar(){
        Scanner x = new Scanner(System.in);
        System.out.println("Introduzca el CI del paciente que desea actualizar:");
        String CIActualizar = x.next();
        x.nextLine();
        boolean exists = false;
        for(Paciente p: listaPacientes){
            if(p.getCI().equals(CIActualizar)){
                exists = true;
            }
        }
        if (exists == true){
            for(Paciente p: listaPacientes){
            if(p.getCI().equals(CIActualizar)){
                System.out.println("Ingrese el nombre completo del paciente:");
                String nombreCompleto = x.next();
                p.setNombreCompleto(nombreCompleto);
                System.out.println("Ingrese el CI del paciente:");
                String CI = x.next();
                p.setCI(CI);
                System.out.println("Ingrese la edad del paciente:");
                int edad = x.nextInt();
                p.setEdad(edad);
                System.out.println("Ingrese el peso del paciente:");
                double peso = x.nextDouble();
                p.setPeso(peso);
                System.out.println("Ingrese el diagnostico del paciente:");
                String diagnostico = x.next();
                p.setDiagnostico(diagnostico);
            }
        }
        }
        else
            System.out.println("El paciente no existe");
        }
}
