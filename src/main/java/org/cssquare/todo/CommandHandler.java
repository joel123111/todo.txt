// D. Sebastian Andrews
//stuff to be done here
package org.cssquare.todo;

import java.lang.StringBuffer;

public class CommandHandler{

	public static dispatch(String args[], TaskList enteredTaskArray){

		String commandResult = "";
		String command = args[0];

		//If switch statement to choose which function should be called
		if(command.equalsIgnoreCase("add")){
			commandResult = add(args[1], enteredTaskArray);

		}else if(command.equalsIgnoreCase("delete")){
			commandResult = delete(args[1], enteredTaskArray);

		}else if(command.equalsIgnoreCase("append")){
			commandResult = append(enteredTaskArray);

		}else if(command.equalsIgnoreCase("prepend")){
			return add(enteredTaskArray);

		}else if(command.equalsIgnoreCase("replace")){
			return add(enteredTaskArray);

		}else{
			commandResult = "No command was entered";
		}

		return commandResult;
	}



	//Commands

	//Adds a Task to the end of the list
	private String add(Task enteredTaskArray){
		String result = "";



		result = "A task has been added";

		return result;
	}
	//Deletes the specified task
	private String delete(Task enteredTaskArray){
		String result = "";

		

		result = "The task has been deleted";

		return result;
	}
	//Adds a Task to the end of the list
	private String append(Task enteredTaskArray){
		String result = "";

		

		result = "A task has been appended";

		return result;
	}
	//Adds a Task to the end of the list
	private String prepend(Task enteredTaskArray){
		String result = "";

		

		result = "A task has been prepended";

		return result;
	}
	//Adds a Task to the end of the list
	private String replace(Task enteredTaskArray){
		String result = "";


		result = "A tastk has been replaced";

		return result;
	}
}