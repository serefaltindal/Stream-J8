package controller;

import java.util.List;
import java.util.stream.Collectors;

public class StreamController {
	
	public void streamFirstMethod(List<String> myList){
		myList.stream()
	    .filter(s -> s.startsWith("c"))
	    .map(String::toUpperCase)
	    .sorted()
	    .forEach(System.out::println);
	}
	
	public List<Integer> twoEvenSquares(List<Integer> numbers){
		List<Integer> listInteger=numbers.stream().filter(f->{
			System.out.println("filtering f->"+f);
			return f%2==0;
		}).map(m->{
			System.out.println("mapingn->"+m);
			return m*m;
		}).limit(2).collect(Collectors.toList());
		
		return listInteger;
	}

}
