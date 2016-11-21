
package CRUD;

/**
 *
 * @author Alicia Sandoval
 */
public abstract class Usuario implements Datos{
    
    private String nombre;

    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nom){
        this.nombre = nombre;
    }
    
    public abstract String getUsername();
    public abstract void setUsername(String user);
    public abstract String getPassword();
    public abstract void setPassword(String password);
    public abstract int getPuntaje();
    public abstract void setPuntaje(int puntaje);
}


