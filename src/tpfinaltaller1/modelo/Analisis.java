package tpfinaltaller1.modelo;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Analisis {
    public Analisis() {
        super();
    }
    private static final int id = 0;
    private int idActual;
    private GregorianCalendar fecha;
    private String apellido;
    private String nombre;
    private String medico;
    private String domicilio;
    private HashMap<String,Double> estudios;
    
    public Double valorEstudio(String nombreEstudio){
       return 0.0;
    }    
}
