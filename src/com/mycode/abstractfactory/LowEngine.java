package com.mycode.abstractfactory;

public class LowEngine implements MyEngine {

	@Override
	public void run() {
		System.out.println("低端发动机运作慢!");
	}

	@Override
	public void start() {
		System.out.println("低端发动机启动慢!");
	}

}
