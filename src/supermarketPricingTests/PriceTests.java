package supermarketPricingTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import supermarketPricing.impl.PriceImpl;

class PriceTests {

	@Test
	@DisplayName("Price : Test de creation ")
	public void Price_TestCreationNotNull()
    {
        PriceImpl price = new PriceImpl(1, 1, 0, 1);
        
        assertTrue(price.getManyUnit() != 0);
    }
	
}
