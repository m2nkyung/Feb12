public class Week5_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] arr = new Shape[3];
		
		arr[0] = new Rectangle();
		arr[0].draw();
		arr[0].move((int) (Math.random() * 100), (int) (Math.random() * 100));
		
		arr[1] = new Triangle();
		arr[1].draw();
		arr[1].move((int) (Math.random() * 100), (int) (Math.random() * 100));
		
		arr[2] = new Circle();
		arr[2].draw();
		arr[2].move((int) (Math.random() * 100), (int) (Math.random() * 100));
		

	}

}
