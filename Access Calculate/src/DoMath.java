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
	}

}
