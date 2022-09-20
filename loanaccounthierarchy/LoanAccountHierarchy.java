/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanaccounthierarchy;


/**
 *
 * @author shiv0248
 */
//main class so to speak
public class LoanAccountHierarchy {
    //vars, spelt principle wrong so 
    double AnnualInterestRate, Priciple;
    int months;
    //const
    LoanAccountHierarchy (double AnnualInterestRate, double Priciple, int months){
        this.AnnualInterestRate = AnnualInterestRate;
        this.Priciple = Priciple;
        this.months = months; 
    }
  
   //gets
    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    
    public double getPriciple(){
        return Priciple;
    }
    public float getmonths (){
        return months;
    }
   
    public double MonthlyPaymentCalc (){
        double MonthlyInterest = AnnualInterestRate/12;
        double MonthlyPayment = Priciple * ((MonthlyInterest/100) /  (1 - Math.pow(1 + (MonthlyInterest/100), -months)));
         
        return MonthlyPayment;  
    }
   
    
//printer
    public String toString(){
        return "Priciple:   \t\t$" + getPriciple() + "\nAnnual Interest rate:\t" +
                getAnnualInterestRate() + "%"+ "\nTerm of loan in months: " +
                getmonths() + "\nMonthly payment: \t$" + String.format("%.3f", MonthlyPaymentCalc()) ;
    }
    
}
