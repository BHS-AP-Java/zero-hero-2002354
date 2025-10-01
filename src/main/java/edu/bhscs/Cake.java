package edu.bhscs;

public class Cake {
  public String shape;
  public CakeTypes cakeType;
  public int HP;

  // Cake Constructor
  public Cake(String shape, CakeTypes cakeType, int HP) {
    this.shape = shape;
    this.cakeType = cakeType;
    this.HP = HP;
  }
}
