package supermarketPricing.impl;

import supermarketPricing.api.ProductAPI;

public class ProductImpl implements ProductAPI{

	private String name;
	private int stock;
	private PriceImpl productPrice;
	
	
	public ProductImpl(String name, int stock, PriceImpl productPrice) {
		super();
		this.name = name;
		this.stock = stock;
		this.productPrice = productPrice;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getStock() {
		return stock;
	}
	
	@Override
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public PriceImpl getProductPrice() {
		return productPrice;
	}

	@Override
	public void setProductPrice(PriceImpl productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public double getStockPrice() {
		double leftOfStockDividedByManyUnit = this.stock % this.productPrice.getManyUnit();
		double priceOfTheStockIfDivisibleByManyUnit = (((this.stock - leftOfStockDividedByManyUnit) / this.productPrice.getManyUnit())
				* this.productPrice.getPriceOfManyUnit());
		
		if(leftOfStockDividedByManyUnit != 0) {
			return leftOfStockDividedByManyUnit * this.productPrice.getPriceOfUnit() +
					priceOfTheStockIfDivisibleByManyUnit;
		}
		
		else {
			return priceOfTheStockIfDivisibleByManyUnit;
		}
	}
	
	@Override
	public double calculatePriceByQuantity(int quantity) {
		double leftOfQuantityDividedByManyUnit = quantity % this.productPrice.getManyUnit();
		double priceOfQuantityIfDivisibleByManyUnit = (((quantity - leftOfQuantityDividedByManyUnit) / this.productPrice.getManyUnit())
				* this.productPrice.getPriceOfManyUnit());
		
		if(leftOfQuantityDividedByManyUnit != 0) {
			return leftOfQuantityDividedByManyUnit * this.productPrice.getPriceOfUnit() +
					priceOfQuantityIfDivisibleByManyUnit;
		}
		
		else {
			return priceOfQuantityIfDivisibleByManyUnit;
		}
	}
	
}
