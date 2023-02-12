import java.util.Date;

public interface Lendable {
	void checkOut(String borrower, Date date);
	void checkIn();
}