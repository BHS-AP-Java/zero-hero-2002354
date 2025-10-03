package edu.bhscs;

public class Player {
  int hp;

  public Player(int hp){
    this.hp = hp;
  }

  // just use scanner.nextLine() this method is kind of useless
  public String AskQuestion(){
    return Main.scanner.nextLine();
  }
}
