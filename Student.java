package Pratice1;

public class Student {
	private int id;
	private String name;
	private String Branch;
	private String college;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Branch=" + Branch + ", college=" + college + ", age=" + age
				+ "]";
	}
	public Student(int id, String name, String branch, String college, int age) {
		super();
		this.id = id;
		this.name = name;
		Branch = branch;
		this.college = college;
		this.age = age;
	}

}
