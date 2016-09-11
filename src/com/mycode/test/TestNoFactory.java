package com.mycode.test;

import com.mycode.simplefactory.BMW;
import com.mycode.simplefactory.BYD;
import com.mycode.simplefactory.Car;

/**
 * 在没有工厂模式的情况下
 * 存在的问题：
 * 这里将TestNoFactory称之为调用者，那么这里想要去调用BYD和BMW的run方法，
 * 则既需要知道Car，还需要知道BYD和BMW类
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
