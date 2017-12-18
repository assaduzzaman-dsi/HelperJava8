package com.designe.behaviroal.singletone;

public class Singletone {
	private static Singletone singletone;
	
	private Singletone() {
		
	}
	
	static Singletone newInstance() {
		if(null == singletone) {
			synchronized (Singletone.class) {
				if(null == singletone) {
					singletone = new Singletone();
				}
			}
		}
		
		return singletone;
	}
}
