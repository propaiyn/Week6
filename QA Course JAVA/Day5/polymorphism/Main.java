package Day5.polymorphism;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow();
        Animal animal = new Animal();
        Object object = new Object();
    
        cow.speak();
        cow.sleep();
        //animal.speak(); animal doesnt inherit speak from cow class
        animal.sleep();
        /*object.sleep();
        object.speak(); does neither */
        System.out.println(cow instanceof Object);
        System.out.println(cow instanceof Animal);
        System.out.println(cow instanceof Cow);;

        System.out.println(animal instanceof Object);
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Cow);;

        System.out.println(object instanceof Object);
        System.out.println(object instanceof Animal);
        System.out.println(object instanceof Cow);;

    }
}

// 