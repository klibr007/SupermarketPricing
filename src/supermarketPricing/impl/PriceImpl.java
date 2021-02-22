package supermarketPricing.impl;

import java.util.Objects;

import supermarketPricing.api.PriceAPI;

public class PriceImpl implements PriceAPI{

	private double unit;
	private double priceOfUnit;
	private double manyUnit;
	private double priceOfManyUnit;
	
	
	public PriceImpl(double unit, double priceOfUnit, double manyUnit, double priceOfManyUnit) {
		super();
		if(manyUnit < 1) {
			this.manyUnit = 1;
		}
		else {
			this.unit = unit;
			this.priceOfUnit = priceOfUnit;
			this.manyUnit = manyUnit;
			this.priceOfManyUnit = priceOfManyUnit;
			}
	}

	@Override
	public double getPriceOfUnit() {
		return priceOfUnit;
	}

	@Override
	public void setPriceOfUnit(double priceOfUnit) {
		this.priceOfUnit = priceOfUnit;
	}

	@Override
	public void setUnit(double unit) {
		this.unit = unit;
	}

	@Override
	public double getUnit() {
		return unit;
	}

	@Override
	public double getPriceOfManyUnit() {
		return priceOfManyUnit;
	}

	@Override
	public void setPriceOfManyUnit(double priceOfManyUnit) {
		this.priceOfManyUnit = priceOfManyUnit;
	}

	@Override
	public double getManyUnit() {
		return manyUnit;
	}

	@Override
	public void setManyUnit(double manyUnit) {
		this.manyUnit = manyUnit;
	}
	
}
