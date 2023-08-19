public class Alumno {

    int carnet;

    String nombre;

    String direccion;

    String telefono;

    String edad;

    public Alumno(int carnet, String nombre, String direccion, String telefono, String edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimirDatos() {
        // Sirve para imprimir en consola los dados de la instancia que se creó
        System.out.println("Alumno{" +
                "carnet=" + carnet +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad='" + edad + '\'' +
                '}');
    }
}
