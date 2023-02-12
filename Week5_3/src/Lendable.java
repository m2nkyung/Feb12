public interface Lendable {
	void checkOut(String borrower, String checkOutDate);
	void checkIn();
}