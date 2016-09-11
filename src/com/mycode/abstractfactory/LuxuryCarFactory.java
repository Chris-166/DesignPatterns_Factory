package com.mycode.abstractfactory;

public class LuxuryCarFactory implements CarFactory {

	@Override
	public MyEngine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public MySeat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public MyTyre createTyre() {
		return new LuxuryTyre();
	}

}
