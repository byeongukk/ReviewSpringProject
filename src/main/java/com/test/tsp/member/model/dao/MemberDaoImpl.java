package com.test.tsp.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.test.tsp.member.model.exception.LoginException;
import com.test.tsp.member.model.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Override
	public Member loginCheck(SqlSessionTemplate sqlSession, Member m) throws LoginException {
		Member loginUser = sqlSession.selectOne("Member.loginCheck",m);
		
		if(loginUser == null) {
			throw new LoginException("로그인 정보가 존재하지 않습니다");
		}
		
		return loginUser;
	}

}
