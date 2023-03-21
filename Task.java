/*
 * Author Fisal Ikhmayes 
 * Cs_320
 * module 4 assignment Task and TaskService
 */


package cs320_module4_taskClass;

public class Task {
	
	/*
	 * Task Class Requirements

The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.

	 */

	private final String ID;
	private String name;
	private String description;
	
	//constructor for Task
	public Task(String ID, String name, String description) {
		//checks if requirements are met
		if (ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.ID = ID;
		
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.name = name;
		
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = description;
		
	}
	
	
	public void setName(String name) {
		//checks if requirements are met
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.name = name;
		
	}
	
	public void setDescription(String description) {
		//checks if requirements are met
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = description;
		
	}
	
	//Getters
	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	}
