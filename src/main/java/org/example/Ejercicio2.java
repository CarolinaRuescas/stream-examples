package org.example;

import java.util.List;
import java.util.Optional;

public class Ejercicio2 {


    // Escribe un metodo first(List<String> list) que dada una lista
    // de String y devuelva el que está en la primera posición. Si la lista
    // está vacía devuelve null.
    public static void main(String[] args) {
        List<String> names = List.of("Bob");
        List<Integer> numbers = List.of(1, 2, 3);

        Optional<String> name = second(names);
        System.out.println(name);
        Optional<Integer> number = last(numbers);
        System.out.println(number);
    }

    public static <T> Optional<T> first(List<T> list) {
        return list
                .stream()
                .findFirst();
    }

    public static <T> Optional<T> second(List<T> list) {
        return list
                .stream()
                // Me salto el primero
                .skip(1)
                // Saco el primero del nuevo stream, que es el segundo de list
                .findFirst();
    }

    public static <T> Optional<T> last(List<T> list) {
        return list
                .stream()
                // Me salto todos hasta el penúltimo
                .skip(list.size() - 1)
                // El siguiente es el último de list
                .findFirst();
    }
}