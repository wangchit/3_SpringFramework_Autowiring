package com.uciext.springfw.hw.catalog.model;

import java.util.Map;


public class Catalog {

	private Map<String, Product> products;

	public Map<String, Product> getProducts() {
	    return products;
	}
	public void setProducts(Map<String, Product> products) {
	    this.products = products;
	}

	public Product getProduct(String sku) {
	    return products.get(sku);
	}
    
	public String toString() {
	       StringBuilder buff = new StringBuilder("[Catalog: ")
	       .append(", products=");
	       for (Product product : products.values()) {
	    	   buff.append(product).append(", ");
	       }
	       buff.append("]");

	       return buff.toString();
	    }

}

