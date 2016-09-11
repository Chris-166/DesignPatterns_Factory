package com.mycode.factorymethod;

public class BMWFactory implements CarFactory {

	@Override
	public Car ceateCar() {
		return new BMW();
	}

}
