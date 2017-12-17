package com.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {
	public static void main(String [] args) {
		List<String> strings = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11");
		
		List<String> result = new ArrayList<String>();
		
		Consumer<String> c1 = (s) -> System.out.println(s);
		//Consumer<String> c2 = System.out::println;
		//Consumer<String> c3 = s -> result.add(s);
		Consumer<String> c4 = result::add;
		
		strings.forEach(c1.andThen(c4));
		
		System.out.println("size of the result = " + result.size());
		
	}
}
