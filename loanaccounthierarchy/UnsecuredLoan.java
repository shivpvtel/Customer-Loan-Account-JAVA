/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author shiv0248
 */
//extension
public class UnsecuredLoan extends LoanAccountHierarchy {
  //const
 UnsecuredLoan(double AnnualInterestRate, double Priciple, int months){
    super(AnnualInterestRate, Priciple, months);
        
}
 //print out stuff
public String toString(){
    return "Unsecured Load with: \n" + super.toString()+"\n";
}
        
}
