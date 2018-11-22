package controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	
	// /product/tablet
	// /product/tv
	// /product/pc
	
	/*
	@RequestMapping("/{category}")
	public String listCategory(@PathVariable ("category") String categoryy,Model model)
	{
		// http://localhost:8080/SpringMVCWeek2.3/products/tablet
		model.addAttribute("mymessage" , "#listCategory : " + categoryy);
		return "products";
	}
	*/
	 
	// Boylede olabilir
	@RequestMapping("/{category}")
	public String listCategory(@PathVariable String category,Model model)
	{
		// http://localhost:8080/SpringMVCWeek2.3/products/tablet
		model.addAttribute("mymessage" , "#listCategory : " + category);
		return "products";
	}
	
	
	//  /product.detail?id=100
	// request.getparameter("id")
	// @RequestMapping(value="/product.detail" , method = RequestMethod.GET)
	@RequestMapping("/product.detail") 
	public String productdetail(@RequestParam ("id") String productId,
			@RequestParam(required=false ,name="brand") String brand,
			Model model)
	{
		
		// http://localhost:8080/SpringMVCWeek2.3/products//product.detail?id=100 &brand=marka1
		model.addAttribute("mymessage1" , "#productdetail : " + productId + "brand : " + brand);
		return "products";
	}
	
	
	
	@RequestMapping("/product.moredetail/{matrixvariable}")
	public String moreDetailParameter(
			@MatrixVariable(pathVar= "matrixvariable" , name="colors") List<String> colorss,
			@MatrixVariable(pathVar= "matrixvariable" , name="lowprice") String lowpricee,
			@MatrixVariable(pathVar= "matrixvariable" , name="highprice") String highpricee,
			Model model)
	{
		
		// http://localhost:8080/SpringMVCWeek2.3/products/product.moredetail/colors=red,black;lowprice=100;highprice=200
		model.addAttribute("mymessage1" , "#moredetail : " + lowpricee + " " + highpricee + " " + colorss );
		return "products";
	}
	
	

}
