package Tests;

public class coins {

    public static void main(String[] args) {
        printChange(4.58, 20);
    }

    public static void printChange(double cost, double amount){

        int tenPoundnote = 0;
        int fivePoundnote = 0;
        int twentyPence = 0;
        int twopence = 0;

        double change = amount - cost;
        while((change - 10) > 0){
            tenPoundnote++;
        }
        while(change - 5 > 0){
            fivePoundnote++;
        }
        while(change - 0.2 > 0){
            twentyPence++;
        }
        while(cost - 0.02 > 0){
            twopence++;
        }
        System.out.println(tenPoundnote);
        System.out.println(fivePoundnote);
        System.out.println(twentyPence);
        System.out.println(twopence);

    }
    
}
