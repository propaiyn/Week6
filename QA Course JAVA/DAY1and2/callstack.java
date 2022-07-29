package DAY1and2;
import java.util.Random;
public class callstack {
    // Call stack = what java uses to keep track of method calls//=

    public static void main(String[] args) {
        System.out.println(rollTwoDTwenty());
    }

    public static int rollTwoDTwenty() {
        int total = 0;
        total += rollDTwenty();
        total += rollDTwenty();
        return total;
    }

    public static int rollDTwenty() {
        return new Random().nextInt(21);
    }
}

/*  Last-In, First-Out (LIFO) fashion.
i.e. first in rolltwodtwenty, rolldtwenty, then random int at top of stack, 
rolldtwenty returns value to rolltwodtwenty and pops off stack
after this rolldtwenty is called again etc...*/