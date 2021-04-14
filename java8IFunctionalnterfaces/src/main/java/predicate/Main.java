package predicate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person(1,"Jhon",17,LocalDate.of(2004, 1 , 13));
		Person person2 = new Person(2,"Mike",25,LocalDate.of(1996, 3 , 21));
		List<Person> personsList = Arrays.asList(person1,person2);
	    
		//1 Query directly.
		System.out.println("-- Adults --");  
		 personsList
          .stream()
          .filter((p) -> p.getAge() >= 18)
          .forEach(System.out::println);
		 
		 //2 Querys directly.
		 System.out.println("-- Adults who have 'k' in their name  --");  
		 personsList
          .stream()
          .filter((p) -> p.getAge() >= 18 && p.getName().contains("k"))
          .forEach(System.out::println);
		 
		 //2 querys with Predicate function.
		 Predicate<Person> age = (p) -> p.getAge() >= 18;
		 Predicate<Person> name = (p) -> p.getName().contains("k");
		 Predicate<Person> query = age.or(name);
		 //Predicate<Person> query = age.and(name);
		 System.out.println("-- Adults who have 'k' in their name --");  
		 personsList
          .stream()
          .filter(query)
          .forEach(System.out::println);
		 
	}

}
