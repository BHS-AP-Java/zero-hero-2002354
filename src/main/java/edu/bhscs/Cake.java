// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: A cake for Mr. Reiber's baker class to work
 *
 * INPUT: The type of cake, the flour class, and an integer quality
 * OUTPUT: No Output
 * EDGE CASE: No Edge Case
 */

package edu.bhscs;

// Reiber Baker Wrapper
public class Cake {
  Flour flour;
  String type;
  int quality;

  public Cake(String type, Flour flour, int quality) {
    this.type = type;
    this.flour = flour;
    this.quality = quality;
  }
}
