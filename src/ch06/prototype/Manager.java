package ch06.prototype;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Manager {
    private Map<String, Product> products = new HashMap<>();
    void register(String name , Product product){
        products.put(name, product);
    }
    Product create(String productName){
        Product product = products.get(productName);
        return product.createClone();
    }
}
