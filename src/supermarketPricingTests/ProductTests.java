package supermarketPricingTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import supermarketPricing.impl.PriceImpl;
import supermarketPricing.impl.ProductImpl;

class ProductTests {

	@Test
	@DisplayName("Product : Test de getStockPrice")
	public void Product_TestStockPrice()
    {
		PriceImpl price = new PriceImpl(1, 0.5, 3, 1);
        ProductImpl product = new ProductImpl("beer", 100, price);
        
        assertTrue(product.getStockPrice() == 33.5);
    }

	@Test
	@DisplayName("Product : Test de CalculatePriceByQuantity")
	public void Product_TestCalculatePriceByQuantity()
    {
		PriceImpl price = new PriceImpl(1, 0.5, 3, 1);
        ProductImpl product = new ProductImpl("beer", 100, price);
        
        assertTrue(product.calculatePriceByQuantity(4) == 1.5);
    }
	
	

}
