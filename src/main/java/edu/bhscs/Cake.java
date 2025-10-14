// Balakesav Gurugubelli
// P2
// Bake Sale
// 9/19

/*
 * DESCRIPTION: A cake for Mr. Reiber's baker class to work
 *
 * INPUT: The type of cake, the flour class, and an integer quality
 * OUTPUT: No Output
 * EDGE CASE: No Edge Case
 */

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

    draw(8);
  }

  public void draw(int size) {
    // size must be even
    int arraySize = size * 2 + 1;

    // initialize array
    String[][] viewArray = initializeArray(arraySize, " ");

    // create circle using sin and cosine
    for (int angle = 0; angle < 360; angle++) {
      int x = (int) Math.round(Math.cos(angle) * size) + size;
      int y = (int) Math.round(Math.sin(angle) * size) + size;

      viewArray[y][x] = "#";
    }

    // drawing
    for (int angle = 0; angle < 360; angle += 60) {
      for (int i = 0; i < size / 2; i++) {
        int x = (int) Math.round(Math.cos(angle) * i) + size;
        int y = (int) Math.round(Math.sin(angle) * i) + size;

        viewArray[y][x] = "#";
      }
    }

    // print cake
    printArray(viewArray);
  }

  String[][] initializeArray(int arraySize, String character) {
    String[][] array = new String[arraySize][arraySize];

    for (int y = 0; y < arraySize; y++) {
      String[] row = new String[arraySize];
      for (int x = 0; x < arraySize; x++) {
        row[x] = character;
      }

      array[y] = row;
    }

    return array;
  }

  void printArray(String[][] array) {
    for (int y = 0; y < array.length; y++) {
      for (int x = 0; x < array.length; x++) {
        System.out.print(array[y][x]);
      }

      System.out.println();
    }
  }

  String duplicateCharacters(String character, int count) {
    String output = "";

    for (int i = 0; i < count; i++) {
      output += character;
    }

    return output;
  }
}
