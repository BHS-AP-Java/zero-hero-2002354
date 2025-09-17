package edu.bhscs;

enum CardType {
  Action,
  Reaction,
  Enchantment
}

public class Card {
  public String name;
  public Number time;
  public CardType type;
  public String text;

  public Card(String name, Number time, CardType type, String text) {
    this.name = name;
    this.time = time;
    this.type = type;
    this.text = text;
  }

  public void PrintCard() {
    System.out.println(name);
    System.out.println(time);
    System.out.println(type.toString());
    System.out.println(text);
  }
}
