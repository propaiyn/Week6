package DAY1and2;

public class Customer {

    private String firstName;
    private String surname;
    private static int numberOfPeople = 0;

    public Customer(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
        numberOfPeople++;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
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
/* 2 new static class members; numberofpeople and getnumberOfPeople
STATIC thus BELONG TO CLASS not instance*/

/*public methods must = MUST create object i.e. Main (public class) 
name() (public void name ) system.oyt.println("hassan")
create object: Main name1 = New name()
call object: name.name1()*/