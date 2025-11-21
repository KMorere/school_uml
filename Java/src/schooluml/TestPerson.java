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
		city = new City("Montastruc-La-Conseillère", "France", "31555");
		address = new Address(city, "rue des pâtissiers", "20", "");
		Teacher martial = new Teacher("Bret", "Martial", 50, address, arrivalDate);
		
		city = new City("Castanet", "France", "31320");
		address = new Address(city, "rue des péniches", "33", "");
		Student daphne = new Student("Daphné", "Cluseau", address, 37);
		city = new City("Toulouse", "France", "31000");
		address = new Address(city, "chemin des martyrs", "40", "");
		Student killian = new Student("Killian", "Morere", address, 25);
		address = new Address(city, "avenue des chats", "10", "");
		Student toky = new Student("Toky", "Sigogneau", address, 28);
		city = new City("Pibrac", "France", "31520");
		address = new Address(city, "rue du stade toulousaing", "1", "");
		Student matthieu = new Student("Matthieu", "Couderc", address, 39);
		city = new City("Toulouse", "France", "31000");
		address = new Address(city, "avenue Foch", "18bis", "Bâtiment D2, appartement 21");
		Student antony = new Student("Antony", "Vitry", address, 35);
		address = new Address(city, "rue Louise Weiss", "41ter", "");
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
