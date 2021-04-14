package function;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import predicate.Person;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person(1,"Jhon",17,LocalDate.of(2004, 1 , 13));
		Person person2 = new Person(2,"Mike",25,LocalDate.of(1996, 3 , 21));
		List<Person> personsList = Arrays.asList(person1,person2);
	    
		//Mapping objects (object A to object B). In 2 ways.
		
		/*1 way. With Lambda.  
		personsList
         .stream()
         .map((p) -> p.getName())
         .forEach(System.out::println);*/
	    
		//2 way. With Function interface.
	    Function<Person,String> nameFunction = (Person p) -> {return p.getName();};
	    List<String> namesList = convertPersonsToNames(personsList,nameFunction);
        for (String name : namesList) {
		  System.out.println(name);
		}
	}

	private static List<String> convertPersonsToNames(List<Person> personsList, Function<Person, String> nameFunction) {
		List<String> result = new ArrayList<String>();
		for (Person p : personsList) {
			result.add(nameFunction.apply(p));
		}
		
		return result;
	}

}
