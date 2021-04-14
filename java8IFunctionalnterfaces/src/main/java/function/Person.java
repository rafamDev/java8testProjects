package function;

import java.time.LocalDate;

public class Person {

	private int id; 
	
	private String name;
   
	private int age;
	
	private LocalDate dateOfBirth;

	public Person(int id, String name, int age, LocalDate localDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfBirth = localDate;
	}

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

    @Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
}
