import java.math.*;
public class Rectangle {
	private double lenth;
	private double width;
	public Rectangle(double lenth,double width) {
		this.lenth = lenth;
		this.width = width;
	}
	public double area() {
		double area = lenth * width ;
		return area;
	}
	
	public void main(String[] args) {
		Rectangle rec = new Rectangle(4.5, 4);
		System.out.println("area is: " + rec.area());
	}
}