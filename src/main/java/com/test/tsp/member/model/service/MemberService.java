package com.test.tsp.member.model.service;

import com.test.tsp.member.model.exception.LoginException;
import com.test.tsp.member.model.vo.Member;

public interface MemberService {

	Member loginMember(Member m) throws LoginException;

}
