package commands;

import todolist.Main;
import todolist.Task;

public class ListCommand implements Command {

	@Override
	public String description() {
		return "list";
	}

	@Override
	public void execute() {
		for (Task task : Main.tasks) {
			System.out.println(task);
		}
	}

}
