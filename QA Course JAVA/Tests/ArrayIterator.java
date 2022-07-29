package Tests;

public class ArrayIterator {

    public static int[] holderOfTen = {10,2,3,4,6,7,2,4,8,0};

    public static void main(String[] args){ 
        for(int i:holderOfTen) {
            i = 0;
            while(i <= holderOfTen.length){
                System.out.println(holderOfTen[i]);
            i++;
            }
        }
        }
    }
