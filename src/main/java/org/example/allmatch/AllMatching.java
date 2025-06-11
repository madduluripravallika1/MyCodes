package org.example.allmatch;

import java.util.HashSet;
import java.util.Set;

public class AllMatching {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("two Apple");
        fruits.add("three banana");
        fruits.add("two Apple");
        fruits.add("four Apple");
        System.out.println(fruits);
        boolean myResults=fruits.stream()
                .allMatch(str->str.startsWith("One"));
        System.out.println(myResults);
    }
}
