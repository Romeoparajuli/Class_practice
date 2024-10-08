package day8;

class enumP {

	int id;
	String deString;
	Task stateTask;

	public enumP(int id, String deString, Task stateTask) {
		super();
		this.id = id;
		this.deString = deString;
		this.stateTask = stateTask;
	}

	void Display() {
		System.out.println(id);
		System.out.println(deString);
		System.out.println(stateTask);
	}

}

public class EnumTest {

	public static void main(String[] args) {
		 enumP enumP= new enumP(12, "Project State", Task.COMPLETE);
		 enumP.Display();
	}

}
