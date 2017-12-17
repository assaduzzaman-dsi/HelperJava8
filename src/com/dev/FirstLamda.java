package com.dev;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstLamda {
	public static void main(String [] args) {
		pilar();
	}
	
	
	public static void filterExampe() {
		FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};
		
		FileFilter filterLamda = (File pathname) -> pathname.getName().endsWith(".java");
		
		File dir = new File("/Volumes/Other/RandD/java/java8Rx/codelong");
		
		File [] files = dir.listFiles(filterLamda);
		
		for(File f : files){
			System.out.println(f);
		}
	}
	
	public static void runnableExample() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for(int index = 0; index < 5; index ++) {
					System.out.println(
							"Hello world from thread ["
							+ Thread.currentThread().getName() 
							+"]" 
							);
				}
				
			}
		};
		
		Runnable runnableLamd = () -> {
			for(int index = 0; index < 5; index ++) {
				System.out.println(
						"Hello world from thread ["
						+ Thread.currentThread().getName() 
						+"]" 
						);
			}
		};
		
		Thread t = new Thread(runnableLamd);
		t.start();
	}
	
	public static void pilar() {
		List<String> list = new ArrayList<String>();
				
		for(int index = 1; index <= 10; index ++) {
			StringBuilder sb = new StringBuilder();
			for(int subIndex = 1; subIndex <= index; subIndex ++) {
				sb.append("*");
			}
			list.add(sb.toString());
		}
		
		
		Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		Comparator<String> compLamda = (String o1, String o2) 
				-> Integer.compare(o1.length(), o2.length()); 
		
		//Collections.sort(list, comp);
		
		Collections.sort(list, compLamda);
		
		list.forEach(s -> System.out.println(s));
		System.out.println("--------"+ compLamda.hashCode()+ " oldd:" + comp.hashCode());
		System.out.println("--------"+ compLamda.getClass() + " oldd c:" + comp.getClass());
		list.forEach(System.out::println);
		
		
	}
	
	
	
}
