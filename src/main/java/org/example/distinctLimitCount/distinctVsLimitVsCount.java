package org.example.distinctLimitCount;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class distinctVsLimitVsCount {
    public static void main(String[] args) {
        List<String> vechicle= Arrays.asList("Bus","car","auto","bike","Bus","car","auto","bike","cycle","scooty");
        List<String> distinctvechiles=vechicle.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctvechiles);

        long counting=vechicle.stream()
                .distinct()
                .count();
        System.out.println(counting);



        List<String> limiting= vechicle.stream()
                .distinct()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(limiting);
    }
}
