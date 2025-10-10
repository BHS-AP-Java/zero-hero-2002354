// Balakesav Gurugubelli
// P2
// Bake Sale
// 10/10

/*
 * DESCRIPTION: A burger that can be captured
 *
 * INPUT: No Input
 * Output: Prints an image of the burger
 * EDGE CASE: No edge case
 */

package edu.bhscs;

public class Burger {
  int name;

  public Burger(int name) {
    this.name = name;
  }

  void Capture() {
    System.out.println("Captured");
    System.out.println("         ");
    System.out.println("  #####  ");
    System.out.println("#########");
    System.out.println("  #####  ");
    System.out.println("         ");
  }
}
