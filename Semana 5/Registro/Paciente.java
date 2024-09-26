
public class Paciente {
    String nombreCompleto, CI, diagnostico ;
    int edad;
    double peso;

    public Paciente(String nombreCompleto, String CI, String diagnostico, int edad, double peso) {
        this.nombreCompleto = nombreCompleto;
        this.CI = CI;
        this.diagnostico = diagnostico;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
