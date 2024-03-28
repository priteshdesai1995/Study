import React, { useCallback, useEffect, useRef, useState } from "react";

function RandomPswGenerator() {
  const [wordLength, setWordLength] = useState(8);
  const [isCharacter, setIsCharacter] = useState(false);
  const [isNumber, setIsNumber] = useState(false);
  const [password, setPassword] = useState("");

  // useRef hook
  const passwordRef = useRef(null);

  const passwordGenerator = useCallback(() => {
    let password = "";
    let str = "asdfghjklzxcvbnmqwertyuiopZXCVBNMLKJHGFDSAQWERTYUIOP";
    if (isNumber) {
      str += str + "1234567890";
    }
    if (isCharacter) {
      str += str + "!@#$%^&*():><?~`";
    }

    console.log(wordLength);
    for (let i = 0; i <= wordLength; i++) {
      const char = Math.floor(Math.random() * str.length + 1);
      password += str.charAt(char);
    }
    setPassword(password);
  }, [wordLength, isCharacter, isNumber, setPassword]);


  const copyPasswordToClipBoard = useCallback(() => {
    passwordRef.current?.select()

    // select only twenty characters.
    passwordRef.current?.setSelectionRange(0,20);
    
    window.navigator.clipboard.writeText(password);
  },[password])

  useEffect(() => {
    passwordGenerator();
  }, [isCharacter, isNumber, wordLength]);

  return (
    <div className="w-16 md:w-32 lg:w-48">
      <h1 className="lg-5w-96">React Password generator</h1>
      <input
        className="flex w-auto h-10 p-10 rounded-3xl dark:text-white border-8 border-red-400"
        type="text"
        name="password"
        value={password}
        id="password"
        readOnly
        ref={passwordRef}
      />
      <button className="w-auto rounded-3xl dark:text-white border-8 border-red-400" onClick={copyPasswordToClipBoard}>
        Copy
      </button>
      <input
        className="w-auto h-10 p-10 rounded-3xl dark:text-white border-8 border-red-400 cursor-pointer"
        type="range"
        min="6"
        max="100"
        value={wordLength}
        name="range"
        id="range"
        onChange={(e) => setWordLength(e.target.value)}
      />

      <input
        className="w-auto h-10 p-10 rounded-3xl dark:text-white border-8 border-red-400 cursor-pointer"
        type="checkbox"
        defaultChecked={isNumber}
        name="isDigit"
        id="isDigit"
        onChange={() => setIsNumber((prev) => !prev)}
      ></input>
      <label>isDigit</label>

      <input
        className="w-auto h-10 p-10 rounded-3xl dark:text-white border-8 border-red-400 cursor-pointer"
        type="checkbox"
        defaultChecked={isCharacter}
        name="ischar"
        id="ischar"
        onChange={() => setIsCharacter((prev) => !prev)}
      ></input>
      <label>ischar</label>

      <label>Length: {wordLength}</label>
    </div>
  );
}

export default RandomPswGenerator;
