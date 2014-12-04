// A Circle object represents a circle defined by a center point and a radius.
import java.lang.*;
public class Circle
{
  private double r;
  private Point center;
  public Circle() {
    r=0.0;
    center.setX(0);
    center.setY(0);
  }
  public Circle (Point centerPoint, Point circPoint) {
    center=centerPoint;
    r=center.distance(circPoint);
  }
  public Circle (Point centerPoint, double radius) {
    center=centerPoint;
    r=radius;
  }
  public double getRadius() {
    return r;
  }
  public double area() {
    return Math.PI*r*r;
  }
  public double circumference() {
    return 2*r*Math.PI;
  }
  public double diameter() {
    return 2*r;
  }
  public String toString() {
    return center.toString()+", "+r;
  }
  public void translate (int dx, int dy) {
    center.translate(dx, dy);
  }
  public void changeRadius(double dr) {
    r+=dr;
  }
}
