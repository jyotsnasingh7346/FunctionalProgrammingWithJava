package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP01Functional {

	public static void main(String[] args) {
		// CHECK OUT .collect() in functional programming
		
		// Functional Approach
		/*
		 * List : [12,9,13,4...] 
		 * STREAM : 12 
		 * 			9 
		 * 			13 
		 * 			4 
		 * 			...
		 * 
		 * 1. Convert LIST into a STREAM / SEQUENCE of elements (.stream()) 
		 * 2. tell it to loop thru (forEach()) 
		 * 3. tell what to do for each element (call printNum of the current class)
		 */				
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,16);
		
		// Task 01 : print all numbers
		printAllNumbersInListFunctionalApproach(numbers);
		System.out.println("----------");
		
		// Task 02 : print only even numbers
		printEvenNumbersInListFunctionalApproach(numbers);
		System.out.println("----------");
		
		// Task 03 : print only odd numbers
		printOddNumbersInListFunctionalApproach(numbers);
		System.out.println("----------");
		
		// Task 04 : print squares of all even numbers
		printSquaresOfEvenNumbersInListFunctionalApproach(numbers);
		System.out.println("----------");
		
		// Task 05 : print cubes of all odd numbers
		printCubesOfOddNumbersInListFunctionalApproach(numbers);
		System.out.println("----------");
				
	}

	private static List<Integer> printCubesOfOddNumbersInListFunctionalApproach(List<Integer> numbers) {
		// Task 05 : print cubes of all odd numbers
		
		return numbers
		.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number * number).collect(Collectors.toList());
		
	}

	private static void printSquaresOfEvenNumbersInListFunctionalApproach(List<Integer> numbers) {
		// Task 04 : print squares of all even numbers
		// We will use mapper function to square numbers
		
		numbers
		.stream()
		.filter(number -> number % 2 == 0)
		.map(number -> number * number)
		.forEach(System.out::println);
		
	}

	private static void printOddNumbersInListFunctionalApproach(List<Integer> numbers) {
		// Task 03 : print only odd numbers
		
		numbers
		.stream()
		.filter(number -> number % 2 != 0)
		.forEach(System.out::println);
		
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	private static void printEvenNumbersInListFunctionalApproach(List<Integer> numbers) {
		// Task 02 : print only even numbers
		
		// Approach no. 01 (using filter)
		numbers
		.stream()
		.filter(FP01Functional::isEven) // filter only even numbers (filter is used to add a check)
		.forEach(System.out::println);  //& proceed only forEach even number
		
		// Approach no. 02 (using filter with Lambda expression to make it simpler) (no use of isEven())
		numbers
		.stream()
		.filter(number -> number % 2 == 0) // filter puts a condition check (Lambda is used as anonymous method)
		.forEach(System.out::println); // inside parenthesis we tell what to do
		
	}

	private static void printNum(int num) {
		System.out.println(num);
	}
	
	private static void printAllNumbersInListFunctionalApproach(List<Integer> numbers) {
		// Task 01 : print all numbers
		
		// Approach no. 01
		numbers.stream().forEach(FP01Functional::printNum); // (:: is called a Method Reference)
		System.out.println("----------");
		
		// Approach no. 02
		/*
		 * System.out has a static method println that we can call 
		 * instead of creating a new static method printNum() 
		 * Both approaches give you the same output.
		 * Why are we not giving parenthesis of the method? 
		 * Because we are not calling it, we are declaring it.
		 */		
		numbers.stream().forEach(System.out::println); 
		
	}

}
