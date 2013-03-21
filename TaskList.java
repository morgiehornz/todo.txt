package org.cssquare.todo;

// Representation of a list of tasks 
public class TaskList {
	
	private Task[] taskArray = new Task[0];

	public void addTask (Task taskAdded) {
		
		Task[] newArray = new Task[taskArray.length+1];
		
		for (int i=0; i < taskArray.length; i++) {
			newArray[i] = taskArray[i];
		}
		newArray[taskArray.length] = taskAdded;
		taskArray = newArray;
	}
}