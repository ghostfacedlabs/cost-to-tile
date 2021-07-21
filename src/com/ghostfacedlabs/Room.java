package com.ghostfacedlabs;

public class Room {

    private int length;
    private int width;

    public Room(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public int squareFeet() {
        return length * width;
    }

    public double costToTile(double cost) {
        int sqft = this.squareFeet();
        return cost * sqft;
    }
}
