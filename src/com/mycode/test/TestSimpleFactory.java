package com.mycode.test;

import com.mycode.simplefactory.Car;
import com.mycode.simplefactory.CarFactory;

/**
 * 简单工厂情况下(优化Test1)：TestSimpleFactory只需要Car和CarFactory
 * 存在的问题：见CarFactory类说明
 * @author herdyouth
 *
 */
public class TestSimpleFactory {
	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("BYD");
		Car c2 = CarFactory.createCar("BMW");
		
		c1.run();
		c2.run();
	}
}
