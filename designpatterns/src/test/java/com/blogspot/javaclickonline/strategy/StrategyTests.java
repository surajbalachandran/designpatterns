package com.blogspot.javaclickonline.strategy;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import com.blogspot.javaclickonline.strategy.Duck;
import com.blogspot.javaclickonline.strategy.QuackingDuck;


public class StrategyTests {

	@Test
	public void testQuackingBehaviour() {
		
		Duck duck = new QuackingDuck();
		assertThat(duck.getQuackBehaviour().quack(), is("Quack..."));
	}
	
	@Test
	public void testNoQuackingBehaviour() {
		
		Duck duck = new NoQuackingDuck();
		assertThat(duck.getQuackBehaviour().quack(), is("No Quack..."));
	}
}
