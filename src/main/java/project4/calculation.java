package project4;

public abstract class calculation {

	   private Integer length;
	   private Integer width;

	   abstract public Integer Calc();

	   public Integer getLength() {
	       return length;
	   }

	   public void setLength(Integer length) {
	       this.length = length;
	   }

	   public Integer getWidth() {
	       return width;
	   }

	   public void setWidth(Integer width) {
	       this.width = width;
	   }
}

