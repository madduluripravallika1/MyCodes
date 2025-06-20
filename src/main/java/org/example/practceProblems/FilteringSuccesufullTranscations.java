package org.example.practceProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Transction{
    private int id;
    private double amount;
    private String status;

    public Transction(int id, double amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
public class FilteringSuccesufullTranscations {
    public static void main(String[] args) {
        List<Transction> transctionList=new ArrayList<>();
        transctionList.add(new Transction(101, 500.0, "completed"));
        transctionList.add(new Transction(102, 1500.0, "pending"));
        transctionList.add(new Transction(103, 750.0, "completed"));
        transctionList.add(new Transction(104, 1200.0, "failed"));
        transctionList.add(new Transction(105, 640.0, "completed"));
        transctionList.add(new Transction(106, 230.0, "processing"));
        transctionList.add(new Transction(107, 980.0, "completed"));
        transctionList.add(new Transction(108, 310.0, "pending"));
        transctionList.add(new Transction(109, 450.0, "completed"));
        transctionList.add(new Transction(110, 890.0, "failed"));


        Double myAmount = transctionList.stream()
                .filter(n->n.getStatus().equals("completed"))
                .collect(Collectors.summingDouble(n->n.getAmount()));
        System.out.println(myAmount);
    }
}
