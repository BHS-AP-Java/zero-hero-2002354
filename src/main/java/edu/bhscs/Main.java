// Balakesav Gurugubelli
// P2
// Zero Hero
// 9/12

/*
 * DESCRIPTION: Whatever Mr. Reiber says
 * INPUT: No input
 * OUTPUT: Print stuff in terminal
 * EDGE CASE: They are all edge cases at the moment
 */

package edu.bhscs;

public class Main {

  public static void main(String[] args) {
    Cake cake = new Cake("round", CakeTypes.Chocolate);

    System.out.println("Shape: " + cake.shape);
    System.out.println("CakeType: " + cake.cakeType.toString());
  }
}
