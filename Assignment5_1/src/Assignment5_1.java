import java.util.Date;
import java.util.Scanner;
public class Assignment5_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("대출하려는 책이나 cd의 숫자는? : ");
		int n = input.nextInt();
		
		Lendable[] lend = new Lendable[n];
		
		for(int i = 0; i < lend.length; i++) {
			System.out.print("책을 대출하려면 1번, cd를 대출하려면 2번 : ");
			if(input.nextInt() == 1) {
				System.out.print("책의 청구번호 >> ");
				String s = input.next();
				System.out.print("책 제목 >> ");
				String s1 = input.next();
				System.out.print("책 저자 >> ");
				String s2 = input.next();
				lend[i] = new Book(s, s1, s2);
			} else {
				System.out.print("CD의 등록번호 >> ");
				String s = input.next();
				System.out.print("CD 제목 >> ");
				String s1 = input.next();
				lend[i] = new AppCD(s, s1);
			}
		}
		
		System.out.print("대출하는 사람의 이름은? ");
		String name = input.next();
		Date d = new Date();
		checkOutAll(lend, name, d);

	}
	
	private static void checkOutAll(Lendable[] arr, String borrower, Date date) {
		// TODO Auto-generated method stub
		for(int cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt].checkOut(borrower, date);
		}
	}
}
