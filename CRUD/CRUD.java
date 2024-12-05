package CRUD;

import java.util.*;

public class CRUD {

    public static ArrayList <Usuario> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Registro r = new Registro();
        r.setVisible(true);
        
        Tabla t = new Tabla();
        t.setVisible(true);
        
        InicioSesion s = new InicioSesion();
        s.setVisible(true);
        
    }

    public static void agregarUsuario(Usuario usuario) {
        lista.add(usuario);
    }

    public static ArrayList<Usuario> obtenerLista() {
        return lista;
    }
    
}