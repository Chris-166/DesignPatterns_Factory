package com.mycode.abstractfactory;

public interface CarFactory {
	public MyEngine createEngine();
	public MySeat createSeat();
	public MyTyre createTyre();
}
