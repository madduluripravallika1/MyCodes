package org.example.allmatch;

import java.util.HashSet;
import java.util.Set;

public class NoneMatching {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("One Apple");
        fruits.add("five Mango");
        fruits.add("Six Apple");
        fruits.add("three banana");
        fruits.add("two Apple");
        fruits.add("four Apple");
        System.out.println(fruits);
        boolean mybooleans=fruits.stream()
                .noneMatch(str->str.startsWith("One"));
        System.out.println(mybooleans);
    }
}
