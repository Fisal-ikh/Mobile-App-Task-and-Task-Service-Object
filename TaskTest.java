/*
 * Author Fisal Ikhmayes 
 * Cs_320
 * module 4 assignment Task and TaskService
 */

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cs320_module4_taskClass.Task;

class TaskTest {
	
	private Task task;

	@BeforeEach
	void setUp() {
		//creates test data
		task = new Task("12345678", "Fisal", "This is the task description");
	}
	
	
	@Test
	void testTask() {
		
		    String validID = "12345";
		    String validName = "Task Name";
		    String validDescription = "Task description";
		    
		    String invalidIDNull = null;
		    String invalidNameNull = null;
		    String invalidDescriptionNull = null;
		    
		    String invalidIDLength = "12345678901";
		    String invalidNameLength = "Task name that is too long";
		    String invalidDescriptionLength = "This is a very long task description that exceeds the limit of 50 characters";

		    
		    Task task = new Task(validID, validName, validDescription);
		    assertEquals(validID, task.getID());
		    assertEquals(validName, task.getName());
		    assertEquals(validDescription, task.getDescription());
		

		    
		    assertThrows(IllegalArgumentException.class, () -> new Task(invalidIDNull, validName, validDescription));
		    assertThrows(IllegalArgumentException.class, () -> new Task(invalidIDLength, validName, validDescription));
		    assertThrows(IllegalArgumentException.class, () -> new Task(validID, invalidNameNull, validDescription));
		    assertThrows(IllegalArgumentException.class, () -> new Task(validID, invalidNameLength, validDescription));
		    assertThrows(IllegalArgumentException.class, () -> new Task(validID, validName, invalidDescriptionNull));
		    assertThrows(IllegalArgumentException.class, () -> new Task(validID, validName, invalidDescriptionLength));
		
	}
	
	
	
	@Test
	void testSetName() {
		// test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        task.setName("Johnehehehehehehehehe");
	    });
	    //tests null 
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    	task.setName(null);
	    });
	    //tests a good input 
	    Assertions.assertDoesNotThrow(() -> {
	        task.setName("fisal");
	    });
	}
	
	@Test
	void testSetDescription() {
		// test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        task.setDescription("John John John John John John John John John John 1");
	    });
	    //tests null 
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    	task.setDescription(null);
	    });
	    //tests a good input 
	    Assertions.assertDoesNotThrow(() -> {
	        task.setDescription("This is for xxx");
	    });
	}
	
	//tests if the getter methods work
	@Test
	void testGetID() {
		assertEquals("12345678", task.getID());
	}
	
	@Test
	void testGetName() {
		assertEquals("Fisal", task.getName());
	}
	
	@Test
	void testGetDescription() {
		assertEquals("This is the task description", task.getDescription());
	}
	

}
