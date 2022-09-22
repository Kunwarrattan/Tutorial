package com.practice.tool.streams;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Sell Laptop", 20000f));
        productsList.add(new Product(3, "Senevo Laptop", 38000f));
        productsList.add(new Product(4, "Sony Laptop", 68000f));
        productsList.add(new Product(5, "Apple Laptop", 20000f));
        List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 30000)// filtering data
                .map(p -> p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);

        List<String> name = productsList.stream().filter(product -> product.name.startsWith("S")).map(product -> product.name).collect(Collectors.toList());
        System.out.println(name);

        //Sum using reduce()
        float totalPrice2 = productsList.stream().map(product->product.price).reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

        //Sum using collectors method
        double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3);

        // max() method to get max Product price
        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productB.price);

        // count number of products based on the filter
        long count = productsList.stream().filter(product->product.price<30000).count();

        // Converting product List into Set
        Set<Float> productPriceList =
                productsList.stream().filter(product->product.price < 30000)   // filter product on the base of price
                        .map(product->product.price).collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        System.out.println(productPriceList);

        // Converting Product List into a Map
        Map<Integer,String> productPriceMap =
                productsList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println(productPriceMap);

        List<Float> productPricList =
                productsList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPricList);
    }
}
