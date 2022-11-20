package EjerciciosDeClass;

public class Estudiante extends Persona implements intAlumno,intAlumno2{
    String noCuenta;
    String curso;
    String calificacion;

    public Estudiante(String nombre,int edad,String sexo,String direccion,String noCuenta,String curso,String calificacion){
        super(nombre,edad,sexo,direccion);
        this.noCuenta=noCuenta;
        this.curso=curso;
        this.calificacion=calificacion;
    }
public Estudiante(){
        super("Default",0,"X","S/D");
}
    public String getNoCuenta() {
        return noCuenta;
    }

    public String getCurso() {
        return curso;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void verCalificacion(){
        System.out.println("La calificacion es:"+ getNombre()+calificacion);
    }
public void verCurso(){
    System.out.println("El curso es"+curso);
}
//@Override
    public void mostrarinfo(){
        System.out.println("nombre: "+ getNombre());
        System.out.println("edad: "+getEdad());
        System.out.println("sexo: "+getSexo());
        System.out.println("direccion: "+getDireccion());
        System.out.println("No.de cuenta"+noCuenta);
        System.out.println("Curso"+curso);
        System.out.println("Calificacion"+ calificacion);
    }

    @Override
    public void MostrarCurso() {

    }

    @Override
    public void MostrarGrado() {

    }

    @Override
    public int obtenerAñosCarrera() {
        return 0;
    }

    @Override
    public void EntrarCurso() {

    }
}