package service;

import java.util.List;

import model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProductgetById(String productId);
	public List<Product> getProductByCategory(String categoryName);

}
