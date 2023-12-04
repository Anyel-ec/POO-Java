package org.empresa.app.model;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private String carrera;
    private String matricula;

    public Estudiante(String nombre, String apellido, int edad, String cedula, LocalDate fechaNacimiento, String carrera, String matricula) {
        super(nombre, apellido, edad, cedula, fechaNacimiento);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public Estudiante() {
        super();
    }

    public String getCarrera() {
        return carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", matricula='" + matricula + '\'' +
                "} " + super.toString();
    }
}
