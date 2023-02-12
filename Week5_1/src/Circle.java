public class Circle extends Shape {
	public void draw() {
		System.out.println("원 그리기");
	}
	
	public void move(int dx, int dy) {
		System.out.println("원 이동좌표");
		setX(getX() + dx);
		setY(getY() + dy);
		System.out.println("x : " + getX() + ", y : " + getY());	
	}
}