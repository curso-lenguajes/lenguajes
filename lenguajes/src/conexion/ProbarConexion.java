/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;

public class ProbarConexion {
    public static void main(String[] args) {
         Connection con=null;
        try{
       con= Conexion.conectarse("root", "root");
         System.out.println("Te conectaste!!");
         //Aqui vienen queries de mysql
            System.out.println("Te conectase muy bien");
        //Con la conexion que se llama con
        //vamos a generar una sentencia, la cual es una clase
     // Statement st= con.createStatement();
      //Generamos la tablita no le den enter y si voy y le dieron enter
      //yo su profesor les dare un borradorazo!!!!
   // st.execute("create table tablita(id integer primary key, "
    //        + "nombre varchar(40) )");
    
    //Caso 1: Insert
PreparedStatement st=con.prepareStatement("update tablita set nombre=? where id=?");
    
    //tambien se cierran las sentencias al igual que las conexiones
    st.close();
    
        
      
            
            
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
            }
        }
        
    }
            }
