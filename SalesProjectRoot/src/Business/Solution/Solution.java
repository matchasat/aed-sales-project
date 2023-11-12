/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Solution;

import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class Solution {
    private ArrayList<Product> products;
    private String name;
    private String description;

    public Solution(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product getProduct(int index) {
        return this.products.get(index);
    }

    public int getNumberOfProducts() {
        return this.products.size();
    }

    public ArrayList<Product> getAllProducts() {
        return this.products;
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String productString = "";
        for (Product product : products) {
            productString += product.toString() + "\n";
        }
        return "Solution{" +
                "products=" + productString +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

