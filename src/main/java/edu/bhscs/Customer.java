package edu.bhscs;

public class Customer {
  String customerMessage;

  // PTSA Constructor
  public Customer(String customerMessage) {
    this.customerMessage = customerMessage;
  }

  // Method to print the customers message
  public void PrintMessage() {
    System.out.println(customerMessage);
  }
}
