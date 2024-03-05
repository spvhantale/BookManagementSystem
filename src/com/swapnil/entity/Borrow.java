package com.swapnil.entity;

public class Borrow {

	private String memberId;
    private String ISBN;
    private long borrowDate;
    private long returnDate;
    
    public Borrow() {
		// TODO Auto-generated constructor stub
	}

	public Borrow(String memberId, String iSBN, long borrowDate, long returnDate) {
		super();
		this.memberId = memberId;
		ISBN = iSBN;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public long getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(long borrowDate) {
		this.borrowDate = borrowDate;
	}

	public long getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(long returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Borrow [memberId=" + memberId + ", ISBN=" + ISBN + ", borrowDate=" + borrowDate + ", returnDate="
				+ returnDate + "]";
	}
    
    
}
