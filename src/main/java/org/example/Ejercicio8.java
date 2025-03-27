package org.example;

import java.util.List;

public class Ejercicio8 {
    // Un metodo sum(List<Double> numbers ) que calcula la
    // suma de los números en la lista, si la lista está
    // vacía devuelve 0.

    public static void main(String[] args) {
        var numbers = List.of(2.4, 5.3, 6.2);

        System.out.println(sum(numbers));

    }

    public static Double sum(List<Double> numbers) {
        return numbers
                .stream()
                .reduce(0d, (a, b) -> a + b);
    }


}
