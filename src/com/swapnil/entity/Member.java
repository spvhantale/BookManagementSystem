package com.swapnil.entity;

public class Member {

	private String memberId;
	private String name;
	private boolean isSuspended;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String name, boolean isSuspended) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.isSuspended = isSuspended;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSuspended() {
		return isSuspended;
	}

	public void setSuspended(boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + ", isSuspended=" + isSuspended + "]";
	}
	
	
	
}
