//Ava Chen
//May 1, 2018
//TextExcel
//AP compsci per 2
package textExcel;

//*******************************************************
// DO NOT MODIFY THIS FILE!!!
//*******************************************************

public interface Cell
{
	public String abbreviatedCellText(); // text for spreadsheet cell display, must be exactly length 10
	public String fullCellText(); // text for individual cell inspection, not truncated or padded
	public double getDoubleValue(); 
}
