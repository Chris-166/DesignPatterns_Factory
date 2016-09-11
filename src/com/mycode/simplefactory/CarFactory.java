package com.mycode.simplefactory;

/**
 * �򵥹����������⣺
 * Υ���˿���ԭ�򡣱���˵���������Ford�����࣬��ô�����޸�CarFactory��Ĵ���
 * (���Ｔ������if-else���жϴ���)
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
