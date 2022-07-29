package Day5.phyloTreeEx;

public class NOSMethod {

    public static void main(String[] args) {

        Animal Animal1 = new Animal();
        Plants Plant1 = new Plants();
        Eukaryota Euk1 = new Eukaryota();
        
        System.out.println(Euk1.whatAreWe()+ " Species number: " + Euk1.numberOfSpecies());
        System.out.println(Animal1.whatAreWe() + " Species number:  " + Animal1.numberOfSpecies());
        Animal1.weGo();
        System.out.println(Plant1.whatAreWe() + "Species number: "+Plant1.numberOfSpecies());
        System.out.println("Is a plant a type of Eukaryote? ");
        System.out.println(Plant1 instanceof Eukaryota); // checks if plant is a child of Eukaryote

    }
}

/* public class ClassA {
    public void methodOne(int i) {
    }

    public void methodTwo(int i) {
    }

    public static void methodThree(int i) {
    }

    public static void methodFour(int i) {
    }
}
public class ClassB extends ClassA {
    public static void methodOne(int i) {
    }

    @Override
    public void methodTwo(int i) {
    }

    public void methodThree(int i) {
    }

    public static void methodFour(int i) {
    }
}

HERE, method 2 would overide the superclass as it HAS THE SAME NAME AND SIGNATURE AS SUPERCLASS -- MOST IMPORTANT USE CASE------------

METHOD 4 has same name and signature but IS STATIC SO HIDES THE STATIC IN SUPERCLASS

methodOne() is trying to override a static method with a non-static one - compile error 

methodThree() is trying to override a non-static method with a static one. - compile error

    static static can hide
    void void can overide

*/