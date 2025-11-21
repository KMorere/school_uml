package schooluml;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestPerson {

	public TestPerson() {
		
	}

	public static void main(String[] args) {
		School school = new School();
		City city = new City("Toulouse", "France", "31000");
		Address address = new Address(city, "rue des tilleuls", "2", "");
		Admin admin = new Admin("Wilson", "Framboisier", 50, address, school);		
		LocalDate arrivalDate = LocalDate.of(2025, 9, 22);
		address = new Address(city, "rue des platanes", "20", "bâtiment C");
		Teacher mor = new Teacher("Mor", "Diop", 40, address, arrivalDate);
		address = new Address(city, "rue des pâtissiers", "20", "");
		Teacher martial = new Teacher("Bret", "Martial", 50, address, arrivalDate);
		
		Student daphne = new Student("Daphné", "Cluseau", address, 37);
		Student killian = new Student("Killian", "Morere", address, 25);
		Student toky = new Student("Toky", "Sigogneau", address, 28);
		Student matthieu = new Student("Matthieu", "Couderc", address, 39);
		Student antony = new Student("Antony", "Vitry", address, 35);
		Student jean = new Student("Jean", "Dioubiate", address, 30);
		
		ArrayList<Teacher> teachers = new ArrayList<Teacher> ();
		ArrayList<Student> students = new ArrayList<Student> ();
		
		teachers.add(mor);
		teachers.add(martial);
		
		students.add(daphne);
		students.add(killian);
		students.add(toky);
		students.add(matthieu);
		students.add(antony);
		students.add(jean);
		
		System.out.println("Admin : " + admin);
		System.out.println("======================================");
		System.out.println("Teachers : ");
		System.out.println("---------------------------------");
		for(Teacher prof : teachers) {
			System.out.println(prof.toString());
			System.out.println("---------------------------------");
		}
		System.out.println("======================================");
		
		System.out.println("Students : ");
		System.out.println("---------------------------------");
		for(Student pupil : students) {
			System.out.println(pupil.toString());
			System.out.println("---------------------------------");
		}
	}

}
