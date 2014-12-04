// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle
{
  private Point origin;
  private int width;
  private int height;
  private Rectangle() {
    origin.setX(0);
    origin.setY(0);
    width=0;
    height=0;
  }
  public Rectangle(Point bottomLeft, Point topRight) {
    origin=bottomLeft;
    width=topRight.getX()-bottomLeft.getX();
    height=topRight.getY()-bottomLeft.getY();
  }
  public Rectangle(Point bottomLeft, int a, int b) {
    origin=bottomLeft;
    width=a-bottomLeft.getX();
    height=b-bottomLeft.getY();
  }
  public Point getBottomLeft() {
    return origin;
  }
  public Point getTopRight() {
    Point v=origin;
    int x=v.getX();
    int y=v.getY();
    x+=width;
    y+=height;
    v.setX(x);
    v.setY(y);
    return v;
  }
  public int getHeight() {
    return height;
  }
  public int getWidth() {
    return width;
  }
  public double area() {
    return width*height;
  }
  public double diagonal() {
    return Math.sqrt(height*height+width*width);
  }
  public int perimeter() {
    return 2*(height+width);
  }
  public boolean isSquare() {
    if(height==width) {
      return true;
    }
    else {
      return false;
    }
  }
  public String toString() {
    return "["+origin.toString()+", "+getTopRight().toString()+"]";
  }
  public void translate (int dx, int dy) {
    origin.translate(dx, dy);
  }
  public void scale (int dx, int dy) {
    width+=dx;
    height+=dy;
  }
}
