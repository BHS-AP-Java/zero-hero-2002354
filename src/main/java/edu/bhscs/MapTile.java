package edu.bhscs;

public class MapTile {
    public String readableName;
    public Boolean traversable;

    public MapTile(String readableName, Boolean traversable) {
        this.readableName = readableName;
        this.traversable = traversable;
    }
}
