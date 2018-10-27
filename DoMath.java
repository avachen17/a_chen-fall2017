/*Ava Chen
 * September 6, 2017 
 * Our self written math library
 * It contains a series of methods to do basic math fractions
 * This is the runner for the calculate library. It is used to test the methods and calculat
*/
public class DoMath {
	public static void main1(String[] args) {
		System.out.println(Calculate.square(2));
	}
	public static void main(String[] args) {
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2,2));
		System.out.println(Calculate.average(2, 2, 2));
		System.out.println(Calculate.toDegrees(10));
		System.out.println(Calculate.toRadians(10));
		System.out.println(Calculate.discriminant(2,1,3));
		System.out.println(Calculate.toImproperFrac(1,2,3));
		System.out.println(Calculate.foil(1,2,3,4, "n"));
		System.out.println(Calculate.isDivisibleBy(4,2));
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(1,2));
		System.out.println(Calculate.max(4,6,7));
		System.out.println(Calculate.min(4,7));
		System.out.println(Calculate.round2(2.354643));
		System.out.println((Calculate.exponent(2,5)));
		System.out.println((Calculate.isPrime(5)));
		System.out.println((Calculate.gcf(6, 18)));
		System.out.println(Calculate.sqrt(10));
		System.out.println((Calculate.quadForm(5, 10, 4)));
	}
	}
