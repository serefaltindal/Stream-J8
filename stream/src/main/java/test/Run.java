package test;

import java.math.BigDecimal;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

import controller.StreamController;
import model.Staff;

public class Run {

	public static void main(String[] args) {
		StreamController sc = new StreamController();

		// First method trying
		List<String> characters = Arrays.asList("a1", "a2", "a3", "4a1", "b4", "b2", "c1", "d1");
		sc.streamFirstMethod(characters);

		// Second method trying
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		numbers = sc.twoEvenSquares(numbers);
		numbers.forEach(number -> {
			System.out.println(number);
		});

		// Third method with Staff Object(1)
		List<Staff> staff = Arrays.asList(new Staff("seref", 24, new BigDecimal(10000)),
										  new Staff("cancu", 25, new BigDecimal(20000)), 
										  new Staff("ceren", 30, new BigDecimal(30000)));
		
		List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(collect);

	}

}
