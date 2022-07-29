public class StringManipTests {
    public static void main(String[] args){
        String rain = "yesterday, it was raining";
        String sunny = "today it is sunny";
    
    String conCat = rain.concat(sunny);
    System.out.println(conCat); // prints concatenated string
    System.out.println(conCat.substring(25, conCat.length())); // prints substring from concatenated string
}
    private static int method1(String str) {
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            String substr = str.substring(i, i + 1);
            if(substr.equals(" ")){
                count++;
            }
        }
        return count;

        System.out.println(count);
    }
}
