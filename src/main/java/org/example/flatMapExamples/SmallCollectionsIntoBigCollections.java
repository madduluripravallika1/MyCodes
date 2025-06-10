package org.example.flatMapExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallCollectionsIntoBigCollections {
    public  void method1(){
        List<String> myStr1= Arrays.asList("scoot","David","Ram");
        List<String> myStr2= Arrays.asList("Krishna","kamal","govind");
        List<String> myStr3= Arrays.asList("saru","ragiv","Ravan");

        List<List<String>> mineCollection=Arrays.asList(myStr1,myStr2,myStr3);

        List<String> mi= mineCollection.stream()
                .flatMap(n->n.stream())
                .collect(Collectors.toList());
        System.out.println(mi);
    }
        public static void main(String[] args) {
            SmallCollectionsIntoBigCollections ss=new SmallCollectionsIntoBigCollections();
            ss.method1();
        }
    }

