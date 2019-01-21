package commands;

import java.util.Scanner;

import todolist.Main;
import todolist.Task;

public class DeleteCommand implements Command {

	@Override
	public String description() {
		return "delete";
	}

	@Override
	public void execute() {
		for (Task task : Main.tasks) {
			System.out.println("ID: " + task.getId() + " - Description: " + task.getDescription());
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID to delete> ");
		if (scanner.hasNextInt()) {
			int id = scanner.nextInt();
			Task taskDelete = null;

			for (Task task : Main.tasks) {
				if (task.getId() == id) {
					taskDelete = task;
				}
			}
			if (Main.tasks.remove(taskDelete)) {
				Main.memory.save(Main.tasks);
				System.out.println("Done!");
			}
		}

	}

}
