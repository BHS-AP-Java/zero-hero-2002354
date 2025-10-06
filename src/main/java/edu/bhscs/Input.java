package edu.bhscs;

import java.util.Scanner;

public class Input {
  public static Scanner scanner;

  public static void Initialize(){
    scanner = new Scanner(System.in);
  }

  public static String GetInput(){
    return scanner.nextLine();
  }
}
