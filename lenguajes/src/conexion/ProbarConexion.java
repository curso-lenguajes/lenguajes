/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProbarConexion {
    public static void main(String[] args) {
        Connection con=null;
        try{
    con=      Conexion.conectarse("campitos", "Conejo197");
         System.out.println("Te conectaste!!");
         //Aqui vienen queries de mysql
            System.out.println("Te conectase muy bien");
        }catch(ClassNotFoundException e){
            System.out.println("Hubo rpobelmas con driver "+e.getMessage());
        }catch(SQLException e){
            System.out.println("Hubo un error de sql "+e.getMessage());
        }finally{
            try {
                if(con!=null)
                con.close();
                System.out.println("Se cierra la conexion");
            } catch (SQLException ex) {
                System.out.println("Hubo este error sin siquiera conectarse ");
            }
        }
        
    }
}
