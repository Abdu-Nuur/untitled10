package com.company;

public class MyLimitException extends RuntimeException{
    private double remainingAmount;

    public MyLimitException(String massage, double remainingAmount) {
        super(massage);
        this.remainingAmount = remainingAmount;
    }

    public void getRemainingAmount() {
        System.out.println("Сиз акыркы акчанызды алдыныс: " + remainingAmount);
    }
}
