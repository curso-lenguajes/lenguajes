/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author rapid
 */
public class NumeroNegativoException extends Exception{
    public NumeroNegativoException(){
        super("Metiste un numero negativo!!");
    }
}
