import java.io.*;
import java.util.Scanner;

public class FileHandler {

	public static TaskList readFile (File f) throws FileNotFoundException {
	
		Scanner scan = new Scanner (f);
		TaskList tl = null;
		while (scan.hasNextLine()) {
		
			String temp = scan.nextLine();
			Task task = new Task(temp);
			tl = new TaskList();
			tl.addTask(task);

		}
		
		return tl;
	}
}