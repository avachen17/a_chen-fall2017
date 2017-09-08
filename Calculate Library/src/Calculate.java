/*Ava Chen
 * September 6, 2017 
 * Our self written math library
 * It contains a series of methods to do basic math fractions
 */
public class Calculate {
	// this method finds the square of the input
	public static int square (int operand) {
		int squared = operand*operand;
		return squared; 
	}
	//this method finds the cube of the input
	public static int cube (int operand) {
		int cube = operand*operand*operand; 
		return cube; 
	}
	//this method finds the average of two numbers
	public static double average (double operand1, double operand2) {
		double average = (operand1 + operand2)/2;
		return average;
	}
	//this method finds the average of three numbers
	public static double average (double operand1, double operand2, double operand3) {
		double average = (operand1 + operand2 + operand3)/3;
		return average; 			
	}
	//this method converts the radians to degrees 
	public static double toDegrees (double angleRadians) {
		return angleRadians*(180/3.14159);
	}
	//this method converts degrees to radians 
	public static double toRadians (double angleDegrees) {
		return angleDegrees*(3.14159/180); 
	}
	//this method finds the discriminant
	public static double discriminant (double number1, double number2, double number3) {
		return ((number2*number2)- (4*number1*number3)); 
	}
	//this method finds improper fractions 
	public static String toImproperFrac (int sideNumber, int topNumber, int bottomNumber) {
		return ((sideNumber * bottomNumber) + "/" + (bottomNumber));
	}
	//this method finds Mixed Numbers
	public static String toMixedNum (int top, int bottom) {
		return (top/bottom) + "_" + (top % bottom) + "/" + (bottom);
		}
	//this method does Foil method 
	public static String foil (int num1, int num2, int num3, int num4, String variable) {
		return (num1*num3) + variable + "^2 +" + ((num1*num4) + (num2*num3)) +variable+ "+"+ (num2*num4); 
	}
	//this method determines whether or not one integer is evenly divisible by the other 
	public static int isDivisibleBy (int number1, int number2) {
		if (number1%number2 == 0) {
			return true;
			else {
				return false; 
			}
		}
	}
	
	}

