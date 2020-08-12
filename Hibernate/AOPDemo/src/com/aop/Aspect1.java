package com.aop;

public class Aspect1 {
	public void drawLine(){
		for(int i=0;i<30;i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	public Aspect1(){}
}
