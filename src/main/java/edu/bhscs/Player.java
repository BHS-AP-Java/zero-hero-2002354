package edu.bhscs;

// Wrapper for Baker
public class Player {
  public String giveAnswer(String message) {
    System.out.println(message);
    return Input.GetInput();
  }
}
