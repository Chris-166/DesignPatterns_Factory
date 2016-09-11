package com.mycode.test;

import com.mycode.abstractfactory.CarFactory;
import com.mycode.abstractfactory.LuxuryCarFactory;
import com.mycode.abstractfactory.MyEngine;

public class TestAbstractFactory {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		MyEngine e = factory.createEngine();
		e.start();
		e.run();
	}
}
