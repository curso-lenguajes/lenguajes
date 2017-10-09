/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

/**
 *
 * @author rapid
 */
public class SolucionEcuacion {

    private EcuacionCuadratica ecuacion;
    
    public String[] calcularRaices() {
        String[] raices = {"x1", "x2"};
        float disc = (float) Math.pow(ecuacion.getA(), 2) - 4 * ecuacion.getA() * ecuacion.getC();
        if (disc < 0) {
            raices[0] = "imginaria";
            raices[1] = "imaginaria";
        } else {
            raices[0] = (float) (-ecuacion.getB() + Math.sqrt(disc)) / (2 * ecuacion.getA()) + "";
            raices[1] = (float) (-ecuacion.getB() - Math.sqrt(disc)) / (2 * ecuacion.getA()) + "";
        }
        return raices;
    }
    
    public EcuacionCuadratica getEcuacion() {
        return ecuacion;
    }
    
    public void setEcuacion(EcuacionCuadratica ecuacion) {
        this.ecuacion = ecuacion;
    }
}
