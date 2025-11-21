package schooluml;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestPerson {

	public TestPerson() {
		
	}

	public static void main(String[] args) {
		School school = new School();
		Admin admin = new Admin("Wilson", "Framboisier", 50, "2 rue des tilleuls 31000 Toulouse", school);
		LocalDate arrivalDate = LocalDate.of(2025, 9, 22);
		Teacher mor = new Teacher("Mor", "Diop", 40, "50 avenue Foch 31200 Toulouse", arrivalDate);
		Teacher martial = new Teacher("Bret", "Martial", 50, "1 rue des pâtissiers 31350 Montastruc-La-Conseillère", arrivalDate);
		
		Student daphne = new Student("Daphné", "Cluseau", "33 rue des péniches 31320 Catanet", 37);
		Student killian = new Student("Killian", "Morere", "3 rue des martyrs 31400 Bordelongue", 25);
		Student toky = new Student("Toky", "Sigogneau", "4 chemin des chats 81000 Albi", 28);
		Student matthieu = new Student("Matthieu", "Couderc", "15 avenue de Colomiers 3500 Pibrac", 39);
		Student antony = new Student("Antony", "Vitry", "10 chemin du cartel 31520 Ramonville", 35);
		Student jean = new Student("Jean", "Dioubiate", "16 rue  des platanes 31320 Castanet", 30);
		
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
