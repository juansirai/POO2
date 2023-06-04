package practicaOO2.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class HandlerHide extends Handler{
	private Handler h;
	private List<String> hiddenWords = new ArrayList<String>();
	
	public HandlerHide(Handler h) {
		super();
		this.h = h;
	}
	
	
	public void addWord(String w) {
		this.hiddenWords.add(w);
	}
	public void removeWord(String w) {
		this.hiddenWords.remove(w);
	}
	
	@Override
	public void publish(LogRecord record) {
		String msj = record.getMessage();
		String result = "";
		for(String word: msj.split(" ")) {
			if(this.hiddenWords.contains(word))
				result+="*** ";
			else
				result+= word+" ";
		}
		record.setMessage(result);
		this.h.publish(record);
		
	}

	@Override
	public void flush() {
		this.h.flush();
		
	}

	@Override
	public void close() throws SecurityException {
		this.h.close();
		
	}
	

}
