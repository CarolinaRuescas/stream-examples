package org.example;

import java.util.List;
import java.util.Optional;

public class Ejercicio9 {
    // Un metodo average(List<Double> numbers ) que calcula
    // la media de los números en la lista. Como la lista
    // puede estar vacía, el metodo debe devolver
    // Optional<Double>.

    public static void main(String[] args) {
        var numbers = List.of(2.4, 5.3, 6.2);

        System.out.println(average(numbers));
        System.out.println(average(List.of()));

    }

    public static Optional<Double> average(List<Double> numbers) {
        Optional<Double> sumOpt = numbers
                .stream()
                .reduce(Double::sum);

        return sumOpt
                .map(sum -> sum / numbers.size());
    }
}
