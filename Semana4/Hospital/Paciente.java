import java.util.ArrayList;

public class Paciente {
    String nombre, apellido, diagnostico;
    double costo;

    public Paciente(String nombre, String apellido, String diagnostico, double costo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diagnostico = diagnostico;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public static double calcularCostoTotal(ArrayList<Paciente> listaPacientes) {
        double total = 0;
        for (Paciente p : listaPacientes) {
            total += p.getCosto();
        }
        return total;
    }    
}