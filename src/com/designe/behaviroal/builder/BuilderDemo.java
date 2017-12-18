package com.designe.behaviroal.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder lunch = new LunchOrder.Builder();
		lunch.bread("br").meat("meat");
		LunchOrder lunchOrder = lunch.build();
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getMeat());
		System.out.println(lunchOrder.getCondiments());
		
		String str = new String("abc");
		str.intern();
		
		
	}

}
