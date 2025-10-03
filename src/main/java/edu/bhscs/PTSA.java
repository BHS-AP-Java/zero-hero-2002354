package edu.bhscs;

public class PTSA {
  int money;
  String leader;

  // PTSA Constructor
  public PTSA(int money, String leader) {
    this.money = money;
    this.leader = leader;
  }

  // Method to print the amount of money the PTSA leader has.
  public void PrintMoneyLevel() {
    System.out.println(leader + " has " + money + " dollars!");
  }
}
