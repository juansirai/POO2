package practicaOO2.ejercicio07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ToDoItemTest {
	private ToDoItem t1,t2;
	
	@BeforeEach
	void setUp() throws Exception{
		this.t1 = new ToDoItem("Tarea uno");
		this.t2 = new ToDoItem("Tarea dos");
	}
	
	@Test
	void testStart() {
		assertEquals(1,t1.getStates().size());
		assertEquals(1, t2.getStates().size());
		
		t1.start();
		assertEquals(2, t1.getStates().size());
		assertTrue(t1.getStates().get(t1.getStates().size()-1) instanceof InProgress);
		
		t1.start();
		assertEquals(2, t1.getStates().size());
		assertTrue(t1.getStates().get(t1.getStates().size()-1) instanceof InProgress);
	}
	
	@Test
	void testPause() {
		t1.start();
		t1.togglePause();
		assertTrue(t1.getStates().get(t1.getStates().size()-1) instanceof Paused);
		t1.togglePause();
		assertTrue(t1.getStates().get(t1.getStates().size()-1) instanceof InProgress);
		
		Exception exception = assertThrows(RuntimeException.class, () -> {t2.togglePause();});
		String expectedMessage = "El objeto ToDoItem no se encuentra en pause o in-progress";
		String realMessage1 = exception.getMessage();
		assertEquals(expectedMessage, realMessage1);
		
		t2.start();
		t2.finish();
		Exception exception2 = assertThrows(RuntimeException.class, () -> {t2.togglePause();});
		String realMessage2 = exception2.getMessage();
		assertEquals(expectedMessage, realMessage2);
	}
	
	@Test
	void testFinish() {
		t1.finish();
		assertFalse(t1.getStates().get(t1.getStates().size()-1) instanceof Finished);
		t1.start();
		t1.finish();
		assertTrue(t1.getStates().get(t1.getStates().size()-1) instanceof Finished);
		
		t2.start();
		t2.togglePause();
		t2.finish();
		assertTrue(t2.getStates().get(t2.getStates().size()-1) instanceof Finished);
		
	}
	
	@Test
	void testTime() throws InterruptedException{
		t1.start();
		TimeUnit.SECONDS.sleep(3);
		t1.finish();
		assertEquals(3, t1.workedTime().getSeconds(), 0.1);
		
		Exception exception2 = assertThrows(RuntimeException.class, () -> {t2.workedTime();});
		String expectedMessage = "El objeto ToDoItem no inicio";
		String realMessage = exception2.getMessage();
		assertEquals(expectedMessage, realMessage );
	}

}
