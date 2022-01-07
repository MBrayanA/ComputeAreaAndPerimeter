public abstract class Shape{
    private String shapeName = "";

    public Shape(String shapeName){
            this.shapeName = shapeName;
    }
    public String getShapeName(){
            return shapeName;
    }

    public String toString(){
            return "shape is a " + shapeName; //overrides toString method
    }

    //abstract methods

    public abstract double computeArea();
    public abstract double computePerimeter();
    public abstract void readShapeData();

}
