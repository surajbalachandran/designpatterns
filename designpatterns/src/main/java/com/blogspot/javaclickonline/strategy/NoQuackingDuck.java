package com.blogspot.javaclickonline.strategy;

public class NoQuackingDuck extends Duck {

	public NoQuackingDuck() {

		setQuackBehaviour(new NoQuack());
	}
	
	@Override
	public String display() {

		return ("This duck is a no quacking duck...");
	}

}
