import { createSlice, nanoid } from "@reduxjs/toolkit";

const initialState = {
  todos: [
    {
      id: 1,
      text: "Hello World",
    },
  ],
};

export const todoSlice = createSlice({
  name: "todo",
  initialState,
  reducers: {
    addToTodo: (state, action) => {
      const todo = {
        id: nanoid(),
        text: action.payload,
      }
      state.todos.push(todo);
    },
    removeTodo: (state, action) => {
        console.log(action.payload);

        console.log("Todo list is : " + JSON.stringify(state.todos));
        state.todos = state.todos.filter((item) => {
            console.log(item.id + " != " + action.payload);
            return item.id!=action.payload;
        });

        console.log("After Todo list is : " + JSON.stringify(state.todos));
    },
    updateTodo: (state, action) => {
        state.todos.filter((item) => {
            console.log("Item Id is : " + item.id);
            console.log("action.payload : " + JSON.stringify(action.payload));
            if(item.id == action.payload.id) {
                item.text = action.payload.text;
            }
        })
    }
  },
});


export const {addToTodo, removeTodo, updateTodo} = todoSlice.actions;
export default todoSlice.reducer;


