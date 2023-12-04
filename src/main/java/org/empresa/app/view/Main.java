package org.empresa.app.view;
import org.empresa.app.model.Estudiante;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estudiante anyel = new Estudiante("Anyel", "Gomez", 20, "001-0000000-0", LocalDate.of(2000, 1, 1), "Ing. Sistemas", "2019-0000");
        System.out.println(anyel);
    }
}
