public class Main {

    static int serial = 0;

    public static void main (String args[]) {

        System.out.println("### INICIANDO PROGRAMA DE ASIGNACIONES DE CURSOS ###");
        System.out.println("--- Iniciando creación de catedráticos ---");
        // Creación de catedraticos
        Catedratico jorge = new Catedratico("Jorge A", "Ciudad", "+50211111111", "Ciencias");
        jorge.imprimirDatos();

        Catedratico cristian = new Catedratico("Cristian M", "Ciudad", "+50222222222", "Matemáticas");
        cristian.imprimirDatos();

        Catedratico jose = new Catedratico("José L", "Ciudad", "+50233333333", "Química");
        jose.imprimirDatos();

        System.out.println("--- Finalizando creación de catedráticos ---");
        System.out.println("--- Iniciando creación de cursos ---");

        // Creación de cursos
        Curso ciencias = new Curso(1, "Ciencias", 2, 10, jorge);
        ciencias.imprimirDatosCurso();

        Curso mate = new Curso(2, "Matemáticas", 5, 15, cristian);
        mate.imprimirDatosCurso();

        Curso quimica = new Curso(3, "Química", 5, 10, jose);
        quimica.imprimirDatosCurso();

        System.out.println("--- Finalizando creación de cursos ---");
        System.out.println("--- Iniciando creación de alumnos ---");

        // Creación de alumnos
        Alumno maria = new Alumno(generarNuevoCarnet(), "Maria S", "Ciudad", "50233333333", "19");
        maria.imprimirDatos();

        Alumno rodolfo = new Alumno(generarNuevoCarnet(), "Rodolfo R", "Ciudad", "50244444444", "19");
        rodolfo.imprimirDatos();

        Alumno juan = new Alumno(generarNuevoCarnet(), "Juan R", "Ciudad", "50255555555", "18");
        juan.imprimirDatos();

        System.out.println("--- Finalizando creación de alumnos ---");
        System.out.println("--- Iniciando asignaciones de cursos ---");

        // Asignación de cursos
        Asignacion asignacionMaria = null;
        Asignacion asignacionRodolfo = null;
        Asignacion asignacionJuan = null;
        Curso cursosMaria[] = new Curso[3];
        Curso cursosRodolfo[] = new Curso[3];
        Curso cursosJuan[] = new Curso[3];

        System.out.println("---- CIENCIAS ----");
        // Asignaciones de CIENCIAS
        if (ciencias.verificarEspacio()) {
            cursosMaria[0] = ciencias;
            asignacionMaria = new Asignacion(maria, cursosMaria);
            ciencias.actualizarCupo();
        }

        if (ciencias.verificarEspacio()) {
            cursosRodolfo[0] = ciencias;
            asignacionRodolfo = new Asignacion(rodolfo, cursosRodolfo);
            ciencias.actualizarCupo();
        }

        if (ciencias.verificarEspacio()) {
            cursosJuan[0] = ciencias;
            asignacionJuan = new Asignacion(juan, cursosJuan);
            ciencias.actualizarCupo();
        }

        System.out.println("---- MATE ----");
        // Asignaciones de MATE
        if (mate.verificarEspacio()) {
            cursosMaria[1] = mate;
            asignacionMaria = new Asignacion(maria, cursosMaria);
            mate.actualizarCupo();
        }

        if (mate.verificarEspacio()) {
            cursosRodolfo[1] = mate;
            asignacionRodolfo = new Asignacion(rodolfo, cursosRodolfo);
            mate.actualizarCupo();
        }

        if (mate.verificarEspacio()) {
            cursosJuan[1] = mate;
            asignacionJuan = new Asignacion(juan, cursosJuan);
            mate.actualizarCupo();
        }

        System.out.println("---- QUIMICA ----");
        // Asignaciones de QUIMICA
        if (quimica.verificarEspacio()) {
            cursosMaria[2] = quimica;
            asignacionMaria = new Asignacion(maria, cursosMaria);
            quimica.actualizarCupo();
        }

        if (quimica.verificarEspacio()) {
            cursosRodolfo[2] = quimica;
            asignacionRodolfo = new Asignacion(rodolfo, cursosRodolfo);
            quimica.actualizarCupo();
        }

        if (quimica.verificarEspacio()) {
            cursosJuan[2] = quimica;
            asignacionJuan = new Asignacion(juan, cursosJuan);
            quimica.actualizarCupo();
        }

        System.out.println("--- Finalizando asignaciones de cursos ---");
        System.out.println("--- RESUMEN DE ASIGNACIONES ---");

        System.out.println("** Asignaciones de Maria:");
        for (Curso cursoAsignado : asignacionMaria.getCurso()) {
            if (cursoAsignado != null)
                System.out.println(String.format("* %s", cursoAsignado.getTitulo()));
        }

        System.out.println("** Asignaciones de Rodolfo:");
        for (Curso cursoAsignado : asignacionRodolfo.getCurso()) {
            if (cursoAsignado != null)
                System.out.println(String.format("* %s", cursoAsignado.getTitulo()));
        }

        System.out.println("** Asignaciones de Juan:");
        for (Curso cursoAsignado : asignacionJuan.getCurso()) {
            if (cursoAsignado != null)
                System.out.println(String.format("* %s", cursoAsignado.getTitulo()));
        }

        System.out.println("### FINALIZANDO PROGRAMA DE ASIGNACIONES DE CURSOS ###");
    }

    private static int generarNuevoCarnet() {
        int correlativoMaximo = 5;
        String codigoInicial = "3190";
        String codigoFinal = "%1$s%2$s";
        String correlativo = "%s";
        int id = ++serial;

        for (int i = 0; i < (correlativoMaximo - String.valueOf(id).length()); i++)
            correlativo = String.format(correlativo, "0%s");
        correlativo = String.format(correlativo, id);
        codigoFinal = String.format(codigoFinal, codigoInicial, correlativo);

        return Integer.parseInt(codigoFinal);
    }
}
