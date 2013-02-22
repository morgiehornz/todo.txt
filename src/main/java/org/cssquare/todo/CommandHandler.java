package org.cssquare.todo;

public class CommandHandler{

	//Dispatching commands
	String dispatch = args[0];
	String define = args[1];

	if(dispatch.equalsIgnoreCase("add")){
		todo.add(define);
	}
	else if(dispatch.equalsIgnoreCase("append")){
		todo.append(define);
	}
	else if(dispatch.equalsIgnoreCase("delete")){
		todo.delete(define);
	}
	else if(dispatch.equalsIgnoreCase("list")){
		todo.list(define);
	}
	else if(dispatch.equalsIgnoreCase("prepend")){
		todo.prepend(define);
	}
	else if(dispatch.equalsIgnoreCase("replace")){
		todo.replace(define);
	}

	public void add(String def){
		
	}
}