package com.mycode.test;

import com.mycode.factorymethod.BMWFactory;
import com.mycode.factorymethod.BYDFactory;
import com.mycode.factorymethod.Car;

/**
 * ��������
 * ���simpleFactory���ڵĲ�����OCPԭ��
 * ���������Ҫ��չһ��Ford�����࣬��ôֻ��Ҫ����һ��Ford���һ��FordFactory��
 * ������Ҫȥ����������
 * 
 * ���ڵ����⣺�����simpleFactory��˵�����˸������
 * ��ʵʹ��simpleFactoryҲ�ǿ�������������ģ�����˵��CarFactory2�м������ӷ���
 * ֻ���������ͻ���Ϊ����һ���໹ȥ�ı�������һ���ࡣ
 * ���ַ�ʽ�Ĳ�ȡ����������ɣ���Ŀ�����п���simpleFactory���ࡣ
 * @author herdyouth
 *
 */
public class TestFactoryMethod {
	public static void main(String[] args) {
		Car c1 = new BYDFactory().ceateCar();
		Car c2 = new BMWFactory().ceateCar();
		
		c1.run();
		c2.run();
	}

}
