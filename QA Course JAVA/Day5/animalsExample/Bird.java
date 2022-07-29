package Day5.animalsExample;

public class Bird {

    private boolean fly = true;

    public void noise(){
        System.out.println("tweet");
    }

    // getters and setters
    public boolean getFly(){
        return fly;
    }

    public void setFly(boolean newValueOfFly){
        this.fly = newValueOfFly;
    }

}

/*you inherit the public methods but not private attributes UNLESS using the getter and setter methods
 * FINAL classes apply an unchanging singular value to something THUS doesnt work well with inheritance
 * @override (metadata) - benefit is that compiler warns us about overiding this method
 */