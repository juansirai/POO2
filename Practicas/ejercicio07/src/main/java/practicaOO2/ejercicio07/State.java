package practicaOO2.ejercicio07;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public abstract class State {
	protected Instant time;
	
	public State() {
		this.time = LocalDateTime.now().toInstant(ZoneOffset.UTC);
	}
	
	public abstract void start(ToDoItem context);
	
	public abstract void togglePause(ToDoItem context);
	
	public abstract void finish(ToDoItem context);
	
	public abstract void addComment(ToDoItem context, String comment);
	
	public Instant getTime() {
		return this.time;
	}
}
