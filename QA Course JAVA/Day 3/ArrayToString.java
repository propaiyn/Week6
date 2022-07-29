public class ArrayToString {
    public static void main(String[] args){
    String concatString = " loser!";
            char[] newArray = {'h','e','y'}; // char is single quotations
        String greeting = new String(newArray);
        System.out.println(greeting);
    int stringLength = greeting.length();
        System.out.println(stringLength);
        String newStr = greeting.concat(concatString);
        System.out.println(newStr);
    
    }

    public static void otherStringManipulations(String[] args) {
        String str1 = "ThIsIsSoMeTeXt";
        String str2 = "thisissometext";

        // Converts text to lowercase
        System.out.println(str1.toLowerCase());// output will be: thisisometext

        // Converts text to UPPERCASE
        System.out.println(str1.toUpperCase()); // output will be: THISISSOMETEXT

        // Returns the character at the specified index
        System.out.println(str1.charAt(3)); // output will be: s

        // Returns the first position of the character specified.
        System.out.println(str1.indexOf("I")); // output will be: 2

        // Returns true or false if the string ends with the specified character
        System.out.println(str1.startsWith("t")); // output will be: false

        // Returns true or false if the string ends with the specified character
        System.out.println(str1.endsWith("t")); // output will be: true

        // Returns true or false if the string contains the specified characters
        System.out.println(str1.contains("So")); // output will be: true

        // Returns a new string that is a substring of this string.
        // start index is inclusive and endindex is exclusive
        System.out.println(str1.substring(1, 3)); // output will be: hIs

        // Checks if the values of two strings are the same:
        System.out.println(str1.equals(str2)); // output will be: false

        // Compares two strings ignoring case considerations:
        System.out.println(str1.equalsIgnoreCase(str2)); // output will be: true

        //Searches a string for a specified value and then replaces it with another value
        System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));  //output will be: ThIsIsSOMEREALLYFUNTeXt
    }
}

// takes an array of chars and prints a string// 
