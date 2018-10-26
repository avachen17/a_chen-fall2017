//Ava Chen
//May 1, 2018
//TextExcel
//AP compsci per 2
package textExcel;

public abstract class RealCell implements Cell{
private String cellValue; 

public RealCell (String cellValue) { 
	this.cellValue = cellValue;
}
	@Override
	public abstract String abbreviatedCellText(); 
	
	@Override
	public String fullCellText() { 
		return this.cellValue;
	}
	public double getDoubleValue() {
		return Double.parseDouble(cellValue); //turning the cellValue into a double 
	}
	public String getcellValue() { //getting the value of the cell 
		return cellValue;
	}
	public String getFormula() { //get the formula 
		return cellValue; 
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}