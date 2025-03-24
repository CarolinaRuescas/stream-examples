package org.example;

import java.util.List;

public class Ejercicio5 {
    // Un metodo List<Student> filterByZipCode(List<Student> students, int zipCode) que
    // dada una lista de estudiantes y un código postal, devuelva una lista con los estudiantes
    // que vivan en ese código postal

    public static List<String> mapToEmails(List<Student> students) {
        return students
                .stream()
                .map(Student::getEmail)
                .toList();
    }
}
