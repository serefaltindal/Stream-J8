package stream;

import java.util.ArrayList;

import controller.StreamController;



public class Run {

	public static void main(String[] args) {
	
		ArrayList<String> myList=new ArrayList<String>();
		myList=Run.initialize(myList);
	    
		StreamController sc=new StreamController();
		sc.streamFirstMethod(myList);
	}
	
	
	public static ArrayList<String> initialize(ArrayList<String> list){
		if(list!=null){
		list.add("a1");
		list.add("a2");
		list.add("b1");
		list.add("b2");
		list.add("c1");
		}
		return list;
	}

}
