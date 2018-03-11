package com.uciext.springfw.hw.catalog.service.impl;

import java.util.Map;

import org.apache.log4j.Logger;

import com.uciext.springfw.hw.catalog.service.CatalogService;
import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;

public class CatalogServiceImpl implements CatalogService {
	
	   private static Logger logger = Logger.getLogger("com.uciext.springfw.hw.catalog.service.impl.CatalogServiceImpl");

	    private Catalog catalog;
	    
		public CatalogServiceImpl() {
		    logger.info("In CatalogServiceImpl()");
		}
		
		public Catalog getCatalog() {
			return catalog;
		}

		public void setCatalog(Catalog catalog) {
			this.catalog = catalog;
		}

		public Product getProduct(String sku) {
			return catalog.getProduct(sku);
		}



}
