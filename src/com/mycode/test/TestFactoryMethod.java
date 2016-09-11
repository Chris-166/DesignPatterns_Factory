package com.mycode.test;

import com.mycode.factorymethod.BMWFactory;
import com.mycode.factorymethod.BYDFactory;
import com.mycode.factorymethod.Car;

/**
 * 工厂方法
 * 针对simpleFactory存在的不满足OCP原则
 * 这里如果需要扩展一个Ford汽车类，那么只需要创建一个Ford类和一个FordFactory类
 * 而不需要去动其他的类
 * 
 * 存在的问题：相对于simpleFactory来说增加了更多的类
 * 其实使用simpleFactory也是可以做到增加类的，比如说在CarFactory2中继续增加方法
 * 只是这样做就会因为增加一个类还去改变了另外一个类。
 * 两种方式的采取依具体而定吧，项目开发中可能simpleFactory更多。
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
