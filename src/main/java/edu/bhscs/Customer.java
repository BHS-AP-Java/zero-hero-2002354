package edu.bhscs;

// Reiber Baker Wrapper
public class Customer {
  public String name;

  public Customer(String name) {
    this.name = name;
  }

  public int pay(int money) {
    System.out.println("I, " + name + " am paying " + money + "!");
    return money;
  }

  public void takeCake(Cake cake) {
    System.out.println("I got a " + cake.type + " cake! It would rate it " + cake.quality + "/10.");
  }
}
