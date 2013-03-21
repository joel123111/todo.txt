package org.cssquare.todo;

import java.util.*;
import java.io.*;
import org.cssquare.*;
public class App 
{
    public static void main( String[] args )
    {
 		try {
			File f = new File("todo.txt");
			ArrayList<Task> tl = FileHandler.readFile(f);
			CommandResult res = CommandHandler.dispatch(args, tl);
			FileHandler.writeFile(res.getTaskList());
			System.out.print(res.getResult());
			
		}
		catch (Exception e) {
			System.out.println (e.getMessage());
		}
    
    }
}