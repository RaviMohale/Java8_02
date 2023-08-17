package com.ravi.stream3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEvenNo {
	public static void main(String[] args) {
		
		/*
		 * // 1. given a list of integers , find out all the even number exist in the
		 *   //list using Stream functions? 
		 *   List<Integer> myList =
		 * Arrays.asList(10,15,8,49,25,98,32);
		 * 
		 * System.out.println("even number...");
		 * 
		 * myList.stream().filter(e -> e%2 == 0).forEach(System.out::println);
		 * 
		 * System.out.println("odd number..."); myList.stream().filter(e -> e%2 !=
		 * 0).forEach(System.out::println);
		 */
		
		/*
		 * //2 .  given a list of integers, find out all the numbers starting with 1 using
		 *   //stream function 
		 * System.out.println("number starts with 1");
		 * 
		 * myList.stream() .map( s -> s + "")//converting integer to string .filter(s->
		 * s.startsWith("1")) .forEach(System.out:: println);
		 */
		
		/*
		 * // 3 . how to find duplicate elements in a given integers list in java using
		 *   //Stream function
		 * 
		 * List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,25,98,91,10,14,15);
		 * 
		 * Set<Integer> set = new HashSet<>(); System.out.println("find duplicate....");
		 * list.stream().filter(n -> !set.add(n)).forEach(System.out ::println);
		 */
		
		
		/*
		 * // 4.given the list of integers, find the first element of the list using
		 * //stream functions? List<Integer> list =
		 * Arrays.asList(10,15,8,49,25,98,32,25,98,91,10,14,15);
		 * System.out.println("find the first element");
		 * list.stream().findFirst().ifPresent(System.out ::println);
		 * 
		 * 
		 * //list.stream().findAny().ifPresent(System.out ::println);
		 */
		
		
		  
		/*
		 * //5. Given a list of integers,find the total number of elements present in
		 * the list using stream function?
		 * 
		 * List<Integer> list2 = Arrays.asList(10,15,8,49,25,98,32,25,98,91,10,14,15);
		 * System.out.println("count total  number of element present in the list");
		 * long count = list2.stream().count();
		 * 
		 * System.out.println(count);
		 */
		 
		/*
		 * // 6. given a list of integer ,find the maximum values elements present in it
		 * //using stream functions ?
		 * 
		 * List<Integer> list2 = Arrays.asList(10,15,8,49,25,98,32,25,98,91,10,14,15);
		 * 
		 * System.out.println(" max value elements present");
		 * 
		 * Integer maxVal = list2.stream().max(Integer:: compareTo).get();
		 * 
		 * System.out.println(maxVal);
		 */
		/*
		 * // 7. given a String , find the first non- repeated character in it using
		 *  //Stream functions?
		 * 
		 * 
		 * System.out.println("find the first non- repeated character...."); String
		 * input = "Java  Hungry Alive is Awesome" ;
		 * 
		 * 
		 * Character result = input.chars() // Stream of string .mapToObj(s ->
		 * Character.toLowerCase(Character.valueOf((char)s))) //First Convert to
		 *    //Character object and then to lowercase
		 * .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
		 * Collectors.counting()))// store the chars in map with count
		 *  .entrySet()
		 * .stream() .filter(entry -> entry.getValue()==1L) .map(entry ->
		 * entry.getKey()) .findFirst() .get();
		 * 
		 * System.out.println(result);
		 * 
		 */
		  
		// 8. Given string, find the first repeated character in it using stream functions
			 
			System.out.println("find the first non- repeated character....");
			 String input = "Java  Hungry Alive is Awesome" ;
			  
			  
			  Character result = input.chars()  // Stream of string
			      .mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))  //First Convert to Character object and then to lowercase
					.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
							Collectors.counting()))// store the chars in map with count
							.entrySet()
							.stream()
							.filter(entry -> entry.getValue() >1L)
							.map(entry -> entry.getKey())
							.findFirst()
							.get();
			  
			  System.out.println(result);
			  
		  
	// 9. Given a list of integers, sort all the values present in it using Stream functions ?
			  
			  
			  List<Integer> list3 = Arrays.asList(10,15,8,49,25,98,32,25,98,91,10,14,15,2 ,5,1);
		  
		  System.out.println("sort in ascending order");
		  
		  list3.stream().sorted().forEach(System.out::println);
		  
		  System.out.println("== sort the array with non repeated value..==");
		  list3.stream().sorted().distinct().forEach(System.out::println);
		  
		  
		  
	// 10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
		  
		  List<Integer> list4 = Arrays.asList(10,15,8,49,25,98,32,25,98,91,10,14,15,2 ,5,1);
		  
		  System.out.println("sort in reverse order");
		  list4.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		  
		  System.out.println("sort in reverse order with non repeated");
		  list4.stream().sorted(Collections.reverseOrder()).distinct().forEach(System.out::println);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
	}
}
