import { v4 } from "uuid";
import autoAnimate from "@formkit/auto-animate";
import { loadFromLocalStorage, saveTasksToLocalStorage } from "./utils/utils";
import crearGrafico from "./components/grafico";

const newTaskInput = document.querySelector("#new-task-input");
const tasksListUl = document.querySelector(".tasks-list-ul");
const addTaskBtn = document.querySelector(".add-task-btn");
const mostrarGraficoBtn = document.querySelector(".mostrar-grafico-link");
const container = document.querySelector(".grafico-container");

autoAnimate(tasksListUl);

const tasks = [];

const app = {
  tasks,
  newTaskInput,
  tasksListUl,
};

if (loadFromLocalStorage("tasks")) {
  loadFromLocalStorage("tasks").forEach((e) => {
    app.tasks.push(e);
    addTaskToList(e, app.tasksListUl);
  });
}

function createNewTask(title, isCompleted = false) {
  return {
    id: v4().toString(),
    title,
    isCompleted,
  };
}

function addTaskToList(task, taskListUl) {
  const taskElement = createTaskElement(task);
  taskListUl.appendChild(taskElement);
}

function createTaskElement(task) {
  const taskElement = document.createElement("li");
  const taskCheckBox = document.createElement("input");
  taskCheckBox.type = "checkbox";
  taskCheckBox.checked = task.isCompleted;

  const taskTitleElement = document.createElement("span");
  taskTitleElement.textContent = task.title;
  taskTitleElement.style.width = "70%";

  taskTitleElement.classList.toggle("completed", task.isCompleted);
  const taskDeleteBtn = document.createElement("button");
  taskDeleteBtn.textContent = "Eliminar tarea";
  taskDeleteBtn.className = "delete-button";

  taskDeleteBtn.addEventListener("click", () => {
    const taskIndex = app.tasks.indexOf(task);
    if (taskIndex > -1) {
      app.tasks.splice(taskIndex, 1);
      taskElement.remove();
      saveTasksToLocalStorage("tasks", app.tasks);
    }
  });

  taskCheckBox.addEventListener("change", () => {
    task.isCompleted ? (task.isCompleted = false) : (task.isCompleted = true);
    taskTitleElement.classList.toggle("completed", task.isCompleted);
    saveTasksToLocalStorage("tasks", app.tasks);
  });

  taskElement.appendChild(taskCheckBox);
  taskElement.appendChild(taskTitleElement);
  taskElement.appendChild(taskDeleteBtn);
  return taskElement;
}

function addTask() {
  const newTaskTitle = app.newTaskInput.value;
  if (newTaskTitle) {
    const newTask = createNewTask(newTaskTitle);
    app.tasks.push(newTask);
    addTaskToList(newTask, app.tasksListUl);
    app.newTaskInput.value = "";
    saveTasksToLocalStorage("tasks", app.tasks);
  }
}

addTaskBtn.addEventListener("click", addTask);

newTaskInput.addEventListener("keydown", (e) => {
  if (e.key === "Enter") {
    addTask();
  }
});

mostrarGraficoBtn.addEventListener("click", (e) => {
  e.preventDefault();

  crearGrafico(app, container);
});
