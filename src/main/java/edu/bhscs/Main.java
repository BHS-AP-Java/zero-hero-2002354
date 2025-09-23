// Balakesav Gurugubelli
// P2
// Zero Hero
// 9/19

/*.
 * DESCRIPTION: CAKE
 * INPUT: User Input
 * OUTPUT: Print game
 * EDGE CASE: I don't know yet
 */

package edu.bhscs;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int cakeHP = 10;
    int attackStrength = 2;

    Scanner scanner = new Scanner(System.in);

    Boolean continueGame = true;

    while(continueGame){

      System.out.print("Choose your move: ");

      String move = scanner.nextLine();

      if(move.equals("a") || move.equals("attack")){
        System.out.println("Attacking the cake!");
        cakeHP -= attackStrength;
        System.out.println("Cake HP remaining: " + cakeHP);
      }

      else if(move.equals("quit")){
        System.out.println("Quitting.");
        continueGame = false;
      }

      if(cakeHP == 0){
        System.out.println("Cake is dead! You win.");
        continueGame = false;
      }
    }

    scanner.close();
  }
}
