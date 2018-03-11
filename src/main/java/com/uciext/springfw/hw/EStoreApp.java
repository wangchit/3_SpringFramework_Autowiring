package com.uciext.springfw.hw;

import org.apache.log4j.Logger;

import com.uciext.springfw.hw.catalog.service.CatalogService;
import com.uciext.springfw.hw.catalog.service.impl.CatalogServiceImpl;
import com.uciext.springfw.hw.catalog.model.Catalog;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigRegistry;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EStoreApp {
	
   private static Logger logger = Logger.getLogger(EStoreApp.class.getName());

	
   public static void main(String[] args) throws Exception {
	   
	   logger.info("Start");
	   
	   // Retrieve the bean using application context
	   //ApplicationContext context = new ClassPathXmlApplicationContext("com/uciext/springfw/hw/RegistrationContext.xml");
	   
	    // Make a call
	    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Catalog catalog = (Catalog) context.getBean("BeanNameCatalog");
	   
	    //logger.info("Catalog: \n" + catalog.toString());
	  logger.info("-------------------------");
	  logger.info("Product 1:" + catalog.getProduct("X104"));
	  logger.info("Product 2:" + catalog.getProduct("X106"));
	  logger.info("Product 3:" + catalog.getProduct("X108"));
	  logger.info("Product 4:" + catalog.getProduct("X110"));

	  ((ConfigurableApplicationContext)context).close();
   }
}
