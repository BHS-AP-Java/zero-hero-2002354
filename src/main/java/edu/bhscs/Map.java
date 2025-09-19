package edu.bhscs;

import java.util.*;

public class Map {
  List<List<MapTile>> map = new ArrayList<>();
  public int size;

  public Map(int size) {
    this.size = size;

    for (int i = 0; i < size; i++) {
      List<MapTile> row = new ArrayList<>();
      for (int j = 0; j < size; j++) {
        row.add(new MapTile("Land", true));
      }
      map.add(row);
    }
  }

  public MapTile GetMapTile(int x, int y) {
    return map.get(x).get(y);
  }

  public void ReplaceMapTile(int x, int y, MapTile newMapTile) {
    map.get(x).set(y, newMapTile);
  }
}
