package practicaOO2.ejercicio07;

public class Paused extends State{

	@Override
	public void start(ToDoItem context) {
		// do nothing
		
	}

	@Override
	public void togglePause(ToDoItem context) {
		context.setState(new InProgress());
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
