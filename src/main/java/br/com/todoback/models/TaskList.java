package br.com.todoback.models;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private Long id;
	private String name;
	private List<Task> taskList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TaskList() {
		this.taskList = new ArrayList<Task>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAllTasks(List<Task> all) {
		this.taskList.addAll(all);
	}

	public void addTask(Task task) {
		this.taskList.add(task);
	}

	public void editTask(Task task) {
		this.taskList.add(task);
	}

	public void deleteTask(Task task) {
		this.taskList.remove(task);
	}

	public List<Task> getTaskList() {
		return taskList;
	}
}