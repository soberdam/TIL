package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		
		desktop.display();
		desktop.turnOff();
		
		Notebook myNotebook = new MyNotebook();
		myNotebook.display();
		
	}

}
