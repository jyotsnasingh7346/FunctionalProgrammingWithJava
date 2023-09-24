package programming;

import java.util.List;

public class FP02StringFunctional {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring" , "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		// Task 01 : Print all courses individually
		printAllCourses(courses);
		System.out.println("---------------");
		
		// Task 02 : Print courses containing the word 'Spring'
		printOnlySpringCourses(courses);
		System.out.println("---------------");
		
		// Task 03 : Print courses whose name has at least 4 letters
		printCoursesWithAtLeast4Letters(courses);
		System.out.println("---------------");
		
		// Task 04 : Print the number of characters in each course name along with its names
		printCourseWithNumberOfCharactersInCourseWithEachNames(courses);
		System.out.println("---------------");
	}

	private static void printCourseWithNumberOfCharactersInCourseWithEachNames(List<String> courses) {
		
		courses
		.stream()
		.map(course -> course + " " + course.length())
		.forEach(System.out::println);
		
	}

	private static void printCoursesWithAtLeast4Letters(List<String> courses) {
		
		courses
		.stream()
		.filter(course -> course.length() >= 4)
		.forEach(System.out::println);
		
	}

	private static void printOnlySpringCourses(List<String> courses) {
		
		courses
		.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);
		
	}

	private static void printAllCourses(List<String> courses) {
		
		courses
		.stream()
		.forEach(System.out::println);
		
	}

}
