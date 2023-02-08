package com.practice.springboot.web.springFirst;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP01BehaviouralPrgm {

	
	public static void main(String[] args) {
		List<Integer> inputNumbers= List.of(6,11,2,8,13,9,3,21,4,2,12);
		List<Integer> squaredNums =mapAndPrintList(inputNumbers, x->x*x);
		List<Integer> cubedNums =mapAndPrintList(inputNumbers, x->x*x*x);
		System.out.println(squaredNums);
		System.out.println(cubedNums);
	
	}

	
	private static List<Integer> mapAndPrintList(List<Integer> inputNumbers,
			Function<? super Integer, ? extends Integer> mappingNumbers) {
		return inputNumbers.stream().map(mappingNumbers).collect(Collectors.toList());
	}

	private static void printSumOfNumbers(List<Integer> of) {
		filterAndPrintNumbers(of,x->x%2==0);
		//Behavioral Programming where behavior or a logic is passed in as a argument
		filterAndPrintNumbers(of,x->x%2!=0);
		
		
	}

	private static void filterAndPrintNumbers(List<Integer> of, Predicate<? super Integer> predicate) {
		of.stream().
		filter(predicate).
		forEach(System.out::println);
	}
	
	

	

}
