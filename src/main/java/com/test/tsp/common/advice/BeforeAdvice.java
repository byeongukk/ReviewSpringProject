package com.test.tsp.common.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect		//AOP적용 adivce 객체의 경우 필요한 어노테이션
public class BeforeAdvice {
	//포인트컷 표현식을 이용해 포인트컷 설정을 한다.
	//메소드 이름이 포인트컷이 된다.
	/*
	 * @Pointcut("execution(* com.test.tsp..*ServiceImpl.*(..))") public void
	 * allPointcut() {}
	 * 
	 * //weaving 시점에 따른 어노테이션으로, 사용하려는 포인트컷 이름을 지정한다. //메소드가 실행되기 전에 공통으로 처리할 내용을 작성
	 * 
	 * @Before("allPointcut()") public void beforeLog(JoinPoint jp) {
	 * System.out.println("*******Service 로직 호출*********"); //JoinPoint를 파라미터로 전달 받을
	 * 시 반드시 첫 번째 파라미터로 저달 받아야 한다. //호출되는 대상 객체(Target Object) 메소드, 전달 파라미터 목록에 접근할
	 * 수 있는 메소드를 제공 String methodName = jp.getSignature().getName(); Object[] args =
	 * jp.getArgs();
	 * 
	 * System.out.println("[메소드 호출 전 확인 ] : " + methodName + "() 메소드 매개변수 갯수 : " +
	 * args.length);
	 * 
	 * int argsLength = args.length;
	 * 
	 * for(int i=0; i < argsLength; i++) { System.out.println(i + "번째 매개변수 정보 : " +
	 * args[i].toString()); } }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
