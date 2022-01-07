import java.util.Scanner;

public class Circle extends Shape{
        //data fields
        private double radius = 0;
        //constructors
        public Circle(){
                super("Circle");
        }
        public Circle(double radius){ //Constructs a circle of the specified size
                super("Circle");
                this.radius = radius;
        }
        public double getRadius(){
                return radius;
        }
        //Override
        public double computeArea(){
                return Math.PI*radius*radius;
        }
        public double computePerimeter(){
                return Math.PI*2*radius;
        }
        //reads teh attributes of the rectangle
        public void readShapeData(){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the radius of the Circle");
                radius = in.nextDouble();
        }
        //Creates a string representation of the circle
        public String toString(){ //override
                return super.toString() + ":Radius is" + radius;//returns a string

        }
}
