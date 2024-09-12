import java.util.*;

public class Hospital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        
        while (true) {
            int n = 1;
            System.out.println("Ingrese los datos del paciente:");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Diagnóstico: ");
            String diagnostico = scanner.nextLine();
            System.out.print("Costo: ");
            double costo = scanner.nextDouble();
            scanner.nextLine();
            Paciente paciente = new Paciente(nombre, apellido, diagnostico, costo);
            listaPacientes.add(paciente);
            System.out.println("Listado de pacientes registrados:");
        for (Paciente p : listaPacientes) {
            System.out.println("Paciente N"+ n +":");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("Diagnóstico: " + p.getDiagnostico());
            System.out.println("Costo del tratamiento: " + p.getCosto());
            System.out.println("-----------------------------------");
            n++;
        }
        System.out.println("El costo total de todos los pacientes es: " + Paciente.calcularCostoTotal(listaPacientes));   
    }
    }
}
