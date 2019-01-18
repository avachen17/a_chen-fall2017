//Ava Chen
//May 1, 2018
//TextExcel
package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner; 

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in); //scanner 
		Spreadsheet mySpreadsheet = new Spreadsheet();
		//program's input statement 
		System.out.println("\nHi! This is TextExcell! Please enter a command.");
		String input = userInput.nextLine();
		while(!input.equals("quit")) { //if the user doesn't type "quit" then the program will ask for another input 
			System.out.println(mySpreadsheet.processCommand(input));
			System.out.println("\nPlease enter another command.");
			input = userInput.nextLine(); 
			}
			}    
	}
