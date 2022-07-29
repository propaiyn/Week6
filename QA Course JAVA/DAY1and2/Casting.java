/*CONVENTION: CLASS = Capitalised start (PascalCase), 
interface = PascalCase, methods = camelCase, packages = period seperated i.e
com.qa.main */
package DAY1and2;
public class Casting {
    public static void main(String[] args){

        int myInt = 21;
        double intDoubled = myInt;
        
    System.out.println(intDoubled);
    //CONVERT TO FLOAT, known as widening casting; converting a smaller type to a larger one//
    //byte -> short -> char -> int -> long -> float -> double//
        float myNewFloat = 9.78f;
        double myInt2 = (int) myNewFloat;
    System.out.println(myInt2 + " " + myNewFloat);

    }
}
