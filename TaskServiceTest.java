package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;

import cs320_module4_taskClass.Task;
import cs320_module4_taskClass.TaskService;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
	
	private TaskService taskService;
	
	@BeforeEach
	void setUp() throws Exception {
		taskService = new TaskService();
	}

	@Test
	void testTaskService() {
		//tests if hash map is not null
		TaskService taskService = new TaskService();
	    HashMap<String, Task> tasks = taskService.getTasks();
	    assertNotNull(tasks, "HashMap should not be null");
		
	}

	@Test
	void testAddTask() {
		//create a new Contact object
        Task task = new Task("123456", "Fisal", "This is for xxx");

        // add the Contact object to the ContactService's HashMap
        taskService.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            taskService.addTask(task);
        });
	}
	
	@Test
	void testDeleteTask() {
		// ccreate a new Contact object 
		 Task task = new Task("123456", "Fisal", "This is for xxx");
	    // add the Contact object to the ContactService's HashMap
	    taskService.addTask(task);

	    // test deleting a valid contact ID
	    taskService.deleteTask("123456");

	    // check that the ContactServices HashMap no longer contains the removed contact
	    HashMap<String, Task> tasks = taskService.getTasks();
	    assertFalse(tasks.containsKey("123456"));

	    // test deleting an invalid contact ID
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        taskService.deleteTask("invalid Task id");
	    });

	    //check that the correct exception is thrown
	    assertEquals("Id does not exist", exception.getMessage());
	}
	
	@Test
	void testUpdateInfo() {
		// ccreate a new Contact object 
		Task task = new Task("123456", "Fisal", "This is for xxx");	
		
		// add the contact to the service
	    taskService.addTask(task);
	    
	    //updates the info
	    taskService.updateInfo("123456", "Adam", "Hello Professor");
	    
	 // get the updated contact from the service
	    Task updateInfo = taskService.getTask("123456");
	    
	 // verify that the contact was updated correctly
	    assertNotNull(updateInfo);
	    assertEquals("Adam", updateInfo.getName());
	    assertEquals("Hello Professor", updateInfo.getDescription());
	    
	    String invalidNameNull = null;
	    String invalidDescriptionNull = null;
	    
	    String invalidNameLength = "Task name that is too long";
	    String invalidDescriptionLength = "This is a very long task description that exceeds the limit of 50 characters";


	    // test invalid parameters Length
	    assertThrows(IllegalArgumentException.class, () -> taskService.updateInfo("1", invalidNameLength, "Ikhmayes"));
	    assertThrows(IllegalArgumentException.class, () -> taskService.updateInfo("1", "Fisal", invalidDescriptionLength));
	   
	    // Test null parameters
	    assertThrows(IllegalArgumentException.class, () -> taskService.updateInfo("1", invalidNameNull, "Description"));
	    assertThrows(IllegalArgumentException.class, () -> taskService.updateInfo("1", "Fisal", invalidDescriptionNull));
	    
	    //tests contactId does not exist 
	    assertThrows(IllegalArgumentException.class, () -> taskService.updateInfo("2", "Fisal", "Ikhmayes"));
	}
		
	

}
