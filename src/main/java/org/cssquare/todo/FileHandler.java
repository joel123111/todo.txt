package org.cssquare.todo;

import java.io.*;
import java.util.*;

public class FileHandler {

	public static ArrayList<Task> readFile (File f) throws FileNotFoundException {
	
		Scanner scan = new Scanner (f);
		ArrayList<Task> taskList = new ArrayList<Task>();
		while (scan.hasNextLine()) {
		
			String temp = scan.nextLine();
			Task task = new Task(temp);
			taskList.add(task);

		}
		
		return taskList;
	}

	public static void writeFile (ArrayList<Task> tl) throws IOException {
		FileWriter out = new FileWriter ("Todo.txt");
		BufferedWriter buf = new BufferedWriter(out);
		PrintWriter pw = new PrintWriter(buf);

		for (int i = 0; i < tl.size(); i++) {
			pw.println(tl.get(i));
		}

		out.close();

	}
}