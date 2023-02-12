public class Triangle extends Shape {
	public void draw() {
		System.out.println("삼각형 그리기");
	}

	public void move(int dx, int dy) {
		System.out.println("삼각형 이동좌표");
		setX(getX() + dx);
		setY(getY() + dy);
		System.out.println("x : " + getX() + ", y : " + getY());	
	}
}