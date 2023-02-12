public class Shape implements Movable {
	private int x, y;
	
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		x += dx;
		y += dy;
	}
	
	public void draw() {}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	};
}