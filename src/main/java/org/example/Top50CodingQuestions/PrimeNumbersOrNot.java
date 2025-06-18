package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class PrimeNumbersOrNot {
    public static void main(String[] args) {
        List<Integer> myList= Arrays.asList(2,3,5,7,11,13,17,19);
        boolean isPrimeOrNot=myList.stream()
                .anyMatch(num->isprime(num));
        System.out.println(isPrimeOrNot);
    }
    public static boolean isprime(int nums){
        if(nums<=1) return false;
        for(int i=2;i<=Math.sqrt(nums);i++){
            if(nums % i == 0) return false;
        }
        return  true;
    }
}
