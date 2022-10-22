/*Cada cliente tiene nombre, teléfono y mail (que debe ser de gmail o yahoo).
La única validación a realizar es que el mail tenga formato correcto. Los formatos aceptados son:
usuario@gmail.com o usuario@yahoo.com. “usuario” no puede contener @ ni espacios. No se solicita
validar que el email exista efectivamente. */
package Ejercicio2;

import java.util.Arrays;

/**
 *
 * @author ylian
 */
public class Cliente {
    private static final String[] DominiosValidos = {"gmail.com", "yahoo.com"}; 
    
    private String nombre;
    private String telefono;
    private String mail;
    
    public Cliente(String unNombre, String unTelefono, String unMail) {
        this.nombre = unNombre;
        this.telefono = unTelefono;
        if (mailValido(unMail)) {
            this.mail = unMail;
        } else {
            this.mail = "username@domain.com";
            System.out.println("ERROR: el usuario " +this.nombre + " tiene un mail invalido. "
                    + "\nConfigure uno nuevo usando setMail()");
        }
    }
    
    private static boolean mailValido(String unEmail) {
        String[] separado = unEmail.split("@");
        String usuario = separado[0];
        String dominio = separado[1];
        
        boolean esDominioValido = Arrays.asList(DominiosValidos).contains(dominio);
        boolean esUsuarioValido = !(usuario.contains(" ") || dominio.contains("@"));
        
        return esDominioValido && esUsuarioValido;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    
    public void setTelefono(String unTelefono) {
        this.telefono = unTelefono;
    }
    
    public void setMail(String unMail) {
        this.mail = unMail;
    }
    
    @Override
    public String toString() {
        return "Nombre: " +this.nombre + "\n Telefono: " +this.telefono + "\n Mail: " +this.mail;
    }
}
