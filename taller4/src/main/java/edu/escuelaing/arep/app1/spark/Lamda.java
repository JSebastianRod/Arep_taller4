package edu.escuelaing.arep.app1.spark;

import java.util.HashMap;
import java.util.Map;

public class Lamda {
    static Map<String, Serviciostr> servicios = new HashMap<String, Serviciostr>();

    public static void main(String[] args) {
        
    }

    public static void agregar(String key, Serviciostr servicio) {
        servicios.put(key, servicio);
    }

    public static Serviciostr buscar(String key) {
        return servicios.get(key);
    }
}
