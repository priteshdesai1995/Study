import React, { useId } from "react";

function CurrencyInput({
  label,
  amount,
  onAmountChange,
  onCurrencyChange,
  currency = "inr",
  currencyLoad = [],
  isDisable=false
}) {
  let id = useId();

  return (
    <div>
      <div>
        <label htmlFor={id}>{label}</label>
        <input
          id={id}
          className="outline-none w-full bg-transparent py-1.5"
          type="number"
          placeholder="Amount"
          value={amount}
          min={0}
          onChange={(e) => {
            onAmountChange && onAmountChange(Number(e.target.value));
          }}
          disabled={isDisable}
        />

        <label>Currency Type</label>

        <select
          className="rounded-lg px-1 py-1 bg-gray-100 cursor-pointer outline-none"
          value={currency}
          onChange={(e) => onCurrencyChange && onCurrencyChange(e.target.value)}
        >
          {currencyLoad.map((currency) => {
            return (
              <option key={currency} value={currency}>
                {currency}
              </option>
            );
          })}
        </select>
      </div>
    </div>
  );
}

export default CurrencyInput;
