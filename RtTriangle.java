import java.util.Scanner;


public class RtTriangle extends Shape{
        private double base = 0;
        private double height = 0;


        public RtTriangle(){
                super("RtTriangle");
        }

        public RtTriangle(double base, double height){
                super("RtTriangle");
                this.base = base;
                this.height = height;

        }

        public double getBase(){
                return base;
        }
        public double getHeight(){
                return height;
        }

        public double computeArea(){
                return((1/2)*base*height);
        }

        public double computePerimeter(){
                return height+base+Math.sqrt((height*height)+(base*base));
        }
        public void readShapeData(){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the base of the RtTriangle");
                base = in.nextDouble();
                System.out.println("Enter the height of the RtTriangle");
                height = in.nextDouble();

        }

        public String toString(){
                return super.toString()+ ": base is" + base+ ", height is " + height;
        }

}
