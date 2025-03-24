package org.example;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String name = "Al";

        System.out.println(getThirdLetter(Optional.ofNullable(name)));


        var avg1Opt = average(List.of(2.0, 3.5, 4.3));

        var avg2Opt = average(List.of());

        var sumOpt = avg1Opt
                .flatMap(
                        avg1 ->
                                avg2Opt.map(avg2 ->
                                        avg1 + avg2
                                )
                );
        //var res = avg1 + avg2;
        Optional<Double> number = Optional.of(4.5);
        double sum = number.orElse(0d);
        System.out.println(sum);
    }

    public static Optional<Double> average(List<Double> numbers) {
        if (numbers.size() == 0) {
            return Optional.empty();
        } else {
            double sum = 0;
            for (var number : numbers) {
                sum += number;
            }
            return Optional.of(sum / numbers.size());
        }
    }

    public static Optional<String> getThirdLetter(Optional<String> nameOpt) {
        return nameOpt
                .flatMap(name -> {
                            if (name.length() >= 3) {
                                return Optional.of(name.substring(2, 3));
                            } else {
                                return Optional.empty();
                            }
                        }
                );

    }

    public static String getThirdLetter(String name) {

        return name.substring(0, 1);
    }
}