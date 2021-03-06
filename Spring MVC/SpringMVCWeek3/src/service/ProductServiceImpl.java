package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductDAO;
import model.Product;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	public ProductDAO productDAO;
	@Override
	public List<Product> getAllProducts() {
		
		return productDAO.getAllProducts();
	}

	@Override
	public Product getProductgetById(String productId) {
		
		return productDAO.getProductgetById(productId);
	}

	@Override
	public List<Product> getProductByCategory(String categoryName) {
		
		return productDAO.getProductByCategory(categoryName);
	}

}
