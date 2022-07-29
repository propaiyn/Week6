package Tests;

public class LessThan200 {
    public static void main(String[] args){
        int a =100;
        for(a = 100; a < 200; a++){
            if(a > 200) {
                System.out.println(a + " is less than 200");
            } else {
                System.out.println(a + " is equal to or greater than 200");
            }
        }
    }
    
}
