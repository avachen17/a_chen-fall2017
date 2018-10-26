//Ava Chen
//May 1, 2018
//TextExcel
//AP compsci per 2
package textExcel;

public class TextCell implements Cell {
	private String cellText;
	
	public TextCell(String cellText) { //constructor 
		this.cellText = cellText;
		System.out.println(cellText);
	}

	public String abbreviatedCellText() {
		String withoutquotes = cellText.substring(1, cellText.length()-1); //in this variable, the cellText is stripped of its quotes 
		if(withoutquotes.length() < 10) { //if the command is less than ten spaces, then spaces must be added to the statement in order to make it equal to ten
			for(int i = withoutquotes.length(); i< 10; i++) { //this is used so that the lines separating the columns in the spreadsheet dont get moved or shifted
				withoutquotes += " "; 
			}
			return withoutquotes;
		}else {
			//if the string is more than ten spaces, then the string should be cut off and should only display ten letters inside the cell
			return withoutquotes.substring(0,10);
		}
	}
	public String fullCellText() { 
		return cellText; 
	}
	public double getDoubleValue() { 
		return 0; 
	}

}