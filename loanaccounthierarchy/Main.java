/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanaccounthierarchy;
import java.util.ArrayList;
/**
 *
 * @author shiv0248
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   
              // Create three different loan objects, one of each type.
              
              // i also switch principle and annual interest arround so 
        Carloan carLoan = new Carloan(4.25, 25000.00, 72, "IRQ3458977");
        
        Adresss propertyAddress = new Adresss("321 Main Street", "State College", "PA", "16801");
        
        PrimaryMortgage propertyLoan = new PrimaryMortgage(3.1, 250000.00, 360, 35.12, propertyAddress);
        
        UnsecuredLoan unsecuredLoan = new UnsecuredLoan(10.75, 5000.00, 48);
        
        //Print out the load information for each loan using the toString() method.
        System.out.format("%n%s%s%s%n", carLoan, propertyLoan, unsecuredLoan); 
        */
     
      // Create different loan objects, at least one of each type.
        Carloan carLoan1 = new Carloan(4.9, 25000.00, 72, "IRQ3458977");
        Carloan carLoan2 = new Carloan(5, 12000.00, 60, "NXK6767876");
        
        Adresss propertyAddress1 = new Adresss("321 Main Street", "State College", "PA", "16801");
        PrimaryMortgage propertyLoan1 = new PrimaryMortgage(3.75, 250000.00, 360, 35.12, propertyAddress1);
        
        Adresss propertyAddress2 = new Adresss("783 Maple Lane", "State College", "PA", "16801");
        PrimaryMortgage propertyLoan2 = new PrimaryMortgage(2.5, 375000.00, 360, 53.12, propertyAddress2);
        
        UnsecuredLoan unsecuredLoan = new UnsecuredLoan(10.75, 5000.00, 48);
        
        // create customers
        Customer customerA = new Customer("Tony", "Stark", "111-22-3333");
        Customer customerB = new Customer("Gal", "Gadot", "444-55-6666");
        
        // add loans for the customers.
        customerA.addLoanAccount(carLoan1);
        customerA.addLoanAccount(propertyLoan1);
        customerA.addLoanAccount(unsecuredLoan);
        
        customerB.addLoanAccount(carLoan2);
        customerB.addLoanAccount(propertyLoan2);
        
        // add the customers to an arraylist of customers.
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customerA);
        customers.add(customerB);
        
        //Print out the loan information for each customer polymorhically.
        System.out.println("Monthly Report of Customers by Loan Account");
        for (Customer customer:customers)
        {
            System.out.println(customer.printMonthlyReport());
        }
    }
    
}
//OUTPUT 
/*
Monthly Report of Customers by Loan Account
Acccount report for customer Tony Stark with SSN: 111-22-3333

[Car loan with: 
Priciple:   		$25000.0
Annual Interest rate:	4.9%
Term of loan in months: 72.0
Monthly payment: 	$401.465
Vehicle VIN: 		IRQ3458977

, Primary Mortgage loan with 
Priciple:   		$250000.0
Annual Interest rate:	3.75%
Term of loan in months: 360.0
Monthly payment: 	$1157.789
PMI monthly Amount:	$35.12

Property address: 
  321 Main Street
  State College, PA, 16801

, Unsecured Load with: 
Priciple:   		$5000.0
Annual Interest rate:	10.75%
Term of loan in months: 48.0
Monthly payment: 	$128.621
]
Acccount report for customer Gal Gadot with SSN: 444-55-6666

[Car loan with: 
Priciple:   		$12000.0
Annual Interest rate:	5.0%
Term of loan in months: 60.0
Monthly payment: 	$226.455
Vehicle VIN: 		NXK6767876

, Primary Mortgage loan with 
Priciple:   		$375000.0
Annual Interest rate:	2.5%
Term of loan in months: 360.0
Monthly payment: 	$1481.703
PMI monthly Amount:	$53.12

Property address: 
  783 Maple Lane
  State College, PA, 16801

]
BUILD SUCCESSFUL (total time: 0 seconds)
*/