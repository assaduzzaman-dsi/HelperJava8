package com.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String [] args) {
		approachTwo();
	}
	
	
	public static void approachOne() {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(2,5,6,7,10);
		List<Integer> list3 = Arrays.asList(8,9,11,23);
		
		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		
		System.out.println(list);
		
		list.stream()
		.map(l -> l.size())
		.forEach(System.out::println);
	}
	public static void approachTwo() {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(2,5,6,7,10);
		List<Integer> list3 = Arrays.asList(8,9,11,23);
		
		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		
		System.out.println(list);
		
		Function<List<?>, Integer>  size = List::size;
		Function<List<Integer>, Stream<Integer>> flatmapper = 
				l -> l.stream();
		
		
		list.stream()
		.flatMap(flatmapper)
		.forEach(System.out::println);
	}
}
