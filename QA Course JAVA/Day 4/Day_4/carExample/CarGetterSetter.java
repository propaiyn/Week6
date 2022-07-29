package carExample;
public class CarGetterSetter {
    
        private String make; //default is null
        private String model;
        boolean isElectric; //primative instance values, in booleans case is false
        
        // private variables cannot be accessed outside of class UNLESS we use getter and setter methods
        //overloaded constructor = more than one, with different numbers or type

        private CarGetterSetter(String make, String model) {
            this.setMake(make);
            this.setModel(model);

        }

        public CarGetterSetter(String make, String model, boolean isElectric) {
            this(make, model);
            this.setIsElectric(isElectric);

        }

        public static CarGetterSetter newCar() {
            return new CarGetterSetter(); //ppublic static method which returns object
        }
        public String getMake() {
            return make;
        }
        
        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }
        
        public void setModel(String model) {
            this.model = model;
        }
        public boolean getIsElectric() {
            return isElectric;
        }
        
        public void setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
    }
}
    
        
/* getter and setter methods allow you to set as private and get methods without being in the same class  */
          /*   private String name; // instance variables, on evariable multiple different instances

    private String name;
    private String pathway;

    public Trainee(String name, String pathway){
       instance variable-  this.name = name; - assigned to instance variable
        this.pathway = pathway;
    }
        }*/