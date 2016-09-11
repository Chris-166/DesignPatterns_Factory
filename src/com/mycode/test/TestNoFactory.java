package com.mycode.test;

import com.mycode.simplefactory.BMW;
import com.mycode.simplefactory.BYD;
import com.mycode.simplefactory.Car;

/**
 * ��û�й���ģʽ�������
 * ���ڵ����⣺
 * ���ｫTestNoFactory��֮Ϊ�����ߣ���ô������Ҫȥ����BYD��BMW��run������
 * �����Ҫ֪��Car������Ҫ֪��BYD��BMW��
 * @author herdyouth
 *
 */
public class TestNoFactory {
	public static void main(String[] args) {
		Car c1 = new BYD();
		Car c2 = new BMW();
		
		c1.run();
		c2.run();
	}
}
