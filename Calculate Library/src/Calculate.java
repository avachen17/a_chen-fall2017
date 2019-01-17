/*Ava Chen
 * September 6, 2017 
/
public class Calculate {
	//part 1: methods, headers, and basic math 
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
	//this method finds the discriminant by using the quadratic equation in standard form
	public static double discriminant (double number1, double number2, double number3) {
		return ((number2*number2)- (4*number1*number3)); 
	}
	//this method converts mixed numbers into an improper fraction 
	public static String toImproperFrac (int sideNumber, int topNumber, int bottomNumber) {
		return ((sideNumber * bottomNumber) + "/" + (bottomNumber));
	}
	//this method converts an improper fraction into a mixed number
	public static String toMixedNum (int top, int bottom) {
		return (top/bottom) + "_" + (top % bottom) + "/" + (bottom);
		}
	//this method converts a binomial multiplication of the form (ax + b)(cx +d) into a quadratic equation of the form (ax^2+bx+c)
	public static String foil (int num1, int num2, int num3, int num4, String variable) {
		return (num1*num3) + variable + "^2 +" + ((num1*num4) + (num2*num3)) +variable+ "+"+ (num2*num4); 
	}
	//part 2: methods with conditionals 
	//this method determines whether or not one integer is evenly divisible by the other 
	public static boolean isDivisibleBy (int number1, int number2) {
		if (number1%number2 == 0) {
			return true;
		}else{
				return false; 
		}
	}
	//this method determines the absolute value
	public static double absValue (double value) {
			  if (value < 0) {
				  return value*-1;
			  }else {
				  return value;
			  }
	}
	//this method returns the larger of the values passed 
	public static int max (int number1, int number2) {
		if (number1 > number2) {
			return number1; 
		}
		if (number2 > number1) {
			return number2;
		}
		return number1;
	}
	//this method is an overload of the max method 
	public static double max (double number1, double number2, double number3) {
		if (number1 > number2) {
			return number1; 
		}else if (number2>number3) {
			return number2;
		} else {
			return number3; 
		}
	}
	//this method returns the smallest value
		public static int min (int number1, int number2) {
			if (number1 < number2) {
				return number1; 
			}
			if (number2 < number1) {
				return number2;
			}
			return number1;
	}
	//this method rounds a double correctly to 2 decimal places and returns a double 
		public static double round2 (double number1) {
			if ((number1*1000) % 10 < 5) {
				return ((number1*1000)-((number1*1000)%10))/1000;
			} else {
				return ((10-((number1*1000)%10))+(number1*1000))/1000;
			}
		}
	//part 3: methods that use loops and calls to other methods 
	//this method raises a value to a positive integer power
		public static double exponent(double base , int power) {
			double result = 1;
				for (int i= 0; i< power; i++){
					result = base*result;
		}
			return result;
		}
	//this method multiplies the integer by its factorial
		public static int factorial(int operand){
			if (operand<=2) {
				return operand;
			}
			int result = operand * (operand-1);
			int operand2 = operand;
			operand2 = operand;
			while (operand2>0) {
				result = result * operand2; 
				operand2--;
			}
			return result; 
}
	//this method determines whether or not an integer is prime
		public static boolean isPrime(int value) {
			boolean prime = true; 
			value = (int) absValue(value); 
			if(value%2 == 0) {
				prime = false;		
			}
			return prime; 
		}
	//this method finds the greatest common factor of two integers 
		public static int gcf(int num1, int num2){
			int gcf = 1; 
			for(int i =1; i<= num2; i++) {
				if(isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
					gcf = i; 
				}
			}
			return gcf;
		}
	//this method returns an approximation of the square root of the value passed, rounded to two decimal places 
		public static double sqrt(double square){
			if (square<0) {
				throw new IllegalArgumentException("Cannot root negatives"); 
			}
			double number; 
			double squareRoot = square/2; 
			do {
				number = squareRoot;
				squareRoot = (number + (square/number)) / 2; 
			} while((number - squareRoot)!= 0);
			return Calculate.round2(squareRoot);
			}
		{
		}
	//part 4: Throwing Exceptions
	//this method uses the coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate the real roots, if any
	public static String quadForm(int a, int b, int c) {
	double discrim = discriminant(a, b, c);
	if (discrim < 0) {
		return "no real roots"; 
	} else if (discrim == 0) {
		double outcome = (-b + sqrt(discrim)) / (2 * a);
		return round2(outcome) + " ";
	}else { 
		double positiveQuadratic = (-b + sqrt(discrim)) / (2 * a);
		double negativeQuadratic = (-b - sqrt(discrim)) / (2 * a);
		return round2(negativeQuadratic) + " and " + round2(positiveQuadratic); 
	}
		}
}


