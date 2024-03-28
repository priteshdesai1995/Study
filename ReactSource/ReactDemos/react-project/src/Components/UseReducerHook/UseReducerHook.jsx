import React, { useReducer } from "react";

function reducer(state, action) {
  if (action.type === "increment") {
    return {
      age: state.age + 1,
    };
  }
}

function UseReducerHook() {
  const [state, dispatch] = useReducer(reducer, { age: 50 });

  return (
    <div>
      <input
        type="button"
        name="button"
        id="button"
        value={"ADD"}
        onClick={() => {
          dispatch({ type: "increment" });
        }}
      />
      <label>{state.age}</label>
    </div>
  );
}

export default UseReducerHook;
