// A Point object represents a pair of (x, y) coordinates.
import java.lang.*;
public class Point
{
  private int x;
  private int y;
  public Point() {
    x=0;
    y=0;
  }
  public Point(int nx, int ny) {
    x=nx;
    y=ny;
  }
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public String toString()
  {
    String a=("("+Integer.toString(x)+", "+Integer.toString(y)+")");
    return a;
  }
  public double distanceFromOrigin()
  {
    double a=x*x+y*y;
    return Math.sqrt(a);
  }
  public double distance (Point p)
  {
    return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
  }
  public void setX (int a)
  {
    x=a;
  }
  public void setY (int a)
  {
    y=a;
  }
  public void translate (int t, int z)
  {
    x+=t;
    y+=z;
  }
}
