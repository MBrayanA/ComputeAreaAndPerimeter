import java.util.Scanner;
public class Rectangle extends Shape {
//Data Fields
  private double width = 0; //width of the rectangle
  private double height = 0; //height of the rectangle
//Constructors
public Rectangle() {
  super("Rectangle");
  }
  //Constructs a rectangle of the specific size
  public Rectangle(double width, double height) {
    super("Rectangle");
    this.width = width;
    this.height = height;
    }
  public double getWidth() {
    return width; //returns the width
    }
  public double getHeight() {
    return height; //returns the height
    }
  public double computePerimeter() { //override
    return 2 * (height + width); //returns the perimeter of the rectangle
    }
    //Override
  public double computeArea() { //computes the area
    return height * width;
    }
      //reads the attributes of the rectangle
  public void readShapeData() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the width of the Rectangle");
    width = in.nextDouble();
    System.out.println("Enter the height of the Rectangle");
    height = in.nextDouble();
    }
    // creates a string representation of the rectangle
  public String toString() { //override
    return super.toString() + ": width is " + width + ", height is " + height; //return a string representation of the rectangle
    }
}
