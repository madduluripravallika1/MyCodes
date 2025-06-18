
package org.example.Top50CodingQuestions;

public class CheckingPallindromeOrNot {
    public static void main(String[] args){
        String input="madam";
        boolean isPallindrome=java.util.stream.IntStream.range(0,input.length()/2)
                .allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));
        System.out.println(isPallindrome?"yes it is pallindrom":"no it is not a pallindrome");
    }
}
