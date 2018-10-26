//Ava Chen
//May 1, 2018
//TextExcel
//AP compsci per 2
package textExcel;

public class FormulaCell extends RealCell {
	private String formula;
	private Cell[][] spreadsheetgrid;

	public FormulaCell(String cellValue, Cell[][] spreadsheetgrid) { //constructor
		super(cellValue); 
		this.formula = super.getFormula();
		this.spreadsheetgrid = spreadsheetgrid;

	}

	@Override
	public String abbreviatedCellText() {
		String value = getDoubleValue() + ""; //turns the double value into a string so that we can print the abbreviated version of it 
		if (value.length() < 10) { //if the string is less than 10, then the for loop will add the appropriate amount of spaces to prevent the lines separating the columns shift
			for (int i = value.length(); i < 10; i++) {
				value += " ";
			}
			return value;
		} else { //if the string is more than 10, then the string will be cut off at index 10 in order to fit the cell
			return value.substring(0, 10);
		}

	}

	public String fullCellText() {
		return formula;
	}

	private double parseValue(String value) {
		char letter = value.toLowerCase().charAt(0); //to get the letter of the input, the 'letter' variable is used to find which column the command is located
		if (letter >= 'a' && letter <= 'l') { //if the input is between a and l
			SpreadsheetLocation loc = new SpreadsheetLocation(value.toLowerCase()); // then the variable loc will get the spreadsheet location 
			return (spreadsheetgrid[loc.getRow()][loc.getCol()].getDoubleValue()); //the program will receive the location of the input
		} else {
			return Double.parseDouble(value); //if the input is not a letter, then the value will be turned into a double value
		}
	}

	public double getDoubleValue() {
		String formula = this.formula.substring(2, this.formula.length() - 2); //quotes and the spaces are cut off 
		String[] parsedInput = formula.split(" ");  //splitting at the spaces 
		double total = 0; //having the total begin at zero 
		if (parsedInput[0].toLowerCase().equals("sum") || parsedInput[0].toLowerCase().equals("avg")) { //if avg or sum
			int count = 0; //keeps track of how many numbers there are in the string array... used for avg
			String[] cellRange = parsedInput[1].split("-"); //splitting at the dash so we can deal with each cell location individually
			SpreadsheetLocation startLoc = new SpreadsheetLocation(cellRange[0].toLowerCase()); //the starting location is the first element of the array
			//if a user puts A1-B1, startLoc would equal A1
			SpreadsheetLocation endLoc = new SpreadsheetLocation(cellRange[1].toLowerCase()); //endLoc holds the second element
			int firstrow = startLoc.getRow(); //get the beginning and end row and columns
			int firstcol = startLoc.getCol();		
			int endrow = endLoc.getRow();
			int endcol = endLoc.getCol(); 
			for(int r = firstrow; r<=endrow; r++) {
				for(int c = firstcol; c<=endcol; c++) {
					//add current cell
					if(!spreadsheetgrid[r][c].fullCellText().equals("")) {
						total += (spreadsheetgrid[r][c].getDoubleValue());
						count ++; 
					}
				}
			}	
			if(parsedInput[0].toLowerCase().equals("avg")) { 
				total = total/count; //calculates the average value 
			}
			
		} else { //if no avg or sum
			total = parseValue(parsedInput[0]);
			for (int i = 1; i < parsedInput.length; i += 2) {
				if (parsedInput[i].equals("+")) {
					total = total + parseValue(parsedInput[i + 1]);
				} else if (parsedInput[i].equals("-")) {
					total = total - parseValue(parsedInput[i + 1]);
				} else if (parsedInput[i].equals("/")) {
					total = total / parseValue(parsedInput[i + 1]);
				} else {
					total = total * parseValue(parsedInput[i + 1]);
				}
			}
		}
		return total;
	}
}
