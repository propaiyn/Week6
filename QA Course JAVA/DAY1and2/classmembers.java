package DAY1and2;
public class classmembers {
    /*class members = variables or methods in a class
     each member can be: instance member, static class member or final*/

/*instance members = attributes.methods which need an instance of the class initialised 
before use and are unique to that instance e.g.*/
public class Customer {
    private String firstName; //instance variables; belong to particular instance of customer class//
    private String surname; //private would make instance only availiable in class//

    public Customer(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
/*2 variables and getter and setter methods. Class members are NOT static a static 
instance of customer and would need to be initialised to access class members
second object of customer with different data as class members are instance 
thus unique to class*/
}