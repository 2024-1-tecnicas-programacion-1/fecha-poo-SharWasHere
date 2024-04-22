package com.mycompany.fecha.poo;
import java.util.HashMap;

public class Fecha {

    private int dia;
    private int mes;
    private int annio;


    /**
     * Complejidad temporal: O(1) Tiempo constante
     */

    public Fecha(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }
     /**
     * Complejidad temporal: O(1) Tiempo constante
     */

    public String fechaCorta() {
        String fecha = dia + "/" + mes + "/" + annio;
        return fecha;
    }
     /**
     * Complejidad temporal: O(1) Tiempo constante
     */

    public boolean validarFecha() {
        if (dia >= 1 && dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
            return true;
        } else if (dia >= 1 && dia <= 29 && (mes == 12 || mes == 6 || mes == 9 || mes == 11)) {
            return true;
        } else if (dia >= 1 && dia <= 28 && mes == 2) {
            return true;
        } else {
            return false;
        }
    }//cierra validar fecha

     /**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String mesLetra() {
        HashMap<Integer, String> meses = new HashMap<>();
        meses.put(1, "enero");
        meses.put(2, "febrero");
        meses.put(3, "marzo");
        meses.put(4, "abril");
        meses.put(5, "mayo");
        meses.put(6, "junio");
        meses.put(7, "julio");
        meses.put(8, "agosto");
        meses.put(9, "septiembre");
        meses.put(10, "octubre");
        meses.put(11, "noviembre");
        meses.put(12, "diciembre");
        
     return meses.get(mes);
    }// cierra mesLetra

     /**
     * Complejidad temporal: O(1) Tiempo constante
     */
   public String fechaLarga(){
       String fechaLar = dia + " de " + mesLetra() + " de " + annio;
       return fechaLar;
   }
}//cierra class

