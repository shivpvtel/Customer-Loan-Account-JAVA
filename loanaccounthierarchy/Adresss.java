/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author shiv0248
 */
// i spelt address wrong and didnt feel like changing it so
public class Adresss {
    //var
    String street, city, state, zip;
      //const
    Adresss(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    //getters
    public String Getstreet(){
        return street;
    }
    public String Getcity(){
        return city;
    }
    public String Getstate(){
        return state;
    }
    public String Getzip(){
        return zip;
    }
       //print out stuff
    public String toString(){
        return "Property address: \n  " + Getstreet() + "\n  " + Getcity() + ", "
                + Getstate()+ ", " + Getzip() + "\n\n";
             
    }
}

