package DAY1and2;
class testforloop {
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

/* i is a loop scope variable; this program adds 1 to i,
 adds i to the "number" variable 
 and prints the "number" while i is less than 10
 i.e. 20, 21, 22, 23... */