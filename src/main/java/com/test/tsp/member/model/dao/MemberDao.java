package com.test.tsp.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.test.tsp.member.model.exception.LoginException;
import com.test.tsp.member.model.vo.Member;

public interface MemberDao {

	Member loginCheck(SqlSessionTemplate sqlSession, Member m) throws LoginException;

}
