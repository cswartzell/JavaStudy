// Name, Rating, Description, Price
public class Product {	
	String name;
	double ratings;
	String description;
	double price;

	
	public Product() {
		super();
	}


	/**
	 * @param name
	 * @param ratings
	 * @param description
	 * @param price
	 */
	public Product(String name, double ratings, String description, double price) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.description = description;
		this.price = price;
	}

	public void setProductData(String name, double ratings, String description, double price) {
		this.name = name;
		this.ratings = ratings;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	void showProductData() {
		System.out.println("--------------------------------");
		System.out.println("Product: "+name+" Rating: "+ratings+" Price: $"+price);
		System.out.println(description);
		System.out.println("--------------------------------");
		System.out.println();
	}
	
}