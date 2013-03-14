package org.cssquare.todo;

public class App 
{
    public static void main( String[] args )
    {
 		try {
			File f = new File("todo.txt");
			TaskList tl = FileHandler.readFile(f);
			/*
			CommandResult res = CommandHandler.dispatch(tl, args);
			FileHandler.writeFile(res.getTaskList());
			System.out.print(res.getResult());
			*/
		}
		catch (Exception e) {
			System.out.println (e.getMessage());
		}
    
    }
}
