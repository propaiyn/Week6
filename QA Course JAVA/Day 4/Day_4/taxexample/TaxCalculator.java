public class TaxCalculator {
    
    public static void main(String[] args) {
        double percentage = method1(20000);
        int taxedSalary;
            System.out.println("Your tax percentage is: " + percentage +"%");

        }
        private static double method1(int salary){
            if(salary > 0 && salary <= 14999) {
                return 0.00;
    
             } else if(salary >= 15000 && salary <= 19999){
                 return 0.10;
             } 
             else if(salary >= 20000 && salary <= 29999){
                return 0.15;
             } 
             else if(salary >= 30000 && salary <= 44999){
                return 0.20;
             }
             else if(salary >= 15000 && salary <= 19999){
                return 0.25;
             }
            return salary;}
        }
