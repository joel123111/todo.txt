package org.cssquare.todo;
import org.cssquare.*;

public class Task {

	private String task;
	
	public Task (String taskIn) {
	
		task = taskIn;
	}
	
	public String getTask() { return task; };

	public void setTask(String newTaskText) {
		task = newTaskText;
	}
	
}