package Pratice1;

import java.util.Arrays;
import java.util.List;

public class StudentStream {
	public static void main(String[] args) {
		List<Student> stu=Arrays.asList(new Student(101, "Pavan", "MCA", "Aurora",22),
				new Student(102, "Srinivas", "BSc", "Aditya", 22),
				new Student(103,"Rohit", "Bcom", "VDC", 23),
				new Student(104, "Swaroop", "Btech", "GIET", 23));
		   	//Fetching the details of Students who are from BSc
		    List<Student> BScStudents =stu.stream().filter(s->s.getBranch().equals("BSc")).toList();
		    //Fetching the details of Students who's name Start with Letter P
		    List<Student> pnameStudents=stu.stream().filter(s->s.getName().startsWith("P")).toList();
		    //Fetching the details of Students who are Studying in Aditya College
		    List<Student> AdityaStudents=stu.stream().filter(s->s.getCollege().equals("Aditya")).toList();
		    //Fetching the details of Students who's age is less than 25 
		    List<Student> agebelow25Students=stu.stream().filter(s->s.getAge()<25).toList();
		    //Fetching the Details of Students who's age is 22
		    List<Student> age22Students=stu.stream().filter(s->s.getAge()==22).toList();		    
		    System.out.println("BSc :"+BScStudents);
		    System.out.println(pnameStudents);
		    System.out.println(AdityaStudents);
		    System.out.println(agebelow25Students);
		    System.out.println(age22Students);
		    
	} 
}    


