package com;

public interface Interface {
	String operator();
	int amount();
	int validity();
	String addbenfits();
	default void disp() {
		System.out.println("Choose your Operator");
	}
	
	

}
