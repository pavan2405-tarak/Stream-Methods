package Pratice1;
import java.util.Arrays;
import java.util.List;

public class FilterExample {
	public static void main(String[] args) { 
		List<Integer> list=Arrays.asList(50,30,40,20,21);	
		//System.out.println(list.stream().filter(i->i % 2==0).toList());
		//System.out.println(list.stream().filter(i->i % 2!=0).toList());
		System.out.println(FilterExample.getEvenList(list));
		System.out.println(FilterExample.getOddList(list));
		
	}
	public static List<Integer> getEvenList(List<Integer> input){
		return input.stream().filter(i->i % 2==0).toList();
		
	}
	public static List<Integer> getOddList(List<Integer> input){
		return input.stream().filter(i->i % 2!=0).toList();
		
	}

}
