package com.mycode.factorymethod;

public class BYDFactory implements CarFactory {

	@Override
	public Car ceateCar() {
		return new BYD();
	}

}
