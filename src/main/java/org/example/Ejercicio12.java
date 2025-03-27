package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio12 {
    // Un metodo junction(List<Double> numbers1 ,
    //  List<Double> numbers2) que dadas dos listas de
    //  números, devuelve los números que están tanto
    //  numbers1 como en numbers2

    public static void main(String[] args) {
        var numbers1 = List.of(2.4, 5.3, 6.2);
        var numbers2 = List.of(2.4, 6.8, 6.2);

        System.out.println(junction(numbers1, numbers2));
    }

    public static <T> List<T> junction(
            List<T> numbers1,
            List<T> numbers2
    ) {
        Set<T> numbers2Set = new HashSet<>(numbers2);

        return numbers1
                .stream()
                .filter(numbers2Set::contains)
                .toList();
    }

}
