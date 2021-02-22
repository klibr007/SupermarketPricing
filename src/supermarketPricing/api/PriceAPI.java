package supermarketPricing.api;


/**
 * <b>Represent details about the price of a product</b>.
 * 
 * @author LAFIA-MONWOO David
 * @version 1
 */

public interface PriceAPI {
	

	/**
     * Give the price of a unit of a product.
     *
     * @return a double representing that price
     * 
     */
	public double getPriceOfUnit();
	
	/**
     * Allow to change the unit price of the product.
     *
     * @param priceOfUnit represent the new value of the price
     * 
     */
	public void setPriceOfUnit(double priceOfUnit);
	
	/**
     * Allow to change the unit price of the product.
     *
     * @param priceOfUnit represent the new value of the price
     * 
     */
	public void setUnit(double unit);
	
	/**
     * Give the number of a unit.
     *
     * @return a double representing that number
     * 
     */
	public double getUnit();
	
	/**
     * Give the price for a certain number of unit.
     *
     * @return a double representing that price
     * 
     */
	public double getPriceOfManyUnit();
	
	/**
     * Allow to change the price of many unit of the product.
     *
     * @param priceOfManyUnit represent the new value of the price
     * 
     */
	public void setPriceOfManyUnit(double priceOfManyUnit);
	
	/**
     * Give the number of unit you can have for a certain price.
     *
     * @return a double representing that number
     * 
     */
	public double getManyUnit();
	
	/**
     * Allow to change the number of  manyUnit of the product.
     *
     * @param manyUnit represent the new value of manyUnit
     * 
     */
	public void setManyUnit(double manyUnit);
}
