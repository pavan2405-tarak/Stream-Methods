package Pratice1;

import java.util.Arrays;
import java.util.List;

public class MapExamples {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("pavan","kirito","tarak","jagadeesh","varma","santosh",
				"swaroop");
		//Converting into IUpperCase
		System.out.println(list.stream().map(s->s.toUpperCase()).toList());
		//Fetching the details who's name starts with p
		System.out.println(list.stream().map(s->s.toUpperCase()).filter(s->s.startsWith("P")).toList());
		//Concating Hello to the name who's name is starts with P
		System.out.println(list.stream().map(s->s.toUpperCase()).filter(s->s.startsWith("P"))
				.map(s->"Hello"+s).toList());
	}

}
