package com;

public class Car {
	String color;
	float originalCost;
	int mileage;
	String make;
	String model;
	int year;
	String trim;
	
	
//	public static void main(String[] args) {	
//	}

		void start() {
			System.out.println("Car Started");
		}
		
		void accelerate() {
			System.out.println("Accleration Applied");
		}
		
		void moving() {
			System.out.println("In Motion");
		}
		
		void brake() {
			System.out.println("Deceleration Applied");			
		}
		
		void displayCarDetails(String name) {
			System.out.println("Name of car:"+name);
			System.out.println("Year:"+this.year);
			System.out.println("Make:"+this.make);
			System.out.println("Model:"+this.model);
			System.out.println("Trim:"+this.trim);
			System.out.println("Color:"+this.color);
			System.out.println("Mileage:"+this.mileage);
			System.out.println("Year:"+this.year);
			System.out.println("Original Cost:"+this.originalCost);
		}
}
