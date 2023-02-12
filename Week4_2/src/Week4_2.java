public class Week4_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1 = new Book("개미", "", ""); 
		AppCD obj2 = new AppCD("1", "POWERJAVA", "");
		obj1.checkOut("김영숙", "2023-02-12");
		obj2.checkOut("박희경", "2023-02-13");
		obj1.checkIn();
		obj2.checkIn();
	}
}