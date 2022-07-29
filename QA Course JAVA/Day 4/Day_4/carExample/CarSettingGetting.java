package carExample;

public class CarSettingGetting {
    public static void main(String[] args) {
        CarGetterSetter tesla = new CarGetterSetter("Tesla ","X ", true);
        CarGetterSetter BMW = new CarGetterSetter("BMW ", " 318d ", false);
        CarGetterSetter car1 = CarSetterGetter.newCar();

    System.out.println(tesla.getMake() + tesla.getModel() + tesla.getIsElectric());
    System.out.println(BMW.getMake() + BMW.getModel() + BMW.getIsElectric());
    
    }
}