package pl.kurs.zadanie4;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(10);
        integers.add(4);
        strings.add("Kamil");
        strings.add("asdasd");
        strings.add("aksdl");
        MinMax minMax = new MinMax();
        System.out.println(minMax.getMin(integers));
        System.out.println(minMax.getMax(integers));
        System.out.println(minMax.getMax(strings));
        System.out.println(minMax.getMin(strings));



    }
}
