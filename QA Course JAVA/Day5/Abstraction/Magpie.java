package Day5.Abstraction;

public class Magpie extends Bird {
    public void noise(){
        System.out.println("caw");
    }
}
// can still use noise() method however allows us to hide the details of Bird from every class except those which need to implement its methods.
// in subclass magpie we can use noise with our own implementation
// abstract = compiler forces overiding the method
