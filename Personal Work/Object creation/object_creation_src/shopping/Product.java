package shopping;

import java.util.Date;

public class Product {
    String name="New shopping.Product";
    Boolean isActive;
    Date launchDate;
    Integer itemNumber;
    public Product(){
        show();
    }
    /*
    Create a new private method
     */
    private void show(){
        System.out.println("You have created a new shopping.Product");
    }

    public static void main(String[] args) {
        Product p1=new Product();
        /*
        When creating a product object, the constructor automatically
        calls the show method
         */
    }
}
