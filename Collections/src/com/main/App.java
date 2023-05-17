package com.main;

import java.util.Iterator;
import java.util.List;
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
//		int choice;
		String con = "";
		do {
			System.out.println("1: Add Product, 2: Number of Products, 3: Product Details by PID, 4: All Products Details, 5: Update Price by PID, 6: Delete Product by PID");
			System.out.println("Chooese operation: ");
			int choice = sc.nextInt();
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
			case 3:
				System.out.println("Enter PID of existing product: ");
				int pidsearch = sc.nextInt();
				Product result = ps.findProduct(pidsearch);
				if(result == null) {
					System.out.println("Product not found");
				} else {
//					System.out.println("Name: "+result.getPname());
//					System.out.println("Price: $"+result.getPrice());   //need to format to two decimal places
					System.out.println(result);
				}
				break;
			case 4: 
				List<Product> listOfProducts = ps.listProducts();
				Iterator<Product> li = listOfProducts.iterator();
				while (li.hasNext()) {
					Product p = li.next();
					System.out.println(p);
				}
				break;
			case 5:
				System.out.println("Enter PID: ");
				int pidUpdated = sc.nextInt();
				Product resultUpdated = ps.findProduct(pidUpdated);
				if (resultUpdated == null) {
					System.out.println("Product Not Found");
					break;
				}
				System.out.println("Current Price: $"+resultUpdated.getPrice());
				System.out.println("Enter New Price: ");
				float priceUpdated = sc.nextFloat();
				Product p1Updated = new Product(pidUpdated, resultUpdated.getPname(), priceUpdated); 
				System.out.println( ps.updateProductPrice(p1Updated));
				break;
			case 6:
				System.out.println("Enter PID: ");
				int pidToDelete = sc.nextInt();
				Product resultToDelete = ps.findProduct(pidToDelete);
				if (resultToDelete == null) {
					System.out.println("Product Not Found");
					break;
				} else {
					ps.DeleteProductByPid(resultToDelete);
					System.out.println("Product PID: "+pidToDelete+" deleted");
				}
				break;		
			}
			System.out.println("Continue? (y/n): ");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Exiting");
	}
}
