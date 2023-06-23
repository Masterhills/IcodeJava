package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaming {
	public static void main(String[] args) {
		
		List<Person> people = getPeople();
//		You can create a stream reference or create a list reference and collect it to a list
//		Stream<Person> catty = people.stream()
		List<Person> hatty = people.stream()
				.filter(n->n.getGender().equals(Gender.FEMALE))
				.filter(n->n.getAge()<18)
				.collect(Collectors.toList());
//		hatty.forEach(System.out::println);
		hatty.forEach(n->System.out.println(n));
		System.out.println("................");
		Predicate<Person> agecheck = p -> p.getAge() < 18; 
		List<Person> agesort = people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.filter(agecheck)
				.collect(Collectors.toList());
		agesort.forEach(n->System.out.println(n));
		
//		catty.forEach(n->System.out.println(n));
//		people.forEach(n->System.out.println(n));
		
		
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4,5,7,8,9);
//		Stream<Integer> data = nums.stream().map(n->n*2).sorted();
//		CREATING A STREAM TO PRINT OUT 
		int result =  	nums.stream()
//				.map(n->n*2)
				.filter(n->n%2!=0)
//				.sorted()
				.reduce(0,(c,e)->c+e); //
//				.forEach(p->System.out.println(p*5));
		System.out.println(result);
//		Stream<Integer> sortedData = data.sorted();
		
//		data.forEach(n->System.out.println(n));
//		data.forEach(n->System.out.println(n*n));	
//		data.forEach(n->System.out.println(n));
	}
	private static List<Person> getPeople(){
		return List.of(
				new Person("James bond",20,Gender.MALE),
				new Person("Alina Smith", 33, Gender.FEMALE),
				new Person("Helen White", 57, Gender.FEMALE),
				new Person("Alex Boz", 14, Gender.MALE),
				new Person("Jamie Goa", 99, Gender.MALE),
				new Person("Anna Cook", 7, Gender.FEMALE)
				);
	}

}
