package com.swapnil.service;

import java.util.ArrayList;
import java.util.List;

import com.swapnil.entity.Borrow;
import com.swapnil.exception.BorrowException;
import com.swapnil.repo.BorrowRepo;

public class BorrowService implements BorrowRepo{
	   private List<Borrow> borrows = new ArrayList<>();

	    @Override
	    public void borrowBook(Borrow borrow) {
	    	borrows.add(borrow);
	    }

	    @Override
	    public String returnBook(String ISBN, String memberId) throws BorrowException {
	    	boolean flag=false;
	    	for (Borrow borrow : borrows) {
	            if (borrow.getISBN().equals(ISBN) && borrow.getMemberId().equals(memberId)) {
	                borrow.setReturnDate(System.currentTimeMillis());
	                borrows.remove(borrow);
	                flag=true;
	            }
	        }
	    	if(flag) {
	    		return "Successfully return book";
	    	}else {
	    		throw new BorrowException("Not able to find the book");
	    	}
	    }

	    @Override
	    public List<Borrow> getBorrowingsByMember(String memberId) throws BorrowException{
	    	   List<Borrow> memberBorrows = new ArrayList<>();
	           for (Borrow borrow : borrows) {
	               if (borrow.getMemberId().equals(memberId)) {
	                   memberBorrows.add(borrow);
	               }
	           }
	           if(memberBorrows.isEmpty()) {
	        	   throw new BorrowException("Does not borrow the books");
	           }
	           return memberBorrows;
	    }
}
