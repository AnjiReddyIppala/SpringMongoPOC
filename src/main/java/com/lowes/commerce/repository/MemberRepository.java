package com.lowes.commerce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.lowes.commerce.model.Member;

@Repository
public class MemberRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	 public Member addMember(Member member) {
	        mongoTemplate.save(member);
	        return member;
	    }
	 
	 public Member findByMemberId(int id) {
		 Member member = mongoTemplate.findById(id, Member.class);
	        return member;
	    }
}
