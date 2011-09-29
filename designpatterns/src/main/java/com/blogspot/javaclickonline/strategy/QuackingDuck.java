package com.blogspot.javaclickonline.strategy;

public class QuackingDuck extends Duck {

	public QuackingDuck() {

		setQuackBehaviour(new Quack());
	}
	
	@Override
	public String display() {

		return ("This duck is a quacking duck...");
	}

}
