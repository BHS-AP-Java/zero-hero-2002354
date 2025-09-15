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
  public static final char A = 'a';

  public static void main(String[] args) {
    System.out.println("Program Start");
    System.out.println("Shadowcast - Dark (3T)");
    System.out.println("Rush - If this card resolves the turn it was flipped,");
    System.out.println(
        "You may add a card with cost 3[T] or less from your hand to your chain. (Cards added after time calculation don't cost any time.)");
    System.out.println("Program End");

    int someNumber = 67;

    System.out.println("67!" + A + someNumber);
    System.out.println(A + "?" + A + someNumber);
    System.out.println(A + A + someNumber);
    System.out.println();
    System.out.println("this is neat");
    System.out.println();
    System.out.println("Ok im done.");

    System.out.println(whoIsBetter(true));
  }

  public static String whoIsBetter(Boolean selector) {
	System.out.println("Who is better?");
    return selector ? "Playboi Carti" : "Ken Carson";
  }
}
