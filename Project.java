package projectClass;
import java.util.Scanner;

public class Project {
	private String name;
	private String description;
	private String projectName;
	private String projectDescription;
	
	// Return for user input
	public String elevatorPitch(){
		return ("This is the first project: " + name + " ; " + description);
	}
	
	// Return for parameter input 
	public String elevatorPitch2() {
		if (projectDescription != null) {
			return("This is the second project: " + projectName + " ; " + projectDescription);
		}
		else {
			return("Project '" + projectName + "' does not have a description attached.");
		}
	}
	
	
	// Constructors 
	public Project() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name of project: ");
		this.name = in.nextLine();
	
		System.out.print("Enter description of project: ");
		this.description = in.nextLine();
		in.close();
	}
	
	public Project(String projectName) {
		this.projectName = projectName;
	}
	
	public Project(String projectName, String projectDescription) {
		this.projectName = projectName;
		this.projectDescription = projectDescription; 
	}
	
	// Getters 
	public String getName() {
		return projectName;
	}
	public String getDescription() {
		return projectDescription;
	}
	
	// Setters
	public void setName(String getProjectName) {
		getProjectName = projectName;
	}
	public void setDescription(String getProjectDescription) {
		getProjectDescription = projectDescription;
	}
}	
