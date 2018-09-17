package ocajavase8.chp03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list); // [hawk, true]
		list.add(1, "etan");
		System.out.println(list);

		System.out.println("-----------------");
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.remove("cardinal")); // prints false
		System.out.println(birds.remove("hawk")); // prints true
		System.out.println(birds.remove(0)); // prints hawk
		System.out.println(birds); // []

		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		System.out.println(birds2.size()); // 1
		System.out.println(birds2.set(0, "robin")); // [robin], print hawk
		System.out.println(birds2.size()); // 1
		//birds2.set(1, "robin"); // IndexOutOfBoundsException
		
		System.out.println("-------------------");
		List<Persona> personas1 = new ArrayList<>();
		List<Persona> personas2 = new ArrayList<>();
		Persona per = new Persona("01");
		//personas1.add(per);
		//personas2.add(per);
		personas1.add(new Persona("01"));
		personas2.add(new Persona("01"));
		System.out.println(personas1.equals(personas2));
		
		
		System.out.println("-------------------- Sorting");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<Persona> persons = new ArrayList<>();
		persons.add(new Persona("01"));
		persons.add(new Persona("02"));
		persons.add(new Persona("03"));
		//Collections.sort(persons);   // Persona no implementa Comparable
		System.out.println(persons);
	}
	
	
}

class Persona{
	String dni;
	public Persona(String dni) {
		this.dni = dni;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
}
