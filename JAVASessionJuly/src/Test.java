import java.util.ArrayList;

public class Test {

	
	
	/*
	 * 1. Classes and Objects
	 * 2. Methods , method calling
	 * 3. Data Types
	 * 4. Interface
	 *5. Arrays
	 *6. ArrayLList
	 *
	 */
	
	public static void main(String[] args) {
		int employee_id = 45;
		
		//int, long ,double, float
		// String 
		
		long longVariable = 45678;
		String name = "Ajay";
		//System.out.println(employee_id);
		//calculateSum();
		//System.out.println(name);
		
		int number1 = 10;
		int number2 = 20;
		
		Add objectAdd = new Add();
		objectAdd.addIntegers(number1, number2);
		
		Bank1 objectBank1 = new Bank1();
		//objectBank1.createAccount();
		
		int[] array = {10,20,30};
		
		System.out.println("Printing using indexes");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		for(int i = 0; i < array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
	}
	
	
	public static void calculateSum() {
		//System.out.println("I am in method");
	}
	
	
}
