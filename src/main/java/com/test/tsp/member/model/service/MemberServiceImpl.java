package com.test.tsp.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.tsp.member.model.dao.MemberDao;
import com.test.tsp.member.model.exception.LoginException;
import com.test.tsp.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	SqlSessionTemplate sqlSession;
	@Autowired
	private MemberDao md;
	
	@Override
	public Member loginMember(Member m) throws LoginException {
		
		Member loginUser = md.loginCheck(sqlSession, m);
		
		return loginUser;
	}
	
	
	
}
