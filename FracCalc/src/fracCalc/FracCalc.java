//Ava Chen
//December 18, 2017
//FracCalc final + extra credit + objects
package fracCalc;

import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {
		// sets up a scanner to take responses from user
    	Scanner scan= new Scanner(System.in);
    	boolean done=true;
    	while(done) {
    		//introduction
    		System.out.println("hey! this is FracCalc! please enter your Fraction equation (example: 3/4 + 5/6)! Or type done to exit this program");
        	String userInput=scan.nextLine();
        	//if the user inputs done, then the program will end 
        	if(userInput.equals("done")){
        		done=false;
        		System.out.println("Bye! FracCalc program has ended");
        	}
        	else{
        		System.out.println(produceAnswer(userInput));
        	}
    	}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String userInput) {
    	String[] splitOperands = userInput.split(" ");
     	if (splitOperands.length < 3 || splitOperands[0].equals("")) {
			// Checks if user inputed correct spacing 
    		// if not, return an error
			return "ERROR: Check for spaces between one or more operator and two numbers.";
		}
     	for(int i = 1; i < splitOperands.length - 1; i+=2) {
			if (!splitOperands[i].equals("+") &&!splitOperands[i].equals("-") &&!splitOperands[i].equals("*") &&!splitOperands[i].equals("/")) {
				// checks if the user put in operators 
				//if not, return an error
				return "ERROR: Please enter numbers with operators between them.";
			}
		}
     	//simplified version
    	String finalAns = "";
    	//fraction1 will be split at the 0 index
    	Fraction fraction1 = new Fraction(splitOperands[0]); 
    	//declaring fraction2
    	Fraction fraction2;
    	//answer when the fraction isn't simplified 
    	Fraction unsimplifiedAnswer;
    	//splitting fraction2
    	for(int i = 2; i < splitOperands.length; i += 2) {
    		fraction2 = new Fraction(splitOperands[i]);
    		//operator part
	        String operator = splitOperands[i-1];
	        //checks to see if the denominator is zero
	        if(fraction1.zeroDenom() || fraction2.zeroDenom()) {
	        	//if it is, the system will print out an error 
	        	return "ERROR: This program cannot divide by zero.";
	        }
	        if(fraction1.zeroDenom()) {
	        	return "ERROR: Do not divide by zero.";
	        }
	        //if fraction 2 has a denominator of zero
	        //the program will print an error 
	    	if(fraction2.zeroDenom()) {
        		return "ERROR: Do not divide by 0.";
        	}
	        if(operator.equals("+")){
	        	unsimplifiedAnswer = fraction1.add(fraction2);
	        	//if the user inputs a "+" operator, the program will use the add method 
	        }else if(operator.equals("-")) {
	        	fraction2.sign();
	        	unsimplifiedAnswer = fraction1.add(fraction2);
	        	//if the user inputs a "-" operator the program will add a negative sign to the fraction 
	        }else if(operator.equals("*")) {
	        	unsimplifiedAnswer = fraction1.multiply(fraction2);
	        	//if the user inputs a "*" operator the program will use the multiply method 
	        }else if(operator.equals("/")){  	
	        	fraction2.reciprocal();
	        	//if the user inputs a "/" operator the program will use the reciprocal method and then the multiply method to solve
	        	unsimplifiedAnswer = fraction1.multiply(fraction2);
	        	//if the user inputs none of these, then the program will print an error 
	        }else {
	        	return "ERROR: Please try a different equation with a different operator.";
	        }
	        //the unsimplified answer will be simplified using the simplify method in the fraction class
	        fraction1 = new Fraction(unsimplifiedAnswer); 
	        unsimplifiedAnswer.simplify();
	        //assigned to the finalAns string variable 
	        finalAns = unsimplifiedAnswer.toString();
    	}
		return finalAns;
    }
    
}
