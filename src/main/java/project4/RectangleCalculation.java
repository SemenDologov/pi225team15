package project4;

public class RectangleCalculation extends calculation {

	private int length;
	private int width;

	public RectangleCalculation(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int Calc() {
		return(length + width)*2;
	}
	
}
