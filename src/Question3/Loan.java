/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Sushma Nalla
 */
public class Loan {
    private double Amount;
    private double InterestRate;
    private int noOfYears;

    public Loan(double Amount, double InterestRate, int noOfYears) {
        this.Amount = Amount;
        this.InterestRate = InterestRate;
        this.noOfYears = noOfYears;
    }

    public Loan() {
        this(1500,3,2);
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }

    @Override
    public String toString() {
        return "Amount= " + Amount + ", InterestRate= " + InterestRate + ", noOfYears= " + noOfYears ;
    }
    
}

