package Day5.phyloTreeEx;

public class Animal extends Eukaryota {
    
    public void weGo(){
        System.out.println("We go OM NOM NOM!"); //*CAN MAKE PRIVATE WITH STATIC AND THEN USE IT FROM DIFFERENT CLASSESS E.G. Euk1.weGo(); and 
        //Plant1.weGo() will have the same result as plant inherits from the eukaryota superclass (AS WEGO IS STATIC AND HIDDEN IN PLANTS)
    }

    public double numberOfSpecies(){
        return 7e6;
    }
    @Override
    public String whatAreWe(){
        return "We are kingdom Eukaryota and Phylum Animal";
    }
}
