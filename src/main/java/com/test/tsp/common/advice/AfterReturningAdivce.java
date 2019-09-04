package com.test.tsp.common.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.test.tsp.member.model.vo.Member;

@Component
@Aspect
public class AfterReturningAdivce {
	@Pointcut("execution(* com.test.tsp..*ServiceImpl.*(..))")
	public void allPointcut() {}
	
	@AfterReturning(pointcut="allPointcut()", returning="returnObj")
	public void afterLog(JoinPoint jp,Object returnObj) {
		//비즈니스 메소드가 리턴한 결과 데이터를 다른 용도로 처리할 때 사용
		String methodName = jp.getSignature().getName();
		System.out.println("**************************************************");
		System.out.println("[메소드 리턴 ] : " + methodName + "() 메소드 리턴 값 : " + returnObj.toString());
		System.out.println("**************************************************");
	}
}
















