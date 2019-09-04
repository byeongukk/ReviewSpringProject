package com.test.tsp;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Run {
	@Autowired DefaultListableBeanFactory df;
	
	
	@Test
	public void beans() {
		for(String name : df.getBeanDefinitionNames()) {
			System.out.println(name+" \t" + df.getBean(name).getClass().getName());
		}
	}
	
}
