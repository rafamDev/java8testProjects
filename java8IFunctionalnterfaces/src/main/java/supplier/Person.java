package supplier;

import java.time.LocalDate;

public class Person {


	private int id; 
	
	private String name;
   
	private int age;
	
	private LocalDate dateOfBirth;

	private static String city;
	
	//With supplier we don´t need to use any constructor. 
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

    public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		Person.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
}
