package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1, "tornillo", Set.of("Ferretería", "Tornillo")),
                new Product(2, "tuerca", Set.of("Ferretería", "Tuerca")),
                new Product(3, "lápiz", Set.of("Papelería"))
        );

        var tags = products
                .stream()
                // (A) -> B
                //(A) -> Stream<B>
                .distinct()
                .sorted(Comparator.comparing(Product::getId))
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(tags);
    }
}