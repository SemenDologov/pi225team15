package project4;

public class RectangleCalculation extends calculation {

	private Integer length;
	private Integer width;

	public RectangleCalculation(Integer length, Integer width) {
		this.length = length;
		this.width = width;
	}
	
	public Integer Calc() {
		return(length + width)*2;
	}
	
}
