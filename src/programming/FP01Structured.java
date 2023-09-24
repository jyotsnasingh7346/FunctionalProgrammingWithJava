package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// Traditional/ Structured Approach
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 16);

		// Task 01 : print all numbers
		printAllNumbersInListStructuredApproach(numbers);
		System.out.println();
		
		// Task 02 : print only even numbers
		printEvenNumbersInListStructuredApproach(numbers);

	}

	private static void printEvenNumbersInListStructuredApproach(List<Integer> numbers) {
		// Task 02 : print only even numbers
		
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.print(number + ", ");
			}
		}

	}

	private static void printAllNumbersInListStructuredApproach(List<Integer> numbers) {
		// Task 01 : print all numbers
		
		for (int number : numbers) {
			System.out.print(number + ", ");
		}

	}

}
