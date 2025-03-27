package org.example;

import java.util.List;
import java.util.Optional;

public class Ejercicio11 {

    // Un metodo min(List<Double> numbers ) que busca el minimo
    // de los numeros en la lista. Como la lista puede estar
    // vacía, el metodo debe devolver Optional<Double>.

    public static void main(String[] args) {
        var numbers = List.of(2.4, 5.3, 6.2);

        System.out.println(min(numbers));
        System.out.println(min(List.of()));
    }

    public static Optional<Double> min(List<Double> numbers) {
        return numbers
                .stream()
                .min(Double::compareTo);
    }
}
