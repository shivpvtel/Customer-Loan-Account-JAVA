# Customer-Loan-Account-JAVA

Customer Loan Accounts
For this assignment, you are going to enhance the Loan Accounts Hierarchy that you created in Programming Assignment 2 by adding a Customer class with the following properties and methods:

Properties:
* firstName - the customer's first name (String).
* lastName - the customer's last name (String).
* SSN - the customer's (String).
* loanAccounts - an array list of loan accounts (ArrayList<LoanAccount>).

Methods:
* a constructor that accepts firstName, lastName, and SSN as parameters.
* getters for firstName, lastName, and SSN.
* addLoanAccount(LoanAccount account) - adds a loan to the array list of loans for this customer.
* printMonthlyReport() - prints all the information for all the accounts of this Customer. 


Utilizes the toString() method of the corresponding loan class
The output of the printMonthlyReport() method should match the sample output displayed below.
Note: make sure your output matches the output below including number of decimal places displayed and $ and % characters.
Use the following code in your main function to test your classes, just copy and paste it into your main method:
        
        // Create different loan objects, at least one of each type.
                CarLoan carLoan1 = new CarLoan(25000.00, 4.9, 72, "IRQ3458977");
                CarLoan carLoan2 = new CarLoan(12000.00, 5, 60, "NXK6767876");
                Address propertyAddress1 = new Address("321 Main Street", "State College", "PA", "16801");
                PrimaryMortgage propertyLoan1 = new PrimaryMortgage(250000.00, 3.75, 360, 35.12, propertyAddress1);
                Address propertyAddress2 = new Address("783 Maple Lane", "State College", "PA", "16801");
                PrimaryMortgage propertyLoan2 = new PrimaryMortgage(375000.00, 2.5, 360, 53.12, propertyAddress2);
                UnsecuredLoan unsecuredLoan = new UnsecuredLoan(5000.00, 10.75, 48);
                
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
                for (Customer customer:customers){         
                        System.out.println(customer.printMonthlyReport());
                    }
        
The output from your program should look like the following:
run:

        Monthly Report of Customers by Loan Account
        
        Account Report for Customer:  Tony Stark with SSN 111-22-3333
        Car Loan with:
        Principal:                    $25000.00
        Annual Interest Rate:         4.90%
        Term of Loan in Months:       72
        Monthly Payment:              $401.46
        Vehicle VIN:                  IRQ3458977
        Primary Mortgage Loan with:
        Principal:                    $250000.00
        Annual Interest Rate:         3.75%
        Term of Loan in Months:       360
        Monthly Payment:              $1157.79
        PMI Monthly Amount:           $35.12
        Property Address:
                                      321 Main Street
                                      State College, PA 16801
        Unsecured Loan with:
        Principal:                    $5000.00
        Annual Interest Rate:         10.75%
        Term of Loan in Months:       48
        Monthly Payment:              $128.62
        Account Report for Customer:  Gal Gadot with SSN 444-55-6666
        Car Loan with:
        Principal:                    $12000.00
        Annual Interest Rate:         5.00%
        Term of Loan in Months:       60
        Monthly Payment:              $226.45
        Vehicle VIN:                  NXK6767876 
        Primary Mortgage Loan with:
        Principal:                    $375000.00 
        Annual Interest Rate:         2.50%
        Term of Loan in Months:       360
        Monthly Payment:              $1481.70
        PMI Monthly Amount:           $53.12        
        Property Address:
                                      783 Maple Lane
                                      State College, PA 16801
