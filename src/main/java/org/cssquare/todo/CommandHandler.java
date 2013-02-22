package org.cssquare.todo;

public class CommandHandler{
	

	//Dispatching commands
	String dispatch = args[0];
	if(dispatch.equalsIgnoreCase("add")){
		todo.add(args[1]);
	}
	else if(dispatch.equalsIgnoreCase("append")){
		todo.append(args[1]);
	}
	else if(dispatch.equalsIgnoreCase("delete")){
		todo.delete(args[1]);
	}
	else if(dispatch.equalsIgnoreCase("list")){
		todo.list(args[1]);
	}
	else if(dispatch.equalsIgnoreCase("prepend")){
		todo.prepend(args[1]);
	}
	else if(dispatch.equalsIgnoreCase("replace")){
		todo.replace(args[1]);
	}
}