package practicaOO2.ejercicio07;

import java.time.LocalDate;

public abstract class State {
	protected LocalDate time;
	
	public State() {
		this.time = LocalDate.now();
	}
	
	public abstract void start(ToDoItem context);
	
	public abstract void togglePause(ToDoItem context);
	
	public abstract void finish(ToDoItem context);
	
	public abstract void addComment(ToDoItem context, String comment);
	
	public LocalDate getTime() {
		return this.time;
	}
}
