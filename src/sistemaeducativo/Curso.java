package sistemaeducativo;

public class Curso {
    private String nombreCurso;
    private Profesor profesorAsignado;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.profesorAsignado = null;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    public void asignarProfesor(Profesor profesor) {
        setProfesorAsignado(profesor);
        System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + nombreCurso);
    }

    public void mostrarInformacionCurso() {
        System.out.println("Curso: " + nombreCurso);
        if(profesorAsignado != null) {
            System.out.println("Profesor asignado: " + profesorAsignado.getNombre());
        } else {
            System.out.println("Profesor asignado: Ninguno");
        }
    }
}