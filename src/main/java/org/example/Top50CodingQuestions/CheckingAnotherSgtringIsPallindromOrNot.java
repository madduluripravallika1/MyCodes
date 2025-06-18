package org.example.Top50CodingQuestions;

public class CheckingAnotherSgtringIsPallindromOrNot {
    public static void main(String[] args) {
        String input="1001";

        boolean isPallindrome=java.util.stream.IntStream.range(0,input.length()/2)
                .allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));

        System.out.println(isPallindrome?"Yes given input is pallindrom":"No it's Not a pallindrome");
    }
}
