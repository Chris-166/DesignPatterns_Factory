package com.mycode.abstractfactory;

public class LuxurySeat implements MySeat {

	@Override
	public void massage() {
		System.out.println("高端座椅可以自动按摩!");
	}

}
