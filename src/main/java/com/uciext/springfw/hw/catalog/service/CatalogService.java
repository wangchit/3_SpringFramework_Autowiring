package com.uciext.springfw.hw.catalog.service;

import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;

import java.util.Map;

public interface CatalogService {
	public Catalog getCatalog();
	public Product getProduct(String sku);
}
