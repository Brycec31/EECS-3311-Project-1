import java.awt.Graphics2D;

public interface Shape {
	
	public void draw(Graphics2D g2d);
	public double getArea();
	public int compareTo(Shape other);
	public void changeCoords(int xcor, int ycor);
}
