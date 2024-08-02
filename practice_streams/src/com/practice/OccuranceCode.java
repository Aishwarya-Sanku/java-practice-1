package com.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceCode {
	
	public static void main(String[] args) {
		
		
		String name="Aishwarya";
		
		Map<String, Long> occurance=Arrays.stream(name.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		occurance.forEach((alpha,count)->System.out.println(alpha+"       "+count));
	}
}
