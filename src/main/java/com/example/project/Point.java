package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    public int getY() {
      return y;
    }
    public int getX() {
      return x;
    }
    public void setY(int newY) {
      y = newY;
    }
    public void setX(int newX) {
      x = newX;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      double xDistance = Math.abs(x - other.getX());
      double yDistance = Math.abs(y - other.getY());
      double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
      return distance;
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }
  }
  