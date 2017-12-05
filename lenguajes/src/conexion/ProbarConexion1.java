/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.ArrayList;

public class ProbarConexion1 {
    public static void main(String[] args) {
         Connection con=null;
        try{
       con= Conexion.conectarse("root", "root");
         System.out.println("Te conectaste!!");
         //Aqui vienen queries de mysql
            System.out.println("Te conectase muy bien");
        //Caso especial del select
        //Paso 1 generar una consulta(query)
     Statement st=   con.createStatement();
  ResultSet rs=   st.executeQuery("select * from tablita where id=1");
  
  //Viene la traduccion
  ArrayList<Tablita> registros=new ArrayList<>();
  while(rs.next()){
        Tablita t=new Tablita();
        t.setId(rs.getInt(1));
        t.setNombre(rs.getString(2)); 
        registros.add(t);
  }
  
  for(Tablita t:registros){
      System.out.println("id "+t.getId()+" nombre "+t.getNombre());
  }
            st.close();
     
        }catch(ClassNotFoundException e){
            System.out.println("Hubo problema con driver "+e.getMessage());
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
