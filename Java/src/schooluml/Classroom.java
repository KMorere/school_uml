import java.util.Arrays;

public class Classroom {
	private int id;
	private String name;
	private int size;
	
	// Constructeurs
	public Classroom() {}
	
	public Classroom(String name, int size) {
		this.name = name;
		this.size = size;		
	}
	
	// Getters et Setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getSize() { return name; }
	public void setSize(int size) { this.size = size; }
}