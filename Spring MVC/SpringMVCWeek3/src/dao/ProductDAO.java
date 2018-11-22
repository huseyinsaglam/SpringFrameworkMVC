package dao;

import java.util.List;

import model.Product;

public interface ProductDAO {
	
	public List<Product> getAllProducts();
	public Product getProductgetById(String productId);
	public List<Product> getProductByCategory(String categoryName);

}
