import java.io.Serializable;

public class Estudiante implements Serializable{
    String nombre, CI;
    int semestre;
    double pago;

    public Estudiante(String nombre, String CI, int semestre) {
        this.nombre = nombre;
        this.CI = CI;
        this.semestre = semestre;
        pago = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

}
