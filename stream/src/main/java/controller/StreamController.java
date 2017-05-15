package controller;

import java.util.ArrayList;

public class StreamController {
	
	public void streamFirstMethod(ArrayList<String> myList){
		myList.stream()
	    .filter(s -> s.startsWith("c"))
	    .map(String::toUpperCase)
	    .sorted()
	    .forEach(System.out::println);
	}

}
