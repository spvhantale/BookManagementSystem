package com.swapnil.repo;

import java.util.List;

import com.swapnil.entity.Borrow;
import com.swapnil.exception.BorrowException;

public interface BorrowRepo {

	public void borrowBook(Borrow borrow);
    public String returnBook(String ISBN, String memberId) throws BorrowException;
    public List<Borrow> getBorrowingsByMember(String memberId) throws BorrowException;
}
