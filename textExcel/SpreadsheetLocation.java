//Ava Chen
//May 1, 2018
//TextExcel
//AP compsci per 2
package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private String cellName; 
	public SpreadsheetLocation (String cellName) { //constructor
		this.cellName = cellName; 
	}
    @Override
    public int getRow() 
    {
		String numberPart = cellName.substring(1); //numberPart is a variable that will only take the first letter of the input 
		//for example, if the input was "b1" the numberPart would equal 1 or the first index
		int row = Integer.parseInt(numberPart)-1; //here, the numberPart variable is changed into an integer. 1 is subtracted from that value due to zero base index
		return row; 
    }

    @Override
    public int getCol()
    {
    	return cellName.toLowerCase().charAt(0)-'a'; //this return statement will take the letter of the command and find the column position of that letter. 
    }

}
