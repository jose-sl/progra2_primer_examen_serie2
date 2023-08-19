public class Asignacion {

    Alumno alumno;

    Curso curso[];

    public Asignacion(Alumno alumno, Curso[] curso) {
        System.out.println(String.format("Asignando a %s al curso", alumno.nombre));
        this.alumno = alumno;
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso(Curso[] curso) {
        this.curso = curso;
    }
}
