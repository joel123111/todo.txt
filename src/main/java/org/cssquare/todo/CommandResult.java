package org.cssquare.todo;

import java.util.*;
import org.cssquare.*;
public class CommandResult {

 private ArrayList<Task> tl;
 private static String res;
 
 public CommandResult (ArrayList<Task> tlIn, String resIn) {
  tl = tlIn;
  res = resIn;
 }
 
 public ArrayList<Task> getTaskList() { return tl; }
 public static String getResult() { return res; }
}