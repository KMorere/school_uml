import java.util.ArrayList;
import java.util.List;

public class School {
	private int id;
	private List<Classroom> classromms;
	private Admin admin;
	
	// Constructeurs
	public School () {
		this.classrooms = new ArrayList<>();
	}
	
	public School(Admin admin) {
		this.admin = admin;
		this.classrooms = new ArrayList<>();
	}
	
	// Getters et Setters
	public List<Classroom> getClassroom() { return classrooms; }
	public void setClassrooms(List<Classroom> classrooms) {this.classrooms = classrooms;}
	
	public Admin getAdmin() { return admin; }
	public void setAdmin(Admin admin) { this.admin = admin; }
	
	@Override
	public Strig toString() {
		return "School{classrooms=" + classrooms + ", admin=" + admin + "}";
	}
	
}

