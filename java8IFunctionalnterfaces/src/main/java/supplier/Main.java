package supplier;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		//This interface is used to create objects without a constructor.
		//Use setters to define the attributes but it is not necessary create a constructor.
		
		Supplier<Person> supplier = Person::new; 
        Person person = supplier.get();
        person.setName("Rafa");
        System.out.println(person.getName());
        
        Supplier<String> supplier2 = Person::getCity; 
        Person.setCity("Madrid");
        String city = supplier2.get();
        System.out.println(city);
        
        //With lambda expression.
        Supplier<Person> supplier3 = () -> {return new Person();};
        Person person2 = supplier3.get();
        person2.setAge(45);
        System.out.println(person2.getAge());
    
	}

}
