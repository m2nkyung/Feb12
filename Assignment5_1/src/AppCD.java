import java.util.Date;
public class AppCD extends CD implements Lendable{
	String borrower;
	Date checkOutDate;
	int state;
	
	public AppCD(String registerNo, String title) {
		super(registerNo, title);
	}


	@Override
	public void checkOut(String borrower, Date checkOutDate) {
		// TODO Auto-generated method stub
		state = 1;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		
		System.out.println("CD 대출완료 : " + getTitle());
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + checkOutDate);
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		state = 0;
		System.out.println("CD 반납완료 : " + getTitle());
	}
}