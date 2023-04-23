package modelo;

/**
 *
 * @author DevBuster
 */
public class Alumno {

    // DATOS DEL ALUMNO
    private String nombre;
    private String apellido;
    private int edad;
    private int identificacion;
    private String carrera;
    private int grupo;
    private String semestre;
    private double promedio;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, int identificacion, String carrera, int grupo, String semestre, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.carrera = carrera;
        this.grupo = grupo;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", identificacion=" + identificacion + ", carrera=" + carrera + ", grupo=" + grupo + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
}
