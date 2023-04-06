package practicaOO2.ejercicio07;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;

public class ToDoItem {
	private String name;
	private List<State> statesLog;
	private List<String> comments;
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String name) {
		this.name = name;
		this.statesLog = new ArrayList<State>();
		this.comments = new ArrayList<String>();
		this.statesLog.add(new Pending());
	}
	
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() {
		this.statesLog.get(this.statesLog.size()-1).start(this);
	};
	
	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause(){
		this.statesLog.get(this.statesLog.size()-1).togglePause(this);
	};
	
	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish(){
		this.statesLog.get(this.statesLog.size()-1).finish(this);
	};
	
	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime(){
		State start = this.statesLog.stream()
				.filter(s -> s instanceof InProgress)
				.findFirst().orElse(null);
		if(start == null) {
			throw new RuntimeException("El objeto ToDoItem no inició");
		}
		else {
			State current = this.statesLog.get(this.statesLog.size()-1);
			Duration d = Duration.between(start.getTime(), current.getTime());
			return d;
		}
	};
	
	/**
	 * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	 * contrario no hace nada."
	 */
	public void addComment(String comment){
		this.statesLog.get(this.statesLog.size()-1).addComment(this, comment);
	};
	
	public void setState(State s) {
		this.statesLog.add(s);
	}
	
	public List<String> getComments(){
		return this.comments;
	}
	
	public String showComments() {
		return String.join(" || ", this.comments);
	}
}
