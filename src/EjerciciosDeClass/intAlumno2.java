package EjerciciosDeClass;

public interface intAlumno2 {
void MostrarGrado();
int obtenerAñosCarrera();
public abstract void EntrarCurso();
default void MostrarHorario(){
    System.out.println("Horario corrido");
}
}
