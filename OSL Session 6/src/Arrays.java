
public class Arrays {
	public static void main(String[] args) {
		//primitives
		int confirmed = 4684;
		int recovered = 4683;
		int deceased = 435;
		int vaccinated = 64531;
		
		//can only store homogeneous data
		int covidCases[] = {4684, 4683, 435, 64531};
		
		//both are valid for stupid reasons
		int arr1[] = {10,654,16351,13};	//arr1 is an array
		int[] arr2 = {10,654,16351,13}; //arr2 
		
		int[] a3, a4;  //Now we see these are both int arrays
		int a5[],a6; //Now a5 is an int array, but a6 is just an int
		// What an asinine bit of syntax
		
		//yet more syntax. This is explicit mem c
		int ar7[] = new int[] {1,2,3,4};
		int[] ar8 = new int[] {1,2,3,4};
		
		//declared size of 50, init to 0
		int array9[] = new int[50];
		int[] array10 = new int[50];
		
		//reference type
		array9[1] = 20; //assignment by index
		System.out.println("confirmed is: "+confirmed);
		System.out.println("confirmed is: "+covidCases); //prints address
		System.out.println("confirmed is: "+covidCases[0]); //prints first index of address
		
		int[] data = covidCases; //data is copied by REFERENCE not value
		System.out.println("confirmed is: "+data); //prints address, SAME as covidCases array
		
		for (int i = 0 ; i < covidCases.length; i++) {
			System.out.println("covidCases "+i+" is : "+covidCases[i]);
		}
		
		for (int element: covidCases) { //simpler, for each
			System.out.println("covidCases Element: "+element);
		}
		
		
		
	}
}
