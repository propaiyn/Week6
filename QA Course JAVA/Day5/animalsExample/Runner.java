package Day5.animalsExample;

public class Runner {

    public static void main(String[] args){
        Owl owlfriend = new Owl();
        owlfriend.doThing();
        owlfriend.noise(); // will return "tweet", because Owl extends Bird!
    }

}
