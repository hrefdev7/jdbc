package dao;

import java.util.ArrayList;

import entity.Customers;
import entity.Product;

public interface IDao {

    public void createCustomers(Customers customers);
    public Customers getCustomersById(Integer id);
    public ArrayList<Customers> getAllCustomers();
    public void updateCustomers(Customers product);
    public void deleteCustomers(Integer id);
    
    public void createProduct(Product product);
    public Product getProductById(int productId);
    public ArrayList<Product> getAllProducts();
    public void updateProduct(Product product);
    public void deleteProduct(int productId);

}
