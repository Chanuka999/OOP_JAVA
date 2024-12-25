import java.util.ArrayList;

class Product{
    private String name;
    private int quantity;


    Product(String name,int quantity){
        this.name=name;
        this.quantity=quantity;

    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    double getQuantity(){
        return quantity;
    }

    void setPrice(int quantity){
        this.quantity=quantity;
    }

}

class Inventory{
    private ArrayList<Product> products;

    Inventory(){
        products = new ArrayList<Product>();
    }

    void addProduct(Product product){
         products.add(product);
    }

    void removeProduct(Product product){
        products.remove(product);
    }

    ArrayList<Product> getProducts(){
        return products;
    }

    void lowInventory(){
        for(Product product : products){
           if(product.getQuantity() <=100){
            System.out.println(product.getName() + " is running low on inventory.current quantity :" + product.getQuantity());
           }
        }
    }
}

public class Q13{
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        
        Product product1 = new Product("laptop", 500);
         Product product2 = new Product("monitor", 50);
          Product product3 = new Product("keyboard", 60);


         System.out.println("add three products:");
          inventory.addProduct(product1);
           inventory.addProduct(product2);
            inventory.addProduct(product3);

        System.out.println("\nCheck low products:");
        inventory.lowInventory();

         System.out.println("\nremove Products:");
         inventory.removeProduct(product2);

         inventory.lowInventory();
        

    }
}