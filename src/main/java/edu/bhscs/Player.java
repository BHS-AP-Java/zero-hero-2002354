package edu.bhscs;

public class Player {
  int hp;

  public Player(int hp){
    this.hp = hp;
  }

  public String AskQuestion(){
    return Main.scanner.nextLine();
  }
}
