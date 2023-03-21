/*
 * Author Fisal Ikhmayes 
 * Cs_320
 * module 4 assignment Task and TaskService
 */

package cs320_module4_taskClass;

import java.util.HashMap;



public class TaskService {
	
	/*
	 * Task Service Requirements

	The task service shall be able to add tasks with a unique ID.
	The task service shall be able to delete tasks per task ID.
	The task service shall be able to update task fields per task ID. The following fields are updatable:
		Name
		Description
	 */
	
	// maps contactID to Contact object
	private HashMap<String, Task> tasks; 
	
	public TaskService() {
		this.tasks = new HashMap<>();
		
	}
	
	//returns tasks
	public HashMap<String, Task> getTasks() {
        return this.tasks;
    }
	
	//add new tasks and checks if one exists.
	public void addTask(Task task) {
		if (tasks.containsKey(task.getID())) {
			throw new IllegalArgumentException("ID already exists.");
		}
		tasks.put(task.getID(), task);
		
	}
	//deletes tasks and check if one exists
	public void deleteTask(String ID) {
		if(!tasks.containsKey(ID)) {
			throw new IllegalArgumentException("Id does not exist");
		}
		tasks.remove(ID);
		
	}
	//updates info Name and Description
	public void updateInfo(String ID, String name, String description) {
		//checks if tasks exists
		if(!tasks.containsKey(ID)) {
			throw new IllegalArgumentException("Id" + ID +  "does not exist");
		}
		//creates a new object of Task
		Task task = tasks.get(ID);
		
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		task.setName(name);
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		task.setDescription(description);
		
	}
	
	public Task getTask(String ID) {
	    return tasks.get(ID);
	}

}
