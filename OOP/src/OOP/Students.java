package OOP;

public class Students {
	int id;
	String name;
	int age;
	String address;
	double gpa;
	
	//Get,Set
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	// Contrustor
	public Students() {
	}
	public Students(String name, int age, String address, double gpa) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	
	//To string
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gpa=" + gpa + "]";
	}
}
