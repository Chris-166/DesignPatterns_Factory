package com.mycode.simplefactory;

/**
 * 简单工厂存在问题：
 * 违反了开闭原则。比如说如果增加了Ford汽车类，那么还得修改CarFactory类的代码
 * @author herdyouth
 *
 */
public class CarFactory2 {
	public static Car createBMW() {
		return new BMW();
	}
	
	public static Car createBYD() {
		return new BYD();
	}
}
