public class getset {
    //Encapsulation: make syure sensitive data is hidden//
    //MUST: declare as PRIVATE//
    //MUST: provide public get+set methods to access and upfate private//
    //private variables can only be accessed in the same class//
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int newAge){
        this.age = newAge; //this = referes to current object//
    }
// get = returns variable value, set = sets value//

    public static void main(String[] args) {
        getset personOne = new getset();
        personOne.name = "Hassan";
        personOne.age = 22;
    System.out.println("Your name is " + personOne.getName() + " and you are " + personOne.getAge() + " years old.");

    }
}
