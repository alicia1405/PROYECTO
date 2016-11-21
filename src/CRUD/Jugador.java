
package CRUD;

/**
 *
 * @author Alicia Sandoval
 */
public class Jugador extends Usuario{ 
    private String username;
    private String password;
    private int puntaje;
    
    public Jugador(String nombre,String user,String password,int puntaje){
        super(nombre);
        this.username = user;
        this.password = password;
        this.puntaje = puntaje;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String user) {
        this.username = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}
