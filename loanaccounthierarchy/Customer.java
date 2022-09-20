/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package loanaccounthierarchy; 

import java.util.ArrayList;


/*
 * 
 * @author shiv0248
 * 
 */

 public class Customer {
     
    private String FirstName, LastName, SSN;

    Customer(String FirstName, String LastName, String SSN) {
            this.FirstName = FirstName;
             this.LastName = LastName;
             this.SSN = SSN;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
           
    public String getfirstname(){
        return FirstName;
    }
     public String getlastname(){
        return LastName;
    }
    public String getsocials(){
        return SSN;
    }
    
  ArrayList<LoanAccountHierarchy> Loanacc = new ArrayList<LoanAccountHierarchy>();
    
    public void addLoanAccount(LoanAccountHierarchy account){
        Loanacc.add(account);
        
    }
  

    public String printMonthlyReport(){
        return "Acccount report for customer "+FirstName+" "+LastName+
                " with SSN: "+SSN+"\n\n"+Loanacc;
        
    }
     
    
}
