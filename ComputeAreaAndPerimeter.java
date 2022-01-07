
/*
java program that computes the area and perimeter of user selected
shapes. 

*/
import java.util.Scanner;
public class ComputeAreaAndPerimeter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean valid;
    boolean again = true;
    while (again) { //continue
    Shape myShape;
    double perimeter;
    double area;
    myShape = getShape(); //Ask for figure type
    myShape.readShapeData(); //Read the shape data
    perimeter = myShape.computePerimeter(); //compute perimeter
    area = myShape.computeArea(); //compute area
    displayResult(myShape, area, perimeter); //displays the result
    System.out.println("Do you want another calculation? (y/n)");
    String answer = in.next();
    if (answer.equalsIgnoreCase("y")) {
      valid = true;
      }
      else if (answer.equalsIgnoreCase("n")) {
        again= false;
        valid = true;
        }
        }
        }
//Asks the user for the type of figure they want the area and perimeter
public static Shape getShape() {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter C for Circle");
  System.out.println("Enter R for Rectangle");
  System.out.println("Enter T for Right Triangle");
  String figType = in.next();
  if (figType.equalsIgnoreCase("c")) {
    return new Circle();
    }
    else if (figType.equalsIgnoreCase("r")) {
      return new Rectangle();
      }
      else if (figType.equalsIgnoreCase("t")) {
        return new RtTriangle();
        }
        else {
          return null;
          }
          }
//Displays the Area and Perimeter of the figure selected
private static void displayResult(Shape myShape, double area, double perimeter) {
  System.out.println(myShape);
  System.out.printf("The area is %.2f%nThe perimeter is %.2f%n", area, perimeter);
  }
}
