package CRUD;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsultasBD {

    Conexion baseDatos = new Conexion().conectar("localhost", "aplicacion", "root", "");

   
    public ArrayList<Datos> consultarUsuario() {
        ArrayList<Datos> result = new ArrayList();
        ResultSet rs = baseDatos.consultar("SELECT * FROM usuario");
        if (rs != null) {
            try {
                while (rs.next()) {
                    result.add(new Jugador(rs.getString("nombre"),                           
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getInt("puntaje")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public Datos buscarUser(String bus) {
        Datos us = null;
        ResultSet rs = baseDatos.consultar("SELECT * FROM usuario "
                + "where Nombre='" + bus + "'");
        if (rs != null) {
            try {
                while (rs.next()) {
                    us = new Jugador(rs.getString("nombre"),                           
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getInt("puntaje"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return us;
    }

    public void insertarUsuario(String n, String u,String p) {
        if (baseDatos.ejecutar("INSERT INTO usuario VALUES ('" + n +"', '" + u + "', '" + p + "')")) {
            System.out.println("Ejecucion Correcta");
        } else {
            System.out.println("Ocurrio un problema al insertar");
        }
    }

    
   
}