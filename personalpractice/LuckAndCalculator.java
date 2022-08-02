import java.util.Scanner;

public class LuckAndCalculator {
    public static void main (String[] args){

        Scanner nameTaker = new Scanner(System.in);
            System.out.println("Hi there!, this is a program which checks your luck and acts as a simple calculator!");
            System.out.println( "What is your name?");
                
            String name = nameTaker.nextLine();
            
            System.out.println("Nice to meet you " + name + "!");
            System.out.println("Lets see how lucky you are!");

        double rng = Math.random()* 10;
        if(rng>5){
            System.out.println(rng);
            System.out.println("Unlucky! :(");
        } else {
            System.out.println(rng);
            System.out.println("You're in luck! :)");
        }


        Scanner inputTaker = new Scanner(System.in);

            System.out.println("Enter your operator: ");
                String operatorString = inputTaker.nextLine();

            System.out.println("Enter your first number: ");
                int a = inputTaker.nextInt(); //reads user input; nextLine for strings and nextInt for numbers
        
            System.out.println("Enter your second number: ");
                int b = inputTaker.nextInt();
        
                    if (operatorString.equals("+")) { //calculator
                            System.out.println("Your addition = " + (a+b));
                        }else if(operatorString.equals("-")){
                            System.out.println("Your subtraction = " + (a-b));
                        }else if(operatorString.equals("*")){
                             System.out.println("Your multiplication = " + (a*b));
                        } else if(operatorString.equals("/")){
                        System.out.println("Your division = " + (a/b));
                        }else{
                            System.out.println("We are currently fixing this bug");
                        }
        }    
    }

/* To add to this project: 
                        Try and add percentage
                        option for more than 2 numbers
                        allowing only an integer or onlyy symbols etc..
*/ 