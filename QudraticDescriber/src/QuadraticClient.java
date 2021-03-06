//Ava Chen
//APCS Per2
//October 17, 2017
//This is part 5 of Calculate Project. This code will pull together a bunch of the methods I have written to create a program that can describe the graph of a quadratic function
import java.util.Scanner;
public class QuadraticClient {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in); 
		String ready;
		String answer;
		String exit;
		boolean done = true;
		System.out.println("Hello, welcome to Quadratic Client! Let's get started!");
		do {
		System.out.println("What is your coefficient for a?");
		double a = scan.nextDouble(); 
		System.out.println("What is your coefficient for b?");
		double b = scan.nextDouble();
		System.out.println("What is your coefficient for c?");
		double c = scan.nextDouble();
		System.out.println("Your coefficients in standard form: " + a + "x^2" + " + " + b + "x" + " + " + c);
		System.out.println("Here is a description of the graph");
		Quadratic.quadrDescriber(a, b, c);
		System.out.println("Yay! Would you like to repeat? yah or nah?");
		answer = scan.next();
		
		if(answer.equals("yah")) {
			done = false; 
		}
		if(answer.equals("nah")) {
			done = true; 
		}
		}while(!done);
			System.out.println("Okay! Bye Bye! Peace out");
		}
	}
	

