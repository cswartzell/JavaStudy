package com;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.start();
		myCar.accelerate();
		myCar.moving();
		myCar.brake();
		
		myCar.displayCarDetails("Prius C");
	}

}

