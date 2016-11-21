
package CRUD;

/**
 *
 * @author Alicia Sandoval
 */
public interface Datos {
    public String getNombre();
    public void setNombre(String nombre);   
    public abstract String getUsername();
    public abstract void setUsername(String user);
    public abstract String getPassword();
    public abstract void setPassword(String password);
    public abstract int getPuntaje();
    public abstract void setPuntaje(int punt);
    
}
