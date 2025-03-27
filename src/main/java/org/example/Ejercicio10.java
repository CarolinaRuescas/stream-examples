package org.example;

import java.util.List;
import java.util.Optional;

public class Ejercicio10 {

    //Un metodo max(List<Double> numbers ) que busca
    // el máximo de los números en la lista. Como la
    // lista puede estar vacía, el metodo debe devolver
    // Optional<Double>.

    public static void main(String[] args) {
        var numbers = List.of(2.4, 5.3, 6.2);

        System.out.println(max(numbers));
        System.out.println(max(List.of()));

    }

    public static Optional<Double> max(List<Double> numbers) {
        return numbers
                .stream()
                .max(Double::compareTo);
    }

}
