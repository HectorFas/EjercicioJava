package EX1;

public class Personas {
    String nombre, apellido1, apellido2;

    public Personas(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String devolverNombreCompleto () {
        String resultado;
        return resultado = apellido1 + apellido2 + nombre;
    }

    boolean esLoMismo(String b) {
        if (b.equals(nombre)) {
            return true;
        } else if (b.equals(apellido1)) {
            return true;
        } else if (b.equals(apellido2)) {
            return true;
        } else  {
            return false;
        }
    }
}
