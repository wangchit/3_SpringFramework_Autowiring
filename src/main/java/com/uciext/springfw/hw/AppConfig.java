package com.uciext.springfw.hw;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;
import com.uciext.springfw.hw.catalog.service.impl.CatalogServiceImpl;

@Configuration
public class AppConfig {

	@Bean 
	public Product productItem1() {
		Product productItem1 = new Product("X104","Phone1","mm",100,4);
		return productItem1;
	}
	@Bean 
	public Product productItem2() {
		Product productItem2 = new Product("X106","Phone2","cm",200,6);
		return productItem2;
	}
	
	@Bean 
	public Product productItem3() {
		Product productItem3 = new Product();
		productItem3.setSKU("X108");
		productItem3.setProductName("Phone3");
		productItem3.setUnitMeasure("m");
		productItem3.setPrice(300);
		productItem3.setQuantity(8);
		return productItem3;
	}
	
	@Bean 
	public Product productItem4() {
		Product productItem4 = new Product();
		productItem4.setSKU("X110");
		productItem4.setProductName("Phone1Phone3");
		productItem4.setUnitMeasure("km");
		productItem4.setPrice(400);
		productItem4.setQuantity(10);
		return productItem4;
	}
	
	@Bean
	public Map<String,Product> products(){
	Map<String, Product> products = new HashMap<String,Product>();
	products.put(productItem1().getSKU(), productItem1());
	products.put(productItem2().getSKU(), productItem2());
	products.put(productItem3().getSKU(), productItem3());
	products.put(productItem4().getSKU(), productItem4());
	return products;
	}
	
	@Bean(name="BeanNameCatalog")
	public Catalog catalog() {
		Catalog catalog = new Catalog();

		catalog.setProducts(products());
		return catalog;
	}
	
	@Bean
	public CatalogServiceImpl catalogService() {
		CatalogServiceImpl catalogService = new CatalogServiceImpl();
		catalogService.setCatalog(catalog());
		return catalogService;
	}

}
