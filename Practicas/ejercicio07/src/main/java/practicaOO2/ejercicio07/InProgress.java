package practicaOO2.ejercicio07;

public class InProgress extends State{

	@Override
	public void start(ToDoItem context) {
		// Do nothing
		
	}

	@Override
	public void togglePause(ToDoItem context) {
		context.setState(new Paused());
		
	}

	@Override
	public void finish(ToDoItem context) {
		context.setState(new Finished());
		
	}

	@Override
	public void addComment(ToDoItem context, String comment) {
		context.addComment(comment);
		
	}

}
