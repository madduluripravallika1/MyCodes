package org.example.flatMapExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithOutFlatMap {
    public void method1() {
        List<Integer> values = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
        List<Integer> names=values.stream()
                .map(v->v+10)
                .collect(Collectors.toList());
        System.out.println(names);

    }

    public static void main(String[] args) {
        WithOutFlatMap mapVSFlatMap=new WithOutFlatMap();
        mapVSFlatMap.method1();
    }
}
