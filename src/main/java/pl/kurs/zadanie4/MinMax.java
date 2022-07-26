package pl.kurs.zadanie4;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinMax<T extends Comparable> {
    private T max;
    private T min;

    public MinMax() {
    }

    public MinMax(T max, T min) {
        this.max = max;
        this.min = min;
    }

    public T getMax(List<Comparable> elements) {
        return (T) MinMaxService.getMinAndMax(elements).max;
    }

    public T getMin(List<Comparable> elements) {
        return (T) MinMaxService.getMinAndMax(elements).min;
    }

}
