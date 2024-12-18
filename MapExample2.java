package Pratice1;

import java.util.Arrays;
import java.util.List;

public class MapExample2 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(20,30,40,50,60,70,100);
		//Subtracting elements to -50 and printing the positive number
		System.out.println(nums.stream().map(s->s-50).filter(p->p>0).toList());
		//Subtracting elements to -50 and printing the negative number
		System.out.println(nums.stream().map(s->s-50).filter(n->n<0).toList());
	}

}
