package org.example;

import java.util.List;

public class Ejercicio1 {

    // Escribe un programa que cree un ArrayList y lo rellene
    // con varios String. Luego conviértelo en un Stream y
    // recórrelo mostrando en pantalla cada elemento

    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Pepa", "Geore");

        names
                .stream()
                .forEach(System.out::println);
    }


}
