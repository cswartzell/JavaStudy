

abstract class Bike {
	abstract void Speed();
}

class Pulsar extends Bike {
	void color () {
		System.out.println("Black");
	}
	//POLYMORPHISM RUNTIME OVERRIDE
	void Speed() {
		//RETAIN original, overwritten method
//		super.Speed(); //No Longer Valid as the original method was abstract
		System.out.println("90kph");
	}
}
public class AbstractExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bike bb = new Bike();  INVALID, cannot make an object of an abstract type
		Pulsar pu = new Pulsar();
		pu.Speed();
		
	}

}
