import java.util.Date;

public class Book implements Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	int state = 0;
	
	public Book(String bookTitle, String borrower, String checkOutDate) {
		this.bookTitle = bookTitle;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
	}
	
	
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		// TODO Auto-generated method stub
		state = 1;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		
		System.out.println("대출완료 : " + bookTitle);
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + checkOutDate);
		
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		state = 0;
		System.out.println("반납완료 : " + bookTitle);
	}
	public String getRequestNo() {
		return requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}