import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App.jsx";
import "./index.css";
import TailWind from "./Components/Tailwind/TailWind.jsx";
import Cards from "./Components/Cards/Cards.jsx";
import RandomPswGenerator from "./Components/RandomKeyGeneratorWithHooks/RandomPswGenerator.jsx";
import CurrencyCahnegMain from "./Components/CurrencyInput/CurrencyCahnegMain.jsx";
import UseReducerHook from "./Components/UseReducerHook/UseReducerHook.jsx";
import Header from "./Components/Header/Header.jsx";
import Home from "./Components/Home/Home.jsx";
import Footer from "./Components/Footer/Footer.jsx";
import { RouterProvider, createBrowserRouter, createRoutesFromElements , Route} from "react-router-dom";
import Layout from "./Components/Layout/Layout.jsx";
import About from "./Components/AboutUs/About.jsx";
import Contact from "./Components/ContactUs/ContactUs.jsx";
import ContextDemo from "./Components/ContextDemo/ContextDemo.jsx";
import ContextThemeDemo from "./Components/ContextThemeDemo/ContextThemeDemo.jsx";
import ContextTodoListDemo from "./Components/ContextTodoListDemo/ContextTodoListDemo.jsx";

// const pelement = React.createElement(
//   'p',
//   {name: "para", id: "para"},
//   "Click to open the para",

// )
// const element = React.createElement(
//   'a',
//   {href: "https://www.google.com", alt: "hello"},
//   "Click to open the Google",
//   pelement
// )

const obj = {
  username: "Pritesh",
  description: "Pritesh Description",
  btnText: "Press Me!!",
};

const obj1 = {
  username: "testdemo",
  description: "Pritesh testdemo Demo1",
  btnText: "Click Me!!",
};

// const router = createBrowserRouter([
//   {
//     path: "/",
//     element: <Layout />,
//     children: [
//       {
//         path: "",
//         element: <Home />,
//       },
//       {
//         path: "/about",
//         element: <About />,
//       },
//       {
//         path: "/contact",
//         element: <Contact/>,
//       }
//     ],
//   },
// ]);

const router = createBrowserRouter(
  createRoutesFromElements(
    <Route path="/" element={<Layout />}>
      <Route path="" element={<Home />}></Route>
      <Route path="/about" element={<About />}></Route>
      <Route path="/contact" element={<Contact />}></Route>
      <Route path="/about/:userId" element={<About />}></Route>

    </Route>
  )
);

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    {/* element */}

    {/* <App/> */}

    {/* <TailWind/>
    <Cards username="PriteshDesai" description="Hello Pritesh Desai" myObj={obj}/>
    <Cards username="testDemo" description="Hello testDemo Description" myObj={obj1}/> */}

    {/* <RandomPswGenerator /> */}

    {/* <CurrencyCahnegMain/> */}

    {/* <UseReducerHook /> */}

    {/* <RouterProvider router={router} /> */}
    
    {/* <ContextDemo/> */}

    {/* <ContextThemeDemo/> */}

    <ContextTodoListDemo/>
  </React.StrictMode>
);
