package edu.bhscs;

public class Baker {
  public int HP;
  public String name;
  int attackStrength;

  // baker constructor
  public Baker(int HP, String name, int attackStrength) {
    this.HP = HP;
    this.name = name;
    this.attackStrength = attackStrength;
  }

  // print that the baker baked a cake
  public void Bake(Cake cake){
    System.out.println("I, " + name + " baked a " + cake.getReadableName() + "!");
  }
}
