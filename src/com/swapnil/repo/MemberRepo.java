package com.swapnil.repo;

import com.swapnil.entity.Member;
import com.swapnil.exception.MemberException;

public interface MemberRepo {

	public void registerMember(Member member);
	public void updateMember(Member member);
	public String suspendMember(String memberId) throws MemberException;
	public Member getMemberById(String memberId) throws MemberException;
}
