/*EXCLUSIVELY USED TO LOOP THROUGH AN ARRAY */


public class ForEach {

    public static void main(String[] args){
        
        String [] stgArray = {"a","b", "c", "d", "e", "f"};
        int [] numArray = {1,2,3,4,5,6};

            for(int a:numArray){
            System.out.println(numArray[a] + stgArray[a]);
            a++;
        }
    }
}

