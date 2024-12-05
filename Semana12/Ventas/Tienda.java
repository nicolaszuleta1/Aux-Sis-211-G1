
import java.util.*;

public class Tienda {

    public static ArrayList <Cliente> listClients= new ArrayList<>();
    public static void main(String[] args) {
        GestionCliente GC = new GestionCliente();
        GC.setVisible(true);
    }

    public static ArrayList<Cliente> ListaClientes(){
        return listClients;
    }
    
}
