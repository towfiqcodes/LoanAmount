package com.backerror.rit.loanamount;

public class LoanAmount {

    private double BankloanAmount;
    private double interestRate;
    private int year;
    private double loanPayable;

    public void setLoanPayable(double loanPayable) {
        this.loanPayable =loanPayable ;
    }

    public double getLoanPayable() {
        return (BankloanAmount*interestRate*year)/100;
    }

    public LoanAmount(double loanPayable) {

        this.loanPayable = loanPayable;
    }

    public LoanAmount(double BankloanAmount, double interestRate, int year) {
        this.BankloanAmount = BankloanAmount;
        this.interestRate = interestRate;
        this.year = year;
    }


    public double getBankloanAmount() {
        return BankloanAmount;
    }

    public void setBankloanAmount(double BankloanAmount) {
        this.BankloanAmount = BankloanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public double getCalculation(){
       double payableAmount=BankloanAmount+getLoanPayable();
        return payableAmount ;
    }
}
