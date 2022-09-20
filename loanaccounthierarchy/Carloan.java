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
public class Carloan extends LoanAccountHierarchy {
    //var
    String VINnumber;
      //const
    Carloan(double AnnualInterestRate, double Priciple, int months, String VIN){
        super(AnnualInterestRate, Priciple, months);
        this.VINnumber = VIN;
    }
    //vin number getter
    
     public String getVINnumber(){
        return VINnumber;
    }
     //print out stuff
    
    public String toString(){
        return "Car loan with: \n" + super.toString() + "\n"+
                "Vehicle VIN: \t\t" + getVINnumber()+"\n\n";
    }
    
    
    
    
    
    
    
    
}
