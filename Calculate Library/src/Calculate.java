/*Ava Chen
 * September 6, 2017 
 * Our self written math library
 * It contains a series of methods to do basic math fractions
 */
public class Calculate {
	// square the input
	public static int square (int operand) {
		int squared = operand*operand;
		return squared; 
	}
	//cube the input
	public static int cube (int operand) {
		int cube = operand*operand*operand; 
		return cube; 
	}
	//average of two numbers
	public static double average (double operand1, double operand2) {
		double average = (operand1 + operand2)/2;
		return average;
	}
	//average of three numbers
	public static double average (double operand1, double operand2, double operand3) {
		double average = (operand1 + operand2 + operand3)/3;
		return average; 			
	}
	//convert radians to degrees 
	public static double toDegrees (double angleRadians) {
		return angleRadians*(180/3.14159);
	}
	//convert degrees to radians 
	public static double toRadians (double angleDegrees) {
		return angleDegrees*(3.14159/180); 
	}
	//discriminant
	public static double discriminant (double a, double b, double c) {
		return ((b*b)- (4*a*c)); 
	}
	//improper fractions 
	public static String toImproperFrac (int sideNumber, int topNumber, int bottomNumber) {
		return ((sideNumber * bottomNumber) + "/" + (bottomNumber));
	}
	//Mixed Numbers
	public static String toMixedNum (int top, int bottom) {
		return (top/bottom) + "_" + (top % bottom) + "/" + (bottom);
		}
	//Foil
	public static String foil (int num1, int num2, int num3, int num4, String v) {
		return (num1*num3) + v + "^2 +" + ((num1*num4) + (num2*num3)) +v+ "+"+ (num2*num4); 	
	}
	}

