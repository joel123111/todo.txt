// D. Sebastian Andrews
//stuff to be done here
package org.cssquare.todo;

import java.lang.StringBuffer;
import java.util.ArrayList;

public class CommandHandler{
	public static void dispatch(String[] args, ArrayList<Task> origTaskList){

		
		String command = args[0];
		String args1 = args[1];
		String args2 = "";

		//If switch statement to choose which function should be called
		if(command.equalsIgnoreCase("add")){
			 add(args1, origTaskList);

		}else if(command.equalsIgnoreCase("delete")){
			 delete(Integer.parseInt(args1), origTaskList);

		}else if(command.equalsIgnoreCase("append")){
			 args2 = args[2];
			 int index = Integer.parseInt(args1);
			 append(index, args2, origTaskList);

		}else if(command.equalsIgnoreCase("prepend")){
			 args2 = args[2];
			 int index = Integer.parseInt(args1);
			 prepend(index, args2, origTaskList);

		}else if(command.equalsIgnoreCase("replace")){
			 args2 = args[2];
			 int index = Integer.parseInt(args1);
			 replace(index, args2, origTaskList);

		}else{
			 notValid(origTaskList);
		}
	}



	//Commands

	//Adds a Task to the end of the list
	private static CommandResult add(String txt2add, ArrayList<Task> list2addto){
		Task temp = new Task(txt2add);
		list2addto.add(temp);
		String result = "A task has been added";
		return new CommandResult(list2addto, result);

		
	}
	//Deletes the specified task
	private static CommandResult delete(int index, ArrayList<Task> list2deletefrom){
		list2deletefrom.remove(index);
		String result = "Task " + index + " has been deleted";
		return new CommandResult (list2deletefrom, result);
	}

	//Adds a Task to the end of the list
	private static CommandResult append(int index, String txt2append, ArrayList<Task> list2appendto){
		String beginning = list2appendto.get(index).getTask();
		list2appendto.get(index).setTask(beginning + " " + txt2append);
		String result = list2appendto.get(index).getTask();
		return new CommandResult (list2appendto, result);
	}
	
	//Adds a Task to the end of the list
	private static CommandResult prepend(int index, String txt2prepend, ArrayList<Task> list2prependto){
		String end = list2prependto.get(index).getTask();
		list2prependto.get(index).setTask(txt2prepend + " " + end);
		String result = list2prependto.get(index).getTask();
		return new CommandResult (list2prependto, result);
	}

	//Adds a Task to the end of the list
	private static CommandResult replace(int index, String txt2replace, ArrayList<Task> list2replacewith){
		String prev_task = list2replacewith.get(index).getTask();
		Task temp = new Task(txt2replace);
		list2replacewith.set(index, temp);
		String result = prev_task + " replaced with: " + list2replacewith.get(index).getTask();
		return new CommandResult(list2replacewith, result);
	}

	private static CommandResult notValid(ArrayList<Task> unchanged) {
		String result = "Invalid command";
		return new CommandResult(unchanged, result);
	}
}