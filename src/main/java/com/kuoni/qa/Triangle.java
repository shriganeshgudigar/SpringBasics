package com.kuoni.qa;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{
	
	private String type;
	private int height;	
	private List<Point> points;
	private ApplicationContext context = null;
	
	
	public List getPoints() {
		return points;
	}
	


	public void setPoints(List points) {
		this.points = points;
	}
		

	public Triangle(){
		
	}
	public Triangle(int height){
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public void setApplicationContext(ApplicationContext context){
		this.context =  context;
		Point point = (Point)context.getBean("point0");
		System.out.println("X: " + point.getX());
		System.out.println("Y: " + point.getY());
	}
	
	public void setBeanName(String name){
		System.out.println("Bean Name: " + name);
	}
	
	public void draw(){
		System.out.println(getType() + " is drawn of height " + height);
		for(Point point: points){
			System.out.println("Point: " + point.getX() + " " + point.getY());
		}
	}

}
