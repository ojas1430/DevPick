package com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen.FrontEndInfoScreen

import android.R.attr.name
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.ui.Alignment
import com.ojasx.devpick.R
import com.ojasx.devpick.ui.theme.Coral
import com.ojasx.devpick.ui.theme.magenta
import com.ojasx.devpick.ui.theme.peach
import androidx.navigation.NavController


@Composable
fun JsInfoScreen(navController: NavController) {

    val jsInfo = """
# 🖥️ JavaScript Theory in 100 Lines

1. JavaScript (JS) is a **scripting language** for creating dynamic, interactive web content.
2. It is used for client-side and server-side development.
3. JavaScript was originally designed for web browsers to manipulate HTML and CSS.
4. JS is **event-driven**, **asynchronous**, and **single-threaded**.
5. JavaScript code is run by the browser’s JavaScript engine (V8 for Chrome).
6. It is an **interpreted language**, meaning code is executed line by line.
7. JS can modify web page elements dynamically (DOM manipulation).
8. **ECMAScript** is the standard specification for JavaScript.
9. Latest versions: **ES6 (ECMAScript 2015)**, **ES7**, **ES8**, and beyond.
10. The **console** is used for debugging with `console.log()`.

11. JavaScript uses **variables** to store data:
    ```js
    let x = 10; // mutable variable
    const y = 5; // constant
    var z = 20; // legacy variable
    ```

12. **Data types**: 
    - Primitive types: `string`, `number`, `boolean`, `null`, `undefined`, `symbol`, `bigint`.
    - Non-primitive (reference types): `object`, `array`, `function`.

13. **Functions** are reusable blocks of code:
    ```js
    function greet(name) {
      return "Hello, " + name;
    }
    ```

14. **Arrow functions**:
    ```js
    const sum = (a, b) => a + b;
    ```

15. **Control structures**: 
    - **Conditionals**: `if`, `else if`, `else`, `switch`
    - **Loops**: `for`, `while`, `forEach`, `map`, `filter`, `reduce`

16. **Objects** store collections of data:
    ```js
    const person = { name: "John", age: 30 };
    ```

17. **Arrays** store ordered collections:
    ```js
    const numbers = [1, 2, 3, 4, 5];
    ```

18. **Events**: JS handles events like `click`, `submit`, `keydown`:
    ```js
    document.querySelector("button").addEventListener("click", function() {
      alert("Button clicked!");
    });
    ```

19. **DOM manipulation** allows interaction with HTML:
    ```js
    document.getElementById("demo").innerText = "Hello, world!";
    ```

20. **JSON** (JavaScript Object Notation) is used for data exchange:
    ```js
    const obj = JSON.parse('{"name":"John"}');
    ```

21. **Async programming** is crucial for handling tasks like API calls:
    - `callback`: function passed as an argument.
    - `Promise`: represents a value that may be available later.
    ```js
    let promise = new Promise((resolve, reject) => { resolve("Success"); });
    ```

22. **Async/Await** simplifies working with promises:
    ```js
    async function fetchData() {
      const response = await fetch("https://api.example.com");
      const data = await response.json();
    }
    ```

23. **Closures** allow functions to access variables from their outer scope:
    ```js
    function outer() {
      let count = 0;
      return function inner() {
        count++;
        return count;
      };
    }
    ```

24. **Hoisting** means variable and function declarations are moved to the top:
    ```js
    console.log(a); // undefined
    var a = 5;
    ```

25. **Scope** defines where variables are accessible:
    - **Global scope**: variables accessible anywhere.
    - **Local scope**: variables accessible within a function or block.

26. **The `this` keyword** refers to the current context:
    ```js
    const obj = { name: "John", greet: function() { console.log(this.name); } };
    obj.greet(); // "John"
    ```

27. **Higher-order functions** take other functions as arguments or return them:
    ```js
    function operateOnNumbers(a, b, operation) {
      return operation(a, b);
    }
    ```

28. **Callbacks** are functions passed as arguments to other functions:
    ```js
    function fetchData(callback) {
      setTimeout(() => { callback("Data loaded"); }, 1000);
    }
    ```

29. **Modules** organize code into separate files:
    ```js
    // export.js
    export const greet = (name) => `Hello, ${name}`;
    // import.js
    import { greet } from './export';
    ```

30. **Destructuring** assigns values to variables from objects or arrays:
    ```js
    const person = { name: "Alice", age: 25 };
    const { name, age } = person;
    ```

31. **Spread operator** (`...`) allows unpacking of arrays or objects:
    ```js
    const arr1 = [1, 2];
    const arr2 = [...arr1, 3, 4];
    ```

32. **Rest parameters** collect arguments into an array:
    ```js
    function sum(...numbers) {
      return numbers.reduce((acc, num) => acc + num, 0);
    }
    ```

33. **Map** stores key-value pairs:
    ```js
    const map = new Map();
    map.set("name", "Alice");
    ```

34. **Set** stores unique values:
    ```js
    const set = new Set([1, 2, 3]);
    ```

35. **Error handling** is done with `try...catch`:
    ```js
    try {
      throw new Error("Oops!");
    } catch (err) {
      console.log(err.message);
    }
    ```

36. **Event delegation** optimizes handling events for many child elements:
    ```js
    document.querySelector("#parent").addEventListener("click", function(event) {
      if (event.target && event.target.matches("button")) {
        alert("Button clicked!");
      }
    });
    ```

37. **JSON.stringify()** converts objects to strings:
    ```js
    const jsonStr = JSON.stringify({ name: "John" });
    ```

38. **JSON.parse()** converts strings to objects:
    ```js
    const obj = JSON.parse('{"name":"John"}');
    ```

39. **LocalStorage** and **SessionStorage** provide client-side data storage:
    ```js
    localStorage.setItem("username", "John");
    ```

40. **Prototype** allows inheritance in JS:
    ```js
    function Person(name) { this.name = name; }
    Person.prototype.greet = function() { console.log("Hello " + this.name); };
    ```

41. **Array methods** like `map()`, `filter()`, `reduce()` transform data:
    ```js
    const nums = [1, 2, 3, 4];
    const doubled = nums.map(num => num * 2);
    ```

42. **Event loop** is the mechanism behind asynchronous behavior in JavaScript.
43. JavaScript is **single-threaded**, but handles asynchronous tasks via **callbacks** and **promises**.
44. **Web APIs** like `setTimeout()`, `fetch()`, `DOM events` are part of the browser's environment.
45. **Strict mode** (`'use strict';`) helps catch common coding mistakes.
46. **Webpack** and **Babel** are tools for bundling and transpiling JS.
47. **TypeScript** is a superset of JavaScript that adds static types.
48. **Node.js** is a runtime that allows JS to be used for server-side development.
49. **NPM** (Node Package Manager) manages JS libraries and dependencies.
50. **Modules**: JavaScript supports `import/export` syntax for modular code.
51. **JQuery** is a popular JS library for DOM manipulation.
52. **AJAX** allows asynchronous HTTP requests from JS.
53. **Fetch API** provides a modern approach to making HTTP requests.
54. JavaScript can interact with databases via **APIs** like **MongoDB** or **Firebase**.
55. **Promises** represent future values and simplify asynchronous workflows.
56. **Promise chaining** allows handling multiple asynchronous actions:
    ```js
    fetch("/data")
      .then(response => response.json())
      .then(data => console.log(data))
      .catch(error => console.log("Error:", error));
    ```

57. **Callback hell** happens when multiple nested callbacks make code hard to read.
58. **Promises** and **async/await** solve callback hell by making code more linear.
59. **Event Emitters** in Node.js allow custom event handling.
60. JavaScript's **global object** varies: `window` in browsers and `global` in Node.js.
61. **Self-invoking functions** execute immediately after they are defined.
62. **IIFE (Immediately Invoked Function Expression)** keeps code isolated.
63. **Functional programming** is a JS paradigm emphasizing immutability and functions as first-class objects.
64. **Object-oriented programming (OOP)** in JS uses prototypes for inheritance.
65. **Class syntax** in ES6 simplifies OOP:
    ```js
    class Person {
      constructor(name) {
        this.name = name;
      }
      greet() {
        console.log("Hello, " + this.name);
      }
    }
    ```

66. **Destructuring assignment** simplifies extracting values from arrays and objects.
67. **Template literals** (backticks) allow embedding expressions inside strings.
68. **Tagged templates** allow processing template literals with functions.
69. **Function overloading** is not supported in JavaScript (but can be mimicked).
70. **Dynamic typing** allows variables to change types.
71. JavaScript allows **first-class functions** (functions can be assigned to variables).
72. JavaScript supports **closures**, enabling functions to remember their lexical environment.
73. **Inheritance** is achieved using prototypes in JavaScript.
74. JavaScript supports both **synchronous** and **asynchronous** operations.
75. JavaScript uses the **call stack** to manage execution order.
76. **Event bubbling** and **capturing** define the flow of events in the DOM.
77. **Bubbling** occurs when events propagate from child to parent.
78. **Capturing** starts from the outermost element down to the target.
79. **Debouncing** is useful for rate-limiting events like scroll or keypress.
80. **Throttling** limits the frequency of function calls.
81. **Web Workers** enable multithreading in JavaScript.
82. **Service Workers** allow offline capabilities in web apps.
83. **Fetch API** simplifies making HTTP requests compared to older methods like `XMLHttpRequest`.
84. **Promises** help manage asynchronous results and errors.
85. **Iterator** and **generator** functions help with custom iteration patterns.
86. **Map and Set** are newer collection types that improve performance over traditional objects and arrays.
87. **WeakMap** and **WeakSet** do not prevent garbage collection of their keys or values.
88. **Proxies** allow custom behavior for fundamental operations (like property lookup).
89. **Reflect API** provides methods for intercepting and manipulating JavaScript operations.
90. **Regular Expressions** (RegEx) are powerful for pattern matching in strings.
91. **Destructuring with default values** prevents

""".trimIndent()


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(peach, magenta)
                )
            )
            .border(8.dp, Coral)
            .padding(1.dp)

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(26.dp))
            Image(
                painter = painterResource(R.drawable.js),
                contentDescription = "",
                modifier = Modifier.size(150.dp)
                    .align(Alignment.CenterHorizontally)
            )

            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                state = rememberLazyGridState(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                userScrollEnabled = true
            ) {

                item{
                    Text(
                        text = jsInfo,
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )

                }
            }
        }
    }
}