package org.example;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1, "tornillo", new HashSet<>(List.of("Ferreteria", "TornillO"))),
                new Product(2, "tuerca", new HashSet<>(List.of("Ferreteria", "Tuerca"))),
                new Product(3, "lápiz", new HashSet<>(List.of("Papeleria")))
                );

        var tags = products
                .stream()
                .sorted(Comparator.comparing(Product::getName))
                .flatMap(p -> p.getTags().stream())
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(tags);

        var numbers = List.of(2, 3, 5);
        var numbers2 = List.of(9, 4, 0);

        List<Integer> result = new ArrayList<>();

        for (var number : numbers) {
            var multiply3 = number * 3;
            var sum3 = multiply3 + 3;
            if (sum3 % 2 == 0) {
                result.add(sum3);
            }
        }

        var result2 = numbers2
                .stream()
                .map(number -> {
                            var res = 0;
                            if (number % 2 == 0) {
                                res = number + 1;
                            } else {
                                res = number + 2;
                            }
                            return res;
                        }
                )
                .map(number -> number + 3)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println(result2);

    }
}