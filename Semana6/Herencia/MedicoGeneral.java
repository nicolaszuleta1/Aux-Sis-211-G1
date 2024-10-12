

public class MedicoGeneral extends Medico{
    String consultorio, ubicacion;
    
    public MedicoGeneral(int ID, String nombre, String CI, double salario, String consultorio, String ubicacion){
        this.ID = ID;
        this.nombre = nombre;
        this.CI = CI;
        this.salario = salario;
        this.consultorio = consultorio;
        this. ubicacion = ubicacion;
    }

    public String getConsultorio(){
        return consultorio;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    
    public void setConsultorio(String consultorio){
        this.consultorio = consultorio;
    }
    
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

}
