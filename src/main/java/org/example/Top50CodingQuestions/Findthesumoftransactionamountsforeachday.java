package org.example.Top50CodingQuestions;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Transcations{
    private   final String date;
    private    final double amount;

     public Transcations(String date, double amount) {
         this.date = date;
         this.amount = amount;
     }

     public String getDate() {
         return date;
     }

     public double getAmount() {
         return amount;
     }

 }
public class Findthesumoftransactionamountsforeachday {
    public static void main(String[] args) {
    ArrayList<Transcations> transcations=new ArrayList<>();
      transcations.add(new Transcations("20-10-2020",100.5));
        transcations.add(new Transcations("20-10-2020", 100.5));
        transcations.add(new Transcations("21-10-2020", 200.0));
        transcations.add(new Transcations("20-10-2020", 150.0));
        transcations.add(new Transcations("22-10-2020", 300.0));
        transcations.add(new Transcations("21-10-2020", 100.0));
        transcations.add(new Transcations("22-10-2020", 50.5));
        transcations.add(new Transcations("20-10-2020", 120.0));


       Map<String, Double> myvalue =transcations.stream()
                .collect(Collectors.groupingBy(
                        Transcations::getDate,Collectors.summingDouble(Transcations::getAmount)
                ));
        System.out.println(myvalue);

    }
}
