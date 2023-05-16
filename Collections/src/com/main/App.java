package com.main;

import com.bean.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		ProductService ps = new ProductService();
		Product p1= new Product(1, "tv", 450);
		Product p2= new Product(2, "computer", 1450);
		String result = ps.storeProuct(p1);
		System.out.println(result);

		ps.storeProuct(p1); //
		ps.storeProuct(p1);
		ps.storeProuct(p2);
		System.out.println(ps.numProducts());
	}

}
