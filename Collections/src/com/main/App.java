package com.main;

import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
//		ProductService ps = new ProductService();
//		Product p1= new Product(1, "tv", 450);
//		Product p2= new Product(2, "computer", 1450);
//		String result = ps.storeProuct(p1);
//		System.out.println(result);
//
//		ps.storeProuct(p1); //
//		ps.storeProuct(p1);
//		ps.storeProuct(p2);
//		System.out.println(ps.numProducts());
		ProductService ps = new ProductService();
		Scanner sc = new Scanner(System.in);
		int choice;		
		String con = "";
		do {
			System.out.println("1: Add Product, 2: Report number of Products");
			System.out.println("Chooese operation: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter Product Details--");
				System.out.println("Enter PID: ");
				int pid = sc.nextInt();
				System.out.println("Enter Product Name: ");
				String name = sc.next();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				Product p1 = new Product(pid, name, price);
				System.out.println( ps.storeProuct(p1));
				break;
			case 2:
				System.out.println("Number of Products: "+ps.numProducts());
				break; //technically the final break does nothing
			}
			System.out.println("Continue? (y/n): ");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Exiting");
	}

}
