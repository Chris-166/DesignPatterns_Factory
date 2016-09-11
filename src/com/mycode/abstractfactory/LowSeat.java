package com.mycode.abstractfactory;

public class LowSeat implements MySeat {

	@Override
	public void massage() {
		System.out.println("低端座椅只能安静地被坐!");
	}

}
