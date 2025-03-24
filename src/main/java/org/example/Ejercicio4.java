package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {

    // Un metodo sum10(List<Integer> numbers) que dado una lista de enteros, devuelve otra
    // lista de enteros del mismo tamaño en la que se le ha sumado 10 a cada número de la primera lista.

    public static List<Integer> sum10(List<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> number + 10)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 5);
        System.out.println(sum10(numbers));
    }
}
