package practicaOO2.ejercicio07;

public class Pending extends State{


	@Override
	public void start(ToDoItem context) {
		context.setState(new InProgress());
	}

	@Override
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
		
	}

	@Override
	public void finish(ToDoItem context) {
		// nothing
		
	}

	@Override
	public void addComment(ToDoItem context, String comment) {
		context.addComment(comment);
	}

}
