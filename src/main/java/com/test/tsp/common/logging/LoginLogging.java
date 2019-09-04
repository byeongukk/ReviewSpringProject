package com.test.tsp.common.logging;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.test.tsp.member.model.vo.Member;

@Component
@Aspect
public class LoginLogging {
	private static final Logger logger = LoggerFactory.getLogger(LoginLogging.class);
	
	@Pointcut("execution(* com.test.tsp..*ServiceImpl.*(..))")
	public void loginPointcut() {}
	
	//정상적으로 리턴값이 리턴됐을떄
	@AfterReturning(pointcut="loginPointcut()", returning = "returnObj")
	public void loginLog(JoinPoint jp, Object returnObj) {
		
		if(returnObj instanceof Member) {
			Member m = (Member) returnObj;
			
			logger.info(new Date()+" : $"+m.getmId() +"$님이 접속했습니다.");
		}
		
	}
	
}
