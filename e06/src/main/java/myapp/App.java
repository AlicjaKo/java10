package myapp;
import com.google.gson.Gson;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {

        String json = """
            [
                {"id":1, "name":"Laptop", "price":1200.99},
                {"id":2, "name":"Smartphone", "price":699.99},
                {"id":3, "name":"Keyboard", "price":39.99},
                {"id":4, "name":"Monitor", "price":249.99},
                {"id":5, "name":"Mouse", "price":10.99},
                {"id":6, "name":"Headset", "price":89.99}
            ]
        """;

        Gson gson = new Gson();

        Product[] products = gson.fromJson(json, Product[].class);
        for (int i = 0; i<products.length; i++) {
            System.out.println(products[i]);
        }
        System.out.println("The cheapest product is: " + findCheapestProduct(products).name() + " with a price of " + findCheapestProduct(products).price());
    }

    public static Product findCheapestProduct(Product[] products) {
        if (products==null || products.length==0) {
            System.out.println("The product list is empty!");
            return null;
        }
        else {
            double cheapest = products[0].price();
            Product cheapestProduct = products[0];
            for (int i = 0; i<products.length; i++) {
                if (cheapest>products[i].price()) {
                    cheapest = products[i].price();
                    cheapestProduct = products[i];
                }
            }
            return cheapestProduct;
        }
    }
   
    
}

