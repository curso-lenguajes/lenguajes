/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rapid
 */
public class Primero extends Thread{
    
    public void run(){
        while(true){
        //Aqui pones la accion de tu Thread
        System.out.println("Soy un thread que no hago nada");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Primero.class.getName()).log(Level.SEVERE, null, ex);
            }
             }
        
    }
    
}
