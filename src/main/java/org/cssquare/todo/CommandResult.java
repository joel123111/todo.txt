public class CommandResult {

	private TaskList tl;
	private String res;
	
	public CommandResult (TaskList tlIn, String resIn) {
		tl = tlIn;
		res = resIn;
	}
	
	public TaskList getTaskList() { return tl; }
	public String getResult() { return res; }
}