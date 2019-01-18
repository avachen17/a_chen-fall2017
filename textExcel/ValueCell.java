//Ava Chen
//May 1, 2018
//TextExcel
package textExcel;

public class ValueCell extends RealCell{
	public ValueCell(String cellValue) {
		super(cellValue); 
	}

	@Override
	public String abbreviatedCellText() {
		String value = getDoubleValue() + ""; //turning the double value into a string 
		if(value.length() < 10) { //if the value is less than 10
			for(int i = value.length(); i< 10; i++) { 
				value += " "; //add appropriate spaces
			}
			return value;
		}else {		//if the value is more than 10, then the code will cut the value off at 10	
			return value.substring(0,10);
		}
	}
	public String fullCellText() { 
		return getcellValue();
	}
	public double getDoubleValue() {
		return Double.parseDouble(getcellValue()); 
	}
	
}
