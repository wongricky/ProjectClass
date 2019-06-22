package projectClass;

public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project proj0 = new Project();
		String pitch = proj0.elevatorPitch();
		System.out.println(pitch);
		
		Project proj1 = new Project("Save the Trees", "Raise Money for Rainforests");
		String pitch1 = proj1.elevatorPitch2();
		System.out.println(pitch1);
		
		Project proj2 = new Project("Save the Chickens");
		String pitch2 = proj2.elevatorPitch2();
		System.out.println(pitch2);
		
	}
	
}
