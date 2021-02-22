package supermarketPricing.api;

import supermarketPricing.impl.PriceImpl;

/**
 * <b>Represent a product</b>.
 * 
 * @author LAFIA-MONWOO David
 * @version 1
 */
public interface ProductAPI {
	
	/**
     * Give the name of a product.
     *
     * @return a string representing that name
     * 
     */
	public String getName();
	
	/**
     * Allow to change the name of the product.
     *
     * @param name represent the new value of the name
     * 
     */
	public void setName(String name);
	
	/**
     * Give the name of a product.
     *
     * @return an int representing that stock
     * 
     */
	public int getStock();
	
	/**
     * Allow to change the stock of the product.
     *
     * @param stock represent the new value of the stock
     * 
     */
	public void setStock(int stock);
	
	/**
     * Give the instance of PriceImpl representing the details about the price of the product.
     *
     * @return a PriceImpl representing that price
     * 
     */
	public PriceImpl getProductPrice();
	
	/**
     * Allow to change PriceImpl of the product.
     *
     * @param productPrice represent the new value of the price
     * 
     */
	public void setProductPrice(PriceImpl productPrice);
	
	/**
     * Give the result of the calculation of the price of the stock of the product.
     *
     * @return a double representing that price 
     * 
     */
	public double getStockPrice();
	
	/**
     * Give the result of the calculation of the price of the product based on a quantity.
     *
     * @param quantity representing the quantity
     *
     * @return a double representing that price
     * 
     */
	public double calculatePriceByQuantity(int quantity);
}
