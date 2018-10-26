//Ava Chen
//AP Compsci per2
//December 18, 2017
//FracCalc final + extra credit + objects
package fracCalc;

public class Fraction {
//private variables:
	//initializing beginning values to the private variables 
	private int numer = 0;
	private int whole = 0;
	private int denom = 1;

	public Fraction(String fraction) {
		//splitting the fraction at / and _ to create three "parts" 
		//these parts will be the two fractions and the operator 
		if(fraction.contains("/") && !(fraction.contains("_"))){
			//splitting the first fraction and second fraction into a numerator and denominator 
			//all variables are turned into an int
         	numer = Integer.parseInt(fraction.split("/")[0]);
         	denom = Integer.parseInt(fraction.split("/")[1]);    
         	//if the fraction contains an underscore first, that means that there must be a whole number 
         	//store values into the whole variable and split the fractions based on / and _
         	//all variables are turned into an int
         }else if(fraction.contains("_") && fraction.contains("/")) {
          	numer = Integer.parseInt(fraction.split("_")[1].split("/")[0]);
          	denom = Integer.parseInt(fraction.split("/")[1]);
          	whole = Integer.parseInt(fraction.split("_")[0]);
		}else{
			//if there are no _ or /, then that means a whole number was entered 
			//needs to be turned into an integer 
			whole = Integer.parseInt(fraction);
		}
		//using improper fraction method here so that the fraction can be turned into its correct format for solving 
		improperFrac();
	}
//getter and setter 
		public int getNumerator() {
			return numer;
		}

		public void setNumerator(int numer) {
			this.numer = numer;
		}

		public int getWholeNumber() {
			return whole;
		}

		public void setWholeNumber(int whole) {
			this.whole = whole;
		}

		public int getDenominator() {
			return denom;
		}

		public void setDenominator(int denom) {
			this.denom = denom;
		}
		//turns the numerator and denominator back to their initial values 
	public Fraction() {
		this(0,1,0);
	}
	//deals with a fraction that has no whole number 
	public Fraction(int numer, int denom) {
		this(numer, denom, 0);
	}
	//this is a constructor that constructs a fraction using "this"
	public Fraction(int numer,  int denom, int whole) {
		this.numer = numer;
		this.whole = whole;
		this.denom = denom;
		//changes that fraction into an improper fraction
		improperFrac();
	}
	//using the getters in this method and using this
	public Fraction(Fraction frac) {
		this(frac.getNumerator(), frac.getDenominator(), frac.getWholeNumber());
	}
	//this is the multiply method: multiplies fractions 
	//multiply the first numerator by the numerator of fraction2
	//same goes with the denominator 
	public Fraction multiply(Fraction fraction2) {
		Fraction answer = new Fraction(this.numer * fraction2.getNumerator(), this.denom * fraction2.getDenominator());
		return answer;
	}
	//this is used for division 
	//reciprocal takes the second fraction and then flips it 
	public void reciprocal() {
		//if the numerator is negative, multiply both the numerator and the denominator by -1
		if(numer < 0) {	
			denom *= -1;	
			numer *= -1;
		}
		//store the numerator in a temporary variable because it is only specific to this case 
		//switch the values and store denominator variable in the numerator variable 
		//the denominator variable will equal the temporary variable which is the numerator
		int temporaryVar = numer;
		numer = denom;
		denom = temporaryVar;
	}
	//adding method: adds fractions 
	public Fraction add(Fraction frac2) {
		Fraction sum = new Fraction();
		//to find the common denominator, the numerator gets multiplied by the denominator of the other fraction 
		//for the denominator, the two denominators are multiplied so that they are the a
		sum.setNumerator(this.numer * frac2.getDenominator() + frac2.getNumerator() * this.denom);
		sum.setDenominator(this.denom * frac2.getDenominator());
		return sum;
	}	
	
	public void sign() {
		//if the whole number is zero, the numerator will be multiplied by -1
		//when a -1 is added, it is subtracting instead of adding 
		if(whole == 0) {
			numer *= -1;
			//otherwise if the whole number is above zero, the whole number will be multiplied by -1
			//when a -1 is added, it is subtracting instead of adding 
		}else {
			whole *= -1;
		}
	}
	//improper fraction method 
			//gets rid of the whole number and turns it into a fraction where its numerator is higher than the denominator
			public void improperFrac() {
				if(whole < 0 && numer > 0) {
					numer *= -1;
				}
				numer = whole * denom + numer;
				whole = 0;
			}

//mixed number method 
//turns the fraction back into a mixed number 
	//used in the simplify method 
//the mixed number method will be used when the fraction is in improper format
			//after the fraction has been solved, the mixed number method will divide the numerator and the denominator which will become the whole number
	//the numerator will be the remainder or the mod of the numerator/denominator
	public void mixedNumber() {
		whole = numer/denom + whole;
		if(whole != 0) { 
			numer = absValue(numer);
		}
			numer = numer % denom;
		}
	//this is the simplify method 
		public void simplify() {
			//the simplify method will turn the fraction from a improper fraction to a mixed number first 
			mixedNumber();
			//this method will find the greatest common factor of the numerator and denominator 
			//once the gcf is found, that number is divided by the numerator and the denominator
			int gcfFraction = gcf(numer, denom);
			numer /= gcfFraction;
			denom /= gcfFraction;
		}
	//this method checks to see if the numbers are divisible by one another or have an remainder
			//pulled from Calculate library 
			public static boolean isDivisibleBy (int number1, int number2) {
				if (number1%number2 == 0) {
					return true;
				}else{
						return false; 
				}
			}
	//this method finds the greatest common factor of the two denominators 
			//will be used to simplify the answer
			public static int gcf(int num1, int num2){
				int gcf = 1; 
				for(int i =1; i<= num2; i++) {
					if(isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
						gcf = i; 
					}
				}
				return gcf;
			}

		// returns the absolute value of a number
			//used in simplify method 
		public static int absValue (int value) {
			  if (value < 0) {
				  return value*-1;
			  }else {
				  return value;
			  }
		}
		//if there is a zero in the denominator, the fraction is undefined or error 
	public boolean zeroDenom() {
		if(denom == 0) 
			return true;
		else 
			return false;
	}
	//toString method 
	public String toString() {
		//if the numerator is 0, then there is no fraction. 
		//the program will print out the whole number 
		if(this.numer==0) {
			return this.whole+"";
			//if the whole number is 0, then the program will print out just the numerator / denominator 
		}else if(this.whole==0) {
			//or else the program will print out the entire fraction 
			return numer+"/"+denom;
		}else {
			return whole+"_"+numer+"/"+denom;
		}

	}
}
	