package Day5.AbstractionInterfaces;

public class Chicken implements Flyable, Hatchable {

    @Override
    public void spreadWings(){
        System.out.println("spreading wings...");
    }

    @Override
    public void takeOff(){
        System.out.println("taking off... WHOOSH");
    }

    @Override
    public void emergeFromEgg(){
        System.out.println("cracking egg...");
    }

    @Override
    public void cheep(){
        while (true) {
            System.out.println("cheep");
        }
    }
}