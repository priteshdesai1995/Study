import React, { useDebugValue, useEffect, useState } from "react";
import CurrencyInput from "./CurrencyInput";
import CurrencyConveter from "../../CustomHook/CurrencyConveter";

function CurrencyCahnegMain() {
  let [amount, setAmount] = useState(0);
  let [total, setTotal] = useState(0);
  let [from, setFrom] = useState("inr");
  let [too, setTo] = useState("usd");

    let date = new Date();
    console.log(date);
    useDebugValue(date, date => date.toDateString());
 

  let curencydetails = CurrencyConveter(too);
  const options = Object.keys(curencydetails);
  console.log(options);

  const onCurrencyChange = (currency) => {
    setFrom(currency);
  };


  const onCurrencyToChange = (currency) => {
    setTo(currency);
  };

  const onAmountChange = (amount) => {
    setAmount(amount);
  };

  const calculate = () => {
    console.log(amount);
    console.log(curencydetails[from]);
    setTotal(amount*curencydetails[from]);
  };

  useEffect(() => {
    setAmount(amount);
  }, [amount]);

  return (
    <div>
      <CurrencyInput
        label="from"
        amount={amount}
        onAmountChange={onAmountChange}
        onCurrencyChange={onCurrencyChange}
        currencyLoad={options}
        currency={from}
        isDisable={false}
      />

      <input
        type="button"
        name="Swap"
        title="swap"
        value={"SWAP"}
        onClick={() => {
          setFrom(too)
          setTo(from)
          setTotal(amount)
          setAmount(total)
        }}
      />

      <CurrencyInput
        label="to"
        amount={total}
        onAmountChange={onAmountChange}
        onCurrencyChange={onCurrencyToChange}
        currencyLoad={options}
        currency={too}
        isDisable={true}
      />

      <button onClick={calculate}>Calculate</button>
    </div>
  );
}

export default CurrencyCahnegMain;
