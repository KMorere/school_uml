package schooluml;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestPerson {

	public TestPerson() {
		
	}

	public static void main(String[] args) {
		School school = new School();
		Admin admin = new Admin("Wilson", "Framboisier", 50, school);
		LocalDate arrivalDate = LocalDate.of(2025, 9, 22);
		Teacher mor = new Teacher("Mor", "Diop", 40, arrivalDate);
		Teacher martial = new Teacher("Bret", "Martial", 50, arrivalDate);
		
		Student daphne = new Student("Daphné", "Cluseau", 37);
		Student killian = new Student("Killian", "Morere", 25);
		Student toky = new Student("Toky", "Sigogneau", 28);
		Student matthieu = new Student("Matthieu", "Couderc", 39);
		Student antony = new Student("Antony", "Vitry", 35);
		Student jean = new Student("Jean", "Dioubiate", 30);
		
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
		
		System.out.println(admin);
		for(Teacher prof : teachers) {
			System.out.println(prof.toString());
		}
		
		for(Student pupil : students) {
			System.out.println(pupil.toString());
		}
	}

}
