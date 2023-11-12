/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class ProductCatalog {
    private ArrayList<Product> products;

    public ProductCatalog() {
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

    public Product findProductByName(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> findProductsByPriceRange(double minPrice, double maxPrice) {
        ArrayList<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    @Override
    public String toString() {
        String productString = "";
        for (Product product : products) {
            productString += product.toString() + "\n";
        }
        return productString;
    }
}

