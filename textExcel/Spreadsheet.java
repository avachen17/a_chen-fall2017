//Ava Chen
//May 1, 2018
//TextExcel
//AP compsci per 2
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	// declaring a 2d array named cellArray
	private Cell[][] cellArray = new Cell[getRows()][getCols()];

	// constructor
	public Spreadsheet() {
		// making the spreadsheet 20 rows and 12 columns
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				cellArray[i][j] = new EmptyCell();
			}
		}
	}

	@Override
	// returning an empty string (as instructed)

	public String processCommand(String command) {
		String[] array = command.split(" ", 3); // split the command at the spaces
		if (command.equals("")) { // if the command has empty quotes, return empty string
			return "";
		}
		if (command.contains("=")) { // assignment statement
			// if the command has a "=" then a value will be assigned into the cell
			SpreadsheetLocation loc = new SpreadsheetLocation(array[0].toLowerCase());
			// call method
			assignValue(loc, array[2], cellArray);
			return getGridText();
		}

		else if (command.toLowerCase().contains("clear")) { // if the command contains clear
			if (array.length == 1) { // and the command has a length of 1
				for (int i = 0; i < getRows(); i++) {
					for (int j = 0; j < getCols(); j++) {
						cellArray[i][j] = new EmptyCell();
						// make all cells empty
					}
				}
			} else if (array.length == 2) { // else if the array length is 2, then the user, for example, input "clear
											// b1" which would only clear one cell
				SpreadsheetLocation loc = new SpreadsheetLocation(array[1].toLowerCase());
				cellArray[loc.getRow()][loc.getCol()] = new EmptyCell();
				// clear only one cell
			}
		} else {
			SpreadsheetLocation loc = new SpreadsheetLocation(array[0].toLowerCase());
			return cellArray[loc.getRow()][loc.getCol()].fullCellText();
			// get grid text
		}

		return getGridText();

	}

	public void assignValue(SpreadsheetLocation loc, String value, Cell[][] spreadsheetgrid) {
		if (value.contains("\"")) { // if the value contains a \, then the value is a fraction
			cellArray[loc.getRow()][loc.getCol()] = new TextCell(value);
		} else if (value.contains("%")) { // if the value contains a %, then the value is a percent
			cellArray[loc.getRow()][loc.getCol()] = new PercentCell(value);
		} else if (value.contains(")")) { // if the value contains a ) then the value is a formula
			cellArray[loc.getRow()][loc.getCol()] = new FormulaCell(value, spreadsheetgrid);
		} else {
			cellArray[loc.getRow()][loc.getCol()] = new ValueCell(value);
		}
	}

	@Override
	// returning 20 rows
	public int getRows() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	// returning 12 rows
	public int getCols() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	// calling getRow and getCol and putting it into the 2d array to make a
	// spreadsheet
	public Cell getCell(Location loc) {

		// TODO Auto-generated method stub
		return cellArray[loc.getRow()][loc.getCol()];
	}

	@Override
	// creating the spreadsheet by installing lines and spaces
	public String getGridText() {
		String output = "   ";
		for (char c = 'A'; c <= 'L'; c++) {
			output += "|" + c + "         ";
		}
		output += "|\n";

		for (int r = 0; r < getRows(); r++) {
			output += (r + 1) + " ";
			if (r < 9) {
				output += " ";
			}
			output += "|";
			for (int c = 0; c < getCols(); c++) {
				output += cellArray[r][c].abbreviatedCellText() + "|" + "";
			}
			output += "\n";
		}

		return output;
	}
}
