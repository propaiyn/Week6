public class products {

    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private double costPrice;

    public double getCostPrice() {
        return costPrice;
    }
    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }
    private double retailPrice;

    public double getRetailPrice() {
        return retailPrice;
    }
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    

}

// if you take out the setter methods and add a 4 argument constructor = READ ONLY
    /* constructor example here 
        public Product(int id, String name, double costPrice, double retailPrice)
            this.id = id;
            this.name = name;
            this.costPrice = costPrice;
            this.retailPrice = retailPrice;
    we would then remove all setters and add out values directly while creating a new object i.e. Product product1 = new Product(2432, apple, .....)
     * 
    */
// """getter methods= WRITE ONLY