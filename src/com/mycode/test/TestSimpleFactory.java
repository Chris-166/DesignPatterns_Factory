package com.mycode.test;

import com.mycode.simplefactory.Car;
import com.mycode.simplefactory.CarFactory;

/**
 * �򵥹��������(�Ż�Test1)��TestSimpleFactoryֻ��ҪCar��CarFactory
 * ���ڵ����⣺��CarFactory��˵��
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
