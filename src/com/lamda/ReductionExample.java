package com.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,10,10);
		
		Optional<Integer> red =
//				list.stream().reduce(0, Integer::sum);
//				list.stream().reduce(0, (a,b) -> a+b);
				list.stream().reduce( Integer::max);
		
		System.out.println(red.get());
	}

}
