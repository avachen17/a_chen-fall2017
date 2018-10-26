//Ava Chen
//May 1, 2018
//TextExcel
//AP compsci per 2
package textExcel;

public class PercentCell extends RealCell{
public PercentCell(String cellValue) {
	super(cellValue.substring(0, cellValue.length()-1)); 
	
}
@Override
public String abbreviatedCellText() {
	String percentValue = (int)getDoubleValue() + "%";  
	if(percentValue.length() < 10) { //if the percent value is less than ten 
		for(int i = percentValue.length(); i< 10; i++) { 
			percentValue += " "; //then spaces will be added to the cell until it equals ten 
		}
		return percentValue;
	}else {			
		return percentValue.substring(0,10); //if the percentValue is greater than ten, the string will be cut off at 10
	}
}
public String fullCellText() {
	String percent = getcellValue(); 	
return (getDoubleValue()/100) + ""; //turning the percent into a decimal string value 
}
public double getDoubleValue() {
	return Double.parseDouble(getcellValue()); //the getcellValue will be turned into a double value 
}
}
 