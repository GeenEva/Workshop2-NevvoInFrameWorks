package rsvier.workshop2.controller;

import rsvier.workshop2.dao.*;
import rsvier.workshop2.domain.*;
import rsvier.workshop2.view.*;

public class ProductController extends Controller{

	ProductView productView = new ProductView();
	Product product = new Product();
	GenericDAO genDAOProduct = new GenericDAOImp(product.getClass());
	
	
	@Override
	public void runView() {
		productView.printHeaderMessage();
		productView.printMenuMessage();
		productMenuSwitch(productView.getIntInput());
	}


	private void productMenuSwitch(int choice) {
		
		switch(choice) {
		
		case 1: //Create product
				createNewProduct();
				runView();
				break;
				
		case 2: //Find products
				break;
				
		case 0: //Back to Main Menu
				break;
				
		default://Stay here
				runView();
				break;
		}
		
	}


	private void createNewProduct() {
		
		productView.printAskProductName();
		product.setName(productView.getStringInput());
		productView.printAskProductPrice();
		product.setPrice(productView.getBigDecimalInput());
		productView.printAskProductStock();
		product.setStock(productView.getIntInput());
		
		genDAOProduct.createObject(product);
		genDAOProduct.closeEntityManager();
		
		System.out.println("\nHet product is aangemaakt: " + product.toString() + "\n");
		
	}

}
