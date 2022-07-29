package Day5.polEx;

public class Main {

    public static void main(String[] args) {
        System.out.println("=============Cow=============");
        Cow cow = new Cow();
        cow.speak();
        cow.sleep(); // inheritance (no overriding)
        System.out.println("=============================");
        System.out.println("============Animal===========");
        Animal animal = new Cow();
        ((Cow) animal).speak();
        animal.sleep(); // line above = casting: animal should be treated as cow, allows us to call method defined in cow class
        //casting allows you to use methods from other classes
        System.out.println("=============================");
        System.out.println("============Object===========");
        Object object = new Cow();
        ((Cow) object).speak();
        ((Cow) object).sleep();
        System.out.println("=============================");

        //Polymorphic behaviour (no overriding)

        Animal placeholder = null;
        
        placeholder = new Animal();
        System.out.println(placeholder.noOfSpecies());

        placeholder = new Cow();
        System.out.println(placeholder.noOfSpecies());

        // polymorphic as the same method has different values
        /* Overriding is when you call a method on an object and the method in the subclass with the same signature as the one in the 
        superclass is called. Polymorphism is where you are not sure of the objects type at runtime and the most specific method is called. */ 

    }
}