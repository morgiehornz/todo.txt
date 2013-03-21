package org.cssquare.todo;
import org.cssquare.todo.*;

public class App {
    public static void main(String[] args){
    	try {
	      	File f = new File ("todo.txt");
	      	ArrayList <Task> taskList = FileHandler.readfile(f);
	      	CommandResult result = CommandHandler.dispatch(args, taskList);
	      	FileHandler.write(result.getTaskList());
	      	System.out.println(result.getMessage());
    	}	
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}