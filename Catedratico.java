public class Catedratico {

    static int codigoCatedratico = 0;

    String nombre;

    String direccion;

    String telefono;

    String profesion;

    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        // Se genera un id autoincrementable por cada instancia que se genera
        setCodigoCatedratico(++codigoCatedratico);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    public void imprimirDatos() {
        // Sirve para imprimir en consola los dados de la instancia que se creó
        System.out.println("Catedratico{" +
                "codigoCatedratico=" + codigoCatedratico +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", profesion='" + profesion + '\'' +
                '}');
    }

    public static int getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public static void setCodigoCatedratico(int codigoCatedratico) {
        Catedratico.codigoCatedratico = codigoCatedratico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
