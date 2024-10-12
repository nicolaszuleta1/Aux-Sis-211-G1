
public class Medico {
    String nombre, CI;
    int ID;
    double salario;

    public String getNombre(){
        return nombre;
    }
    
    public String getCI(){
        return CI;
    }
    
    public int getID(){
        return ID;
    }
    
    public double getSalario(){
        return salario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCI(String CI){
        this.CI = CI;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public static void main(String[] args) {
        MedicoGeneral medico1 = new MedicoGeneral (1, "Juan", "12313132", 2500.6 , "Pediatra", "Calle Sucre");
        MedicoEspecialista medico2 = new MedicoEspecialista (2, "Carlos", "6456456", 4000.5 , "Pediatria", "5");
        MedicoCirujano medico3 = new MedicoCirujano (3, "Nicolas", "1241241", 5000.5 , "10 am, 7 pm", "Maria, Ana, Pedro","Apendicitis, etc.");
        
        System.out.println("----------------");
        System.out.println(medico1.getID());
        System.out.println(medico1.getCI());
        System.out.println(medico1.getNombre());
        System.out.println(medico1.getSalario());
        System.out.println(medico1.getConsultorio());
        System.out.println(medico1.getUbicacion());
        System.out.println("----------------");

        System.out.println("----------------");
        System.out.println(medico2.getID());
        System.out.println(medico2.getCI());
        System.out.println(medico2.getNombre());
        System.out.println(medico2.getSalario());
        System.out.println(medico2.getArea());
        System.out.println(medico2.getNivel());
        System.out.println("----------------");

        System.out.println("----------------");
        System.out.println(medico3.getID());
        System.out.println(medico3.getCI());
        System.out.println(medico3.getNombre());
        System.out.println(medico3.getSalario());
        System.out.println(medico3.getHorarios());
        System.out.println(medico3.getPacientes());
        System.out.println(medico3.getCirujias());
        System.out.println("----------------");

    }
}
