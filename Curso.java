public class Curso {

    int id;

    String titulo;

    int numMaxAlumnos;

    int creditos;

    Catedratico catedratico;

    int alumnosAsignados = 0;

    public void actualizarCupo() {
        ++alumnosAsignados;
    }

    public Curso(int id, String titulo, int numMaxAlumnos, int creditos, Catedratico catedratico) {
        this.id = id;
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
    }

    public boolean verificarEspacio() {
        // Metodo utilizado para verificar si aun hay espacio en el curso
        String respuesta = "";

        if (alumnosAsignados < numMaxAlumnos) {
            System.out.println(String.format("☑ El curso de %s cuenta con espacio disponible.", titulo));
            return true;
        }else{
            System.out.println(String.format("☒ El curso de %s no tiene cupo disponible.", titulo));
            return false;
        }
    }

    public void imprimirDatosCurso() {
        System.out.println("Curso{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", numMaxAlumnos=" + numMaxAlumnos +
                ", creditos=" + creditos +
                ", catedratico=" + catedratico +
                '}');
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public void setNumMaxAlumnos(int numMaxAlumnos) {
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public int getAlumnosAsignados() {
        return alumnosAsignados;
    }

    public void setAlumnosAsignados(int alumnosAsignados) {
        this.alumnosAsignados = alumnosAsignados;
    }
}
