public class ShapeFactory{
	public Shape getShape(int xcor, int ycor, int type) {
		if(type == 0) {
			return new Rectangle(xcor, ycor);
		}else if(type == 1) {
			return new Square(xcor, ycor);
		}else {
			return new Circle(xcor, ycor);
		}
	}
}
