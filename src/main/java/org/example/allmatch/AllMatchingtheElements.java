package org.example.allmatch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllMatchingtheElements {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("two Apple");
        fruits.add("three banana");
        fruits.add("two Apple");
        fruits.add("four Apple");
        System.out.println(fruits);

        boolean result=fruits.stream()
                .anyMatch(str->str.startsWith("One"));
        System.out.println(result);
    }
}
