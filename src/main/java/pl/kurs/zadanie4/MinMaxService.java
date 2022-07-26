package pl.kurs.zadanie4;

import java.util.Collections;
import java.util.List;

public class MinMaxService {
    public static MinMax<Comparable> getMinAndMax(List<Comparable> elements){
        Collections.sort(elements);
        return new MinMax(Collections.max(elements), Collections.min(elements));
    }

}


