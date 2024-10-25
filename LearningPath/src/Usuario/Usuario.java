package Usuario;

public class Usuario {

    private String username;
    private String password;
    private String nombre;
    private String rol; 


    public Usuario(String username, String password, String nombre, String rol) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.rol = rol;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }


    public void registrarse(String username, String password, String nombre, String rol) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.rol = rol;
        System.out.println("Registro exitoso de: " + this.nombre);
    }
}
