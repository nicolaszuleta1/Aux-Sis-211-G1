

public class MedicoEspecialista extends Medico{
    String area, nivel;

    public MedicoEspecialista(int ID, String nombre, String CI, double salario, String area, String nivel){
        this.ID = ID;
        this.nombre = nombre;
        this.CI = CI;
        this.salario = salario;
        this.area = area;
        this.nivel = nivel;
    }
    public String getArea(){
        return area;
    }
    
    public String getNivel(){
        return nivel;
    }
    
    
    public void setArea(String area){
        this.area = area;
    }
    
    public void setNivel(String nivel){
        this.nivel = nivel;
    }

}
