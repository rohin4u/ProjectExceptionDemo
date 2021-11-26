package com.spiderscrawl;

public class ExcepDemo {
	
	public void m1() throws Exception{
		m2();
		
	}
	public void m2() throws Exception{
		
		System.out.println(100/0);
		
	}
	public static void main(String[] args)throws Exception {
		ExcepDemo demo = new ExcepDemo();
		demo.m1();	
		
	}

}
