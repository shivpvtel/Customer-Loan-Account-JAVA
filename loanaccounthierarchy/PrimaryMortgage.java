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
public class PrimaryMortgage extends LoanAccountHierarchy{
    //vars
    double PMIamount;
    Adresss Address;
      //const
 PrimaryMortgage ( double AnnualInterestRate, double Priciple, int months, double PMIamount, Adresss Address){
     super(AnnualInterestRate, Priciple, months);
     this.Address = Address;
     this.PMIamount = PMIamount;
     
 }   
 //print out stuuff
 
 public String toString() {
     return "Primary Mortgage loan with \n" +super.toString()+ "\nPMI monthly Amount:\t$" 
             + PMIamount + "\n\n" + Address.toString();
 }
    
}
