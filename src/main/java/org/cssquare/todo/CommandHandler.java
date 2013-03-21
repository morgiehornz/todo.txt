package org.cssquare.todo;

public class CommandHandler{

	//Dispatching commands
	String[] args;
	String dispatch;
	String define;

	public static void dispatch(String[] argsIn, ArrayList<Task> taskList){
		if (argsIn.length < 2){
			throw new Exception("Wrong number of arguments");
		}
		dispatch = args[0];


		if(dispatch.equalsIgnoreCase("add")){
			add(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("append")){
			append(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("delete")){
			delete(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("list")){
			list(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("prepend")){
			prepend(taskList, define);
		}
		else if(dispatch.equalsIgnoreCase("replace")){
			replace(taskList, define);
		}
		else{

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
		.get()

		if (pos )
			throw new Exception("Not found");
	}

	public static CommandResult list(){
		//Nic
	}

	public static CommandResult prepend(){
		//Calin
	}

	public static CommandResult replace(){
		//Morgz
	}
}