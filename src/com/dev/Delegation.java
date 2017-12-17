package com.dev;

import java.net.URL;
import java.net.URLClassLoader;

public class Delegation {
	public static void main(String [] args) {
		URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
		
		do {
			System.out.println(classLoader);
			
			for(URL url : classLoader.getURLs()) {
				System.out.println(url.getPath());
			}
		} while((classLoader = (URLClassLoader) classLoader.getParent()) != null);
	}
}