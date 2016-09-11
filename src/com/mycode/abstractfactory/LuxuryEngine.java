package com.mycode.abstractfactory;

public class LuxuryEngine implements MyEngine {

	@Override
	public void run() {
		System.out.println("高端发动机运作快!");
	}

	@Override
	public void start() {
		System.out.println("高端发动机启动快!");
	}

}
