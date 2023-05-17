package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;

public class ProductService {
	// Business Logic: add products, delete products, edit products...
	private List<Product> products = new ArrayList<Product>();

	public String storeProuct(Product product) {
		int temp = 0;
		if (products.size() == 0) {
			products.add(product);
			return product + " Added";
		} else {
			Iterator<Product> ii = products.iterator();
			while (ii.hasNext()) {
				Product p = ii.next();
				if (p.getPid() == product.getPid()) {
					temp++;
				}

				if (temp == 0) {
					products.add(product);
					return product + " Added";
				} else {
					return "Product id must be unique. Product not added";
				}

			}
		}
		return null;
	}

	public int numProducts() {
		return products.size();
	}
	
	public Product findProduct(int pid) {
		Iterator<Product> ii = products.iterator();
		while (ii.hasNext()) {
			Product p = ii.next();
			if (p.getPid() == pid) {
				return p;
			}
		}
		return null;
	}
	
	public List<Product> listProducts() {
		return products;
	}
	
	public String updateProductPrice(Product product) {
		Iterator<Product> ii = products.iterator();
		while (ii.hasNext()) {
			Product p = ii.next();
			if (p.getPid() == product.getPid()) {
				p.setPrice(product.getPrice());
				return "Price Updated";
			}
		}
		return "Product Not Found";
	}
	
	public String DeleteProductByPid(Product product) {
		Iterator<Product> ii = products.iterator();
		while (ii.hasNext()) {
			Product p = ii.next();
			if (p.getPid() == product.getPid()) {
				ii.remove();
				return "Prodcut Deleted";
			}
		}
		return "Product Not Found";
	}
}
