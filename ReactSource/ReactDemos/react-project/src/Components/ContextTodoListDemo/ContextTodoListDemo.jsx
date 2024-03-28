import React, { useEffect, useState } from "react";
import { TodoContextProvider } from "../../context/TodoContext";

function ContextTodoListDemo() {
  const [todo, setTodos] = useState([]);

  const addTodo = (todo) => {
    setTodos((prevTodo) => {
      [{ id: new Date(), ...todo }, ...prevTodo];
    });
  };

  const updateTodo = (id, todo) => {
    setTodos((preTodo) =>
      preTodo.map((curTodo) => (curTodo.id === id ? todo : curTodo))
    );
  };

  const deleteTodo = (id) => {
    setTodos((prevTodo) => prevTodo.filter((curTodo) => curTodo.id !== id));
  };

  const toggeleTodo = (id) => {
    setTodos((prevTodo) =>
      prevTodo.map((curTodo) =>
        curTodo.id === id
          ? { ...curTodo, completed: !curTodo.completed }
          : curTodo
      )
    );
  };

  // set the data from the local storage
  useEffect(() => {
    const todoLocal = Json.parse(localStorage.getItem("todos"));

    if (todo && todo.length < 0) {
      setTodos(todoLocal);
    }
  },[]);

  // set thevalue in the local storage when it is add from the UI
  useEffect(() => {
    localStorage.setItem("todos", JSON.stringify(todo));
  },[todo])

  return (
    <TodoContextProvider
      value={{ todos, addTodo, updateTodo, deleteTodo, toggeleTodo }}
    >
      <div className="bg-[#172842] min-h-screen py-8">
        <div className="w-full max-w-2xl mx-auto shadow-md rounded-lg px-4 py-3 text-white">
          <h1 className="text-2xl font-bold text-center mb-8 mt-2">
            Manage Your Todos
          </h1>
          <div className="mb-4">{/* Todo form goes here */}</div>
          <div className="flex flex-wrap gap-y-3">
            {/*Loop and Add TodoItem here */}
          </div>
        </div>
      </div>
    </TodoContextProvider>
  );
}

export default ContextTodoListDemo;
