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
