package opgave2;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("phone", 200, new String[]{"electronics", "smartPhone"});

        Product product2 = new Product("apple", 100, new String[]{"food", "handheld"});

        Product product3 = new Product("chair", 2, new String[]{"furniture", "idk"});

        Product product4 = new Product("pen", 76, new String[]{"utensil", "school"});


        Product mostExpensive = product1;

        Product[] products = {product1, product2, product3, product4};

        for (Product product : products) {
            if (product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }



        product1.printInfo();
        product2.printInfo();
        product3.printInfo();
        product4.printInfo();
        System.out.println();
        mostExpensive.printInfo();
    }

}