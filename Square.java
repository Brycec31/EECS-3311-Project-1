import java.awt.Color;
import java.awt.Graphics2D;

public class Square implements Shape{
	private int xsize, ysize, xcor, ycor;
	private Color c;
	public Square(int xcor, int ycor) {
		this.c = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
		this.xsize = (int) (Math.random() * 81 + 10);
		this.ysize = this.xsize;
		this.xcor = xcor;
		this.ycor = ycor;
	}
	
	public double getArea() {
		double area;
		area = this.xsize * this.ysize;
		return area;
	}
	
	public void draw(Graphics2D g2d) {
		g2d.setColor(this.c);
		g2d.fillRect(this.xcor, this.ycor, this.xsize, this.ysize);
	}
	
	public int compareTo(Shape other) {
		double myArea = getArea();
		double otherArea = other.getArea();
		if(myArea > otherArea) {
			return 1;
		}else if(myArea == otherArea) {
			return 0;
		}else {
			return -1;
		}
	}
	
	public void changeCoords(int xcor, int ycor) {
		this.xcor = xcor;
		this.ycor = ycor;
	}
}
