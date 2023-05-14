package com;

class Bike {
	void Speed() {
		System.out.println("60kph");
	}
}
class Pulsar extends Bike {
	void color () {
		System.out.println("Black");
	}

	//POLYMORPHISM RUNTIME OVERRIDE
	void Speed() {
		//RETAIN original, overwritten method
		super.Speed();
		System.out.println("90kph");
	}
}

class Honda extends Bike {
	void color() {
		System.out.println("Gray");
	}
}




public class RuntimePolymorphism {
		public static void main(String[] args) {
		Pulsar pu = new Pulsar();
		Honda hh = new Honda();
		
		pu.color();
		pu.Speed();
		
		hh.color();
		hh.Speed();

		
	}
}
