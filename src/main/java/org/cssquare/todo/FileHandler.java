package org.cssquare.todo;

import java.io.*;
import java.util.*;
import org.cssquare.*;

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
    
    public static void writeFile (File f, ArrayList<Task> tl) throws IOException {
        final String NEW_LINE = "\n"; 
        FileWriter out = new FileWriter (f);
        BufferedWriter writer = new BufferedWriter(out);
        
        for (Task t : tl) {
            writer.write(t.getTask());
            writer.write(NEW_LINE);
        }
        
        writer.close();
        
    }
}