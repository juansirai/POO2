package practicaOO2.ejercicio07;

public class Finished extends State{

	@Override
	public void start(ToDoItem context) {
		// Do nothing
	}

	@Override
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
		
	}

	@Override
	public void finish(ToDoItem context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComment(ToDoItem context, String comment) {
		// nothing	
	}

}
