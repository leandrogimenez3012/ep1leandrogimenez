package tarea8.herencia;

public class Main {

    public static void main(String[] args) {

        Estudiantes estudiante = new Estudiantes(
                "Juan Pérez",
                "5.123.456",
                "2026-001",
                "Ingeniería en Informática"
        );

        System.out.println(estudiante.toString());
    }
}