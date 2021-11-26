package com.spiderscrawl;

public class ExceptionDemo1 {
	
	
	
	public void m1() {
		
		Student student = new Student();
		try {
			
			try {
				
			}
			catch(Exception e) {
				
			}
		}catch(Exception e) {
			try {
				
			}catch(Exception e1) {
				
			}
			
		}finally {
			try {
				
			}catch(Exception e) {
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		ExceptionDemo1 demo = new ExceptionDemo1();
		demo.m1();
	}
	

}
