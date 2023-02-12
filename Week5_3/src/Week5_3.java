import java.util.Scanner;
public class Week5_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lendable arr[] = new Lendable[3];
		arr[0] = new Book("863처774개", "태양의 후예", "송중기");
		arr[1] = new Book("609.2ㄱ426ㅅ", "육룡이 나르샤", "유아인");
		arr[2] = new AppCD("2016-7001", "Java Source");
		checkOutAll(arr, "윤지혜", "20160330");
	}

	private static void checkOutAll(Lendable[] arr, String borrower, String date) {
		// TODO Auto-generated method stub
		for(int cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt].checkOut(borrower, date);
		}
	}
}