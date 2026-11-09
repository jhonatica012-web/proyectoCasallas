
package Logica;


public class Cuenta {
    private String nombre;
    private String usuario;
    private String clave;
    private String confirmar;

    public Cuenta(String nombre, String usuario, String clave, String confirmar) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.confirmar = confirmar;
    }

    public String getCofirmar() {
        return confirmar;
    }

    public void setCofirmar(String Cofirmar) {
        this.confirmar = confirmar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String Clave) {
        this.clave = clave;
    }
    
    
    
}
