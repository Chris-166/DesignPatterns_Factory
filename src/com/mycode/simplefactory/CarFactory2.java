package com.mycode.simplefactory;

/**
 * �򵥹����������⣺
 * Υ���˿���ԭ�򡣱���˵���������Ford�����࣬��ô�����޸�CarFactory��Ĵ���
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
