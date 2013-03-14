public class TaskList {

	private Task[] list;
	
	public TaskList () {
	
		list = new Task[0];
	}
	
	public void addTask (Task taskIn) {
	
		Task[] temp = new Task[list.length + 1];
		System.arraycopy(list, 0, temp, 0, list.length);
		list = temp;
		
		list[list.length - 1] = taskIn;
	}
		
}