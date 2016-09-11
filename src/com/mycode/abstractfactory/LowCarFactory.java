package com.mycode.abstractfactory;

public class LowCarFactory implements CarFactory {

	@Override
	public MyEngine createEngine() {
		return new LowEngine();
	}

	@Override
	public MySeat createSeat() {
		return new LowSeat();
	}

	@Override
	public MyTyre createTyre() {
		return new LowTyre();
	}

}
