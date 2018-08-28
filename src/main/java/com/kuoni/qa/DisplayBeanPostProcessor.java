package com.kuoni.qa;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object bean, String name){
		
		System.out.println("AfterIniti: " + name);
		return bean;
		
	}
	public Object postProcessBeforeInitialization(Object bean, String name){
		System.out.println("BeforeIniti: " + name);
		return bean;
	}

}
