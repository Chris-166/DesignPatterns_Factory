package com.mycode.simplefactory;

/**
 * 简单工厂存在问题：
 * 违反了开闭原则。比如说如果增加了Ford汽车类，那么还得修改CarFactory类的代码
 * (这里即继续做if-else的判断处理)
 * @author herdyouth
 *
 */
public class CarFactory {
	public static Car createCar(String carBrand) {
		if ("BYD".equals(carBrand)) {
			return new BYD();
		} else if ("BMW".equals(carBrand)) {
			return new BMW();
		} else {
			return null;
		}
	}
}
