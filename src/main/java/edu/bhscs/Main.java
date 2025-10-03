// Balakesav Gurugubelli
// P2
// Zero Hero
// 9/19

/*.
 * DESCRIPTION: A bake sale, with a baker, cake, customer, and PTSA.
 * The user plays as the baker and kills the diabolical cake.
 * Then, the customers come in because they are no longer scared of the cake and donate
 * money to the PTSA. Mr. Reiber is the head of the PTSA and gets the money.
 *
 * INPUT: User Input about what they want to do in the bakery
 * OUTPUT: Print the output based on what the user does
 * EDGE CASE: User types a non-integer value for the number of dollars.
 */

package edu.bhscs;

import java.util.Scanner;

public class Main {
  public static Scanner scanner;

  public static void main(String[] args) {
    // Initialize a cake with one of the CakeTypes enum values
    Cake cake = new Cake("round", CakeTypes.Vanilla, 10);

    // Initialize the baker
    Baker baker = new Baker(10, "Bob", 2);

    // Create a scanner to get user input
    scanner = new Scanner(System.in);

    // A variable to tell the while loop when to stop executing the main game loop
    Boolean continueGame = true;

    // Print user input
    System.out.println();
    System.out.println(
        "You are fighting a " + cake.shape + " " + cake.cakeType.toString() + " cake.");

    // Main game loop
    while (continueGame) {
      System.out.print("Choose your move: ");

      // Get user input
      String move = scanner.nextLine();

      // Choose to either attack or quit based on what the user wants to do
      if (move.equals("a") || move.equals("attack")) {
        System.out.println("Attacking the cake!");
        cake.HP -= baker.attackStrength;
        System.out.println("Cake HP remaining: " + cake.HP);
      } else if (move.equals("quit")) {
        System.out.println("Quitting.");
        continueGame = false;
      }
      // Check if the user did not pick a valid option
      else {
        System.out.println("That is not an option!");
      }

      // Check if the cake is dead
      if (cake.HP == 0) {
        System.out.println("Cake is dead! You win.");

        System.out.println("Here come the customers!");
        // Initialize a customer as it walks in the door. It arrives with a message for the baker.
        Customer customer =
            new Customer(
                "Thanks for killing the cake! I'm going to donate a magical number of dollars to the PTSA.");

        System.out.println();
        System.out.print("Here's what the customer has to say: ");
        customer.PrintMessage();

        System.out.print("Choose how much money to donate: ");
        String money = scanner.nextLine();

        // Initialize a PTSA with the amount of money donated
        PTSA ptsa = new PTSA(Integer.parseInt(money), "Mr. Reiber");
        ptsa.PrintMoneyLevel();

        // Tell the outer loop to stop executing the loop
        continueGame = false;
      }
    }

    scanner.close();
  }
}
