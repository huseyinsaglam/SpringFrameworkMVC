package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.Product;
import service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public String defaultPage(Model model)
	{
		List<Product > products = productService.getAllProducts();
		model.addAttribute("productss", products);
		return "productList";
	}
	
	@RequestMapping("/product")
	public String getProductById(@RequestParam(name="id") String productId , Model model)
	{
	  Product productt =	productService.getProductgetById(productId);
	  model.addAttribute("product", productt);
	  return "productDetail";
	}
	
	
	// http://localhost:8080/SpringMVCWeek3/products/brand/brands=apple,google,samsung,
	@RequestMapping("/category/{categoryName}")
	public String listProductsByCategoryNamed(@PathVariable(name = "categoryName") String categoryName, Model model) {
		List<Product> products = productService.getProductByCategory(categoryName);
		model.addAttribute("productss", products);
		return "productList";
	}

}
