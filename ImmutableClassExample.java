package genaralprograms;

public class ImmutableClassExample {
	
	private final String name;
	private final int rollNum;
	
	public ImmutableClassExample(String name,int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}
	
	public String getName() {
		return name;
	}
	public int getRollNum() {
		return rollNum;
	}
	
	@Override
	public String toString() {
		return "Immutable Student {Name = '"+name+"',RollNumber = '"+rollNum+"'}";
	}
	public static void main(String[] args) {
		
		ImmutableClassExample student = new ImmutableClassExample("Ravi",70);
		System.out.println(student);
		// Attempt to modify (not possible)
        // student.name = "Bob";   //  Compilation error: cannot assign a value to final variable 'name'
        // student.rollNumber = 102; //  Compilation error: cannot assign a value to final variable 'rollNumber'

        // The only way to get a different object is to create a new instance
        ImmutableClassExample newStudent = new ImmutableClassExample("Bob", 102);
        System.out.println(newStudent);
	}
}
