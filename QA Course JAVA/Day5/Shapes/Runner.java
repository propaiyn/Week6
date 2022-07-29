package Day5.Shapes;

public class Runner {
    public static void main(String[] args){
        Square s = new Square();
        System.out.println(s.getArea(3) + ", " + s.getPerimeter(3));
        Circle c = new Circle();
        System.out.println(c.getArea(3) + ", " + c.getPerimeter(3));
    }
    }
