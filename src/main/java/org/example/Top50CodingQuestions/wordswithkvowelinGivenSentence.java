package org.example.Top50CodingQuestions;

public class wordswithkvowelinGivenSentence {
    public static void main(String[] args){
        String sentence= "I have an apple and orange on the table";
        String[] words=sentence.split(" ");
         for(int i=0;i<words.length;i++){
            String word=words[i];
             word=word.toLowerCase();
            int vowelchar=0;
            for(int j=0;j<word.length();j++){
              char ch=word.charAt(j);
              if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                  vowelchar++;
              }

            }
             int k=3;
             if(vowelchar==k){
                 System.out.println(word);
             }
         }
    }
}
