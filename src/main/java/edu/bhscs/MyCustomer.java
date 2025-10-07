package edu.bhscs;

public class MyCustomer {
  String customerMessage;

  // PTSA Constructor
  public MyCustomer(String customerMessage) {
    this.customerMessage = customerMessage;
  }

  // Method to print the customers message
  public void PrintMessage() {
    System.out.println(customerMessage);
  }
}
