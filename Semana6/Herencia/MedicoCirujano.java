

public class MedicoCirujano extends Medico{
    String horarios, pacientes, cirujias;

    public MedicoCirujano(int ID, String nombre, String CI, double salario, String horarios, String pacientes, String cirujias){
        this.ID = ID;
        this.nombre = nombre;
        this.CI = CI;
        this.salario = salario;
        this.horarios = horarios;
        this.pacientes = pacientes;
        this.cirujias = cirujias;
    }
    public String getHorarios(){
        return horarios;
    }
    
    public String getPacientes(){
        return pacientes;
    }
    
    public String getCirujias(){
        return cirujias;
    }
    
    public void setHorarios(String horarios){
        this.horarios = horarios;
    }
    
    public void setPacientes(String pacientes){
        this.pacientes = pacientes;
    }
    
    public void setCirujias(String cirujias){
        this.cirujias = cirujias;
    }
}
