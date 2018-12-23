//Ava Chen
//October 30, 2017
//APCS Per2
//Split Code Project
	
//Your task Part 1:
/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
* What if it's a fancy sandwich with multiple pieces of bread?
*/

//Your task Part 2:
/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
* Again, what if it's a fancy sandwich with multiple pieces of bread?
*/
import java.util.Arrays;
public class Split{
	public static void main(String[] args){
		//this is part 0 of my code 
		String[] split = "I like apples!".split(" ");
		System.out.println(Arrays.toString(split));
		System.out.println(Arrays.toString("I reallyreally like apples!".split("really")));
		//this is part 1 of my code 
				System.out.println(splitSandwhich("bread bread")); 
				// this is to test whether the code can identify that there is nothing between the two pieces of bread 
				//the code should also print that this is not a sandwhich
				System.out.println(splitSandwhich("bread ham lettuce bread"));
				//this is to test if the code will print the contents in the sandwhich
				System.out.println(splitSandwhich("bread cheese bread lettuce"));
				//this is to test if the code will only print out the contents inside the sandwhich but nothing listed after bread
				System.out.println(splitSandwhich("chicken bread bread cheese"));
				//this is to test if the code will not print any of the contents listed outside of bread
				//this code should also print that this is not a sandwhich
			//this is part 2 of my code 
				System.out.println(findFilling("breadlettucecheesebaconchickenbread"));
				//this is to test whether the code can find the word bread and print the contents inside 
				System.out.println(findFilling("breadcheesechickenlettucebreadtomato"));
				//this is to test whether the code will identify the contents inside the bread and leave out the contents outside of the bread
				System.out.println(findFilling("breadbread"));
				//this is to test whether the code will identify that this isn't a sandwhich 
				//the code should print that this is not a sandwhich 
				System.out.println(findFilling("breadtomatobreadcheesebreadchickenbreadturkeybread"));
				//just for fun :)	
			}
			//this method will be called splitSandwhich where the code will deal with inputs that have spaces and will be able to print the contents inside the sandwhich only
			public static String splitSandwhich(String mySandwhich) {
				String result = ""; 
				String contents = " " + mySandwhich + " ";
				String[] separateSandwhich = mySandwhich.split(" "); 
				if(mySandwhich.equals("bread bread")) {
					System.out.print("are you on a diet?! try again");
					}
				for( int i = 0; i< separateSandwhich.length; i++ ) {
					contents+=separateSandwhich[i];
				}
				String[] splitBread = contents.split("bread");
				if(splitBread.length <= 2) {
					System.out.println("That's a super sad sandwhich. Try again");
				}else {
					for(int i = 1; i<splitBread.length-1; i++) {
						if(splitBread[i].equals("") && i==splitBread.length-2) {
							System.out.println("hey! that's not a sandwhich! Yuck!");
						}else {
								result += splitBread[i];
							}
						}
					}
					return result;
				}
			//this method will be called findFilling where the code will deal with inputs that don't have spaces and will be able to print the contents inside the sandwhich only 
			public static String findFilling(String theSandwhich) {
				String result = ""; 
				String contents = " " + theSandwhich + " ";
				String[] separateSandwhich = contents.split("bread"); 
				if(theSandwhich.equals("breadbread")) {
					System.out.print("are you on a diet?! try again");
					}
				if(separateSandwhich.length <= 2) {
					System.out.println("That's a super sad sandwhich. Try again");
				}else {
					for(int i = 1; i<separateSandwhich.length-1; i++) {
						String inside = separateSandwhich[i];
						if(separateSandwhich[i].equals(" ")) {
							System.out.print("");
						}else {
								result += inside;
	}
				}
			}
				return result;
	 }
	 }
