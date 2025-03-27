package org.example;

import java.util.List;

public class Ejercicio7 {

    //Un metodo que recibe una lista de números enteros
    // (numbers) y devuelve otra lista con los números pares
    // que había en numbers
    public static void main(String[] args) {
        var numbers = List.of(2, 5, 6);

        System.out.println(filterEvenNumbers(numbers));
    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
}
