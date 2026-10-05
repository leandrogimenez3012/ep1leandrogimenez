package tarea8.herencia;

public class Estudiantes extends Persona {

    private String matricula;
    private String carrera;

    public Estudiantes(String nombre, String cedula, String matricula, String carrera) {
        super(nombre, cedula);

        this.matricula = matricula;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nMatrícula: " + matricula
                + "\nCarrera: " + carrera;
    }
}