package com.swapnil.service;

import java.util.HashMap;
import java.util.Map;

import com.swapnil.entity.Member;
import com.swapnil.exception.MemberException;
import com.swapnil.repo.MemberRepo;

public class MemberService implements MemberRepo{

	private Map<String, Member> members = new HashMap<>();

    @Override
    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    @Override
    public void updateMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    @Override
    public String suspendMember(String memberId) throws MemberException {
    	Member member=members.get(memberId);
    	if(member==null) {
    		throw new MemberException("Member is not available");
    	}else {
    		  members.get(memberId).setSuspended(true);
    		  return "Successfully suspend the account";
    	}
    	
      
    }

    @Override
    public Member getMemberById(String memberId) throws MemberException {
    	Member member=members.get(memberId);
    	if(member==null) {
    		throw new MemberException("Member is not available");
    	}else {
    		  members.get(memberId).setSuspended(true);
    		  return members.get(memberId);
    	}
        
    }

}
