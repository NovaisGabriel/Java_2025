package arrayslists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for (int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		
		// for each loop:
		
		for (String obj : vect) {
			System.out.println(obj);
		} 
		
		// lists
		
		List<String> list = new ArrayList<String>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		list.add(2, "Marco");
		
		list.remove("Anna");
		list.remove(1);
		
		list.removeIf(y -> y.charAt(0) == "M".charAt(0));
		
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		List<String> result = list
				.stream()
				.filter(x -> x.charAt(0) == "A".charAt(0))
				.collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}
		
		String name = list
				.stream()
				.filter(x -> x.charAt(0) == "A".charAt(0))
				.findFirst()
				.orElse(null);
		
		System.out.println(name);
		
	}

}
