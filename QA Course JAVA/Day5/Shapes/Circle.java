package Day5.Shapes;

public class Circle implements Shape{

    @Override
    public double getArea(double radius) {
        return (Math.PI*(radius*radius));
    }

    @Override
    public double getPerimeter(double radius) {
        return (2*Math.PI*radius);
    }
    
}
