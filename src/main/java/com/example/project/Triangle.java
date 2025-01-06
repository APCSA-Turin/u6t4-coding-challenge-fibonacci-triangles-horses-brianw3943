package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      vertices[0] = p1;
      vertices[1] = p2;
      vertices[2] = p3;
    }
    public Point[] getVertices() {
      return vertices;
    }
    public void setVertices(Point newP1, Point newP2, Point newP3) {
      vertices[0] = newP1;
      vertices[1] = newP2;
      vertices[2] = newP3;
    }
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      double perimeter = 0;
      perimeter += vertices[0].distanceTo(vertices[1]);
      perimeter += vertices[1].distanceTo(vertices[2]);
      perimeter += vertices[2].distanceTo(vertices[0]);
      return perimeter;
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      String triangleInfo = "[" + vertices[0].pointInfo();
      triangleInfo += ", " + vertices[1].pointInfo();
      triangleInfo += ", " + vertices[2].pointInfo();
      triangleInfo += "]";
      return triangleInfo;
    }
  }
  