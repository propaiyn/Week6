public class buildproducts {

        public static void main(String[] args){
                products product1= new products();

                product1.setId(2222);
                product1.setName("apple");
                product1.setCostPrice(0.50f);
                product1.setRetailPrice(1.00f);

            

            System.out.println(product1.getId());
            System.out.println(product1.getName());
            System.out.println(product1.getCostPrice());
            System.out.println(product1.getRetailPrice());
        }
    }
