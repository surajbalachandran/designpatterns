package com.blogspot.javaclickonline.strategy;

public abstract class Duck {

	private QuackBehaviour quackBehaviour;
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}
	
	public abstract String display();
}
