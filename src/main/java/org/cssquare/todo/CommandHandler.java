package org.cssquare.todo;
import org.cssquare.todo.*;

public class CommandHandler{

	//Dispatching commands
	String[] args;
	String dispatch;
	String define;

	public static void dispatch(String[] argsIn, ArrayList<Task> taskList){
		if (argsIn.length < 1){
			throw new Exception("Wrong number of arguments");
		}
		dispatch = args[0];

		if(dispatch.equalsIgnoreCase("add")){
			if (argsIn.length < 2){
				throw new Exception("Wrong number of arguments");
			}
			define = args[1];
			add(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("append")){
			define = args[1];
			append(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("delete")){
			define = args[1];
			delete(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("list")){
			list(taskList);
		}
		else if(dispatch.equalsIgnoreCase("prepend")){
			define = args[1];
			prepend(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("replace")){
			replace(taskList, define);
		}
		else{
			throw new Exception("Invalid command");
		}
	}

	public static CommandResult add(ArrayList<Task> taskList, String def){
		Task task = new Task(def);
		taskList.add(task);

		return new CommandResult("Added task: " + taskList.size() + " :)", taskList);
	}

	public static CommandResult append(){
		//Calin
	}

	public static CommandResult delete(ArrayList<Task> taskList, int pos){
		taskList.get(pos).setTask("");
		return new CommandResult("Successfully deleted", taskList)

	}

	public static CommandResult list(ArrayList<Task> taskList){
		String listedTasks;
		for(Task t : taskList){
			listedTasks += t + "\n";
		}
		return new CommandResult(listedTasks);
	}

	public static CommandResult prepend(){
		//Calin
	}

	public static CommandResult replace(ArrayList<Task> taskList, int pos, String str){
		taskList.get(pos).setTask(str);
		return new CommandResult("Successfully replaced!", taskList)
	}
}