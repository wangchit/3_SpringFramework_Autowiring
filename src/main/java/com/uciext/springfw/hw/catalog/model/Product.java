package com.uciext.springfw.hw.catalog.model;

import java.lang.StringBuilder;
import org.apache.log4j.Logger;

public class Product {
	//properties
	private String SKU;
	private String productName;
	private String unitMeasure;
	private Integer price;
	private Integer quantity; 
	
	   private static Logger logger = Logger.getLogger(Product.class.getName());

	   public Product() {
	    	logger.info("In default constructor");
	    }
	    
	    public Product(String SKU, String productName, String unitMeasure, Integer price, Integer quantity) {
	    	logger.info("In parameterized constructor");
	    	this.SKU = SKU;
	    	this.productName = productName;
	    	this.unitMeasure = unitMeasure; 
	    	this.price = price;
	    	this.quantity = quantity;
	    }
	   
	    // Getters and Setters
	    public String getSKU() {
	        return SKU;
	    }
	    public void setSKU(String value) {
	        this.SKU = value;
	    }

	    public String getProductName() {
	        return productName;
	    }
	    public void setProductName(String value) {
	        this.productName = value;
	    }
	    
		public String getUnitMeasure() {
			return unitMeasure;
		}

		public void setUnitMeasure(String unitMeasure) {
			this.unitMeasure = unitMeasure;
		}
		
		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}
		
		public Integer getQuantity() {
			return quantity;
		}
		
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

	    public String toString() {
	       StringBuilder buff = new StringBuilder("[Product: ")
	       .append("SKU=").append(SKU)
	       .append(", ProductName=").append(productName)
	       .append(", UnitMeasure=").append(unitMeasure)
	       .append(", Price=").append(price)
	       .append(", Quantity=").append(quantity)
	       .append("]")
	       ;

	       return buff.toString();
	    }

	    public String print() {
	        return SKU + " " + productName;
	    }

}

