package DAY1and2;
public class scope {
    //Helps decide when a variable is accesible/unaccessible to a line of code//
    //i.e. smaller scope = less accesible; vice-versa//
    // 3 scopes = class level/instance scope, method/local scope, and loop scope.//

    public static String message = "Hello World!";

    public static void method1() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        method1();
    }

}
////ABOVE IS CLASS/INSTANCE SCOPE; generally used a lot in the program///////
public class HelloWorld {

    public static void method1() {
        String message = "Hello World!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        method1();
    }

}
//ABOVE IS METHOD/LOCAL SCOPE; generally used temporarily in the method they are declared in//
public class HelloWorld {

    public static void method1() {
        for(int i = 0; i < 10; i++) {
            int number = 20;
            number += i;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        method1();
    }

}
//ABOVE IS A LOOP SCOPE; Variable declared inside of the loop they are declared in, and are lost on loop end//