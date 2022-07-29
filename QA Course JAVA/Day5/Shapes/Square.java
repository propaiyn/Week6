package Day5.Shapes;

public class Square implements Shape {

    @Override
    public double getArea(double side){
        return side * side;
    }

    @Override
    public double getPerimeter(double size){
        return size * 4;
    }

    public String getColour(){
        return "blue";
    }
}