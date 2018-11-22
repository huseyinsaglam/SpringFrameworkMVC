package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import model.Product;

@Component
public class ProductValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Product product = (Product) target;

		if (product.getProductId() == null || product.getProductId().trim().length() < 5) {
			errors.rejectValue("productId", "required.productId");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name");
		

		if (product.getUnitPrice() <= 0) {
			errors.rejectValue("unitPrice", "required.unitPrice");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "required.description");

		if (product.getUnitsInStock() <= 0) {
			errors.rejectValue("unitsInStock", "required.unitsInStock");
		}
		
		System.out.println(errors);
		
	}

}
