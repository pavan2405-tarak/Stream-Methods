package Pratice1;

import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Stream<String> City=Stream.of("Hyderabad","Bomday","Benguluru","Bihar","Pune","Kerala","Chennai","Goa",
				"Lucknow","Delhi","Rajasthan");
		//Length
		System.out.println(City.filter(c->c.length()>5 & c.length()<10).toList());
		//Starts with Letter B
		Stream<String> Cit=Stream.of("Hyderabad","Bomday","Benguluru","Bihar","Pune","Kerala","Chennai","Goa",
				"Lucknow","Delhi","Rajasthan");
		System.out.println(Cit.filter(b->b.startsWith("B")).toList());
		//Ends With Letter e
		Stream<String> Cities=Stream.of("Hyderabad","Bomday","Benguluru","Bihar","Pune","Kerala","Chennai","Goa",
				"Lucknow","Delhi","Rajasthan");
		System.out.println(Cities.filter(e->e.endsWith("e")).toList());	
	}


}
