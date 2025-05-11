package com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen.BackendInfoScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ojasx.devpick.R
import com.ojasx.devpick.ui.theme.Coral
import com.ojasx.devpick.ui.theme.magenta
import com.ojasx.devpick.ui.theme.peach

@Composable
fun NodeJsInfoScreen(navController: NavController) {

    val NodejsInfo =  """" 1. Node.js is a JavaScript runtime built on Chrome's V8 engine.
2. It allows JavaScript to be run server-side.
3. Created by Ryan Dahl in 2009.
4. Designed for building scalable network applications.
5. It uses an event-driven, non-blocking I/O model.
6. Suitable for data-intensive real-time applications.
7. Node.js applications are written in JavaScript.
8. Node.js runs on a single thread using event looping.
9. It's lightweight and efficient.
10. Package ecosystem is managed via npm (Node Package Manager).

11. Non-blocking I/O means code doesn’t wait for tasks like reading files.
12. Node uses an event loop to manage concurrency.
13. It’s asynchronous by default.
14. Modules are reusable blocks of code.
15. `require()` is used to import modules.
16. CommonJS is the standard module system in Node.
17. ES Modules (`import/export`) are now supported.
18. Node applications start from an entry file like `index.js`.
19. File System, HTTP, and Events are core modules.
20. Middleware can be created using libraries like Express.

21. Fast code execution due to V8 engine.
22. No buffering – data is output in chunks.
23. Highly scalable.
24. Built-in support for JSON.
25. Active open-source community.
26. Cross-platform: runs on Windows, Linux, MacOS.
27. Ideal for REST APIs and microservices.
28. Great for real-time apps (chat, live games).
29. Can be used with NoSQL and SQL databases.
30. Excellent tooling via npm.

31. `http` – creates web servers.
32. `fs` – handles file system operations.
33. `path` – works with file and directory paths.
34. `os` – info about operating system.
35. `events` – for event-driven programming.
36. `stream` – handles streaming data.
37. `util` – utility functions.
38. `crypto` – encryption/decryption support.
39. `zlib` – compression functionality.
40. `process` – provides runtime information.

41. Based on Single Threaded Event Loop.
42. Uses libuv to handle asynchronous operations.
43. Event loop delegates I/O to worker threads.
44. Callback queue processes tasks sequentially.
45. Promises and async/await offer cleaner syntax.
46. Suitable for I/O-bound but not CPU-heavy tasks.
47. Can be scaled with Cluster Module for multi-core use.
48. Uses event emitters to handle events.
49. Request-handling is done asynchronously.
50. Callbacks are foundational, but Promises are modern choice.

51. Default package manager for Node.js.
52. Hosts over 2 million packages.
53. Packages are defined in `package.json`.
54. `npm install` downloads dependencies.
55. `npm init` sets up a new project.
56. `devDependencies` are for development tools.
57. `dependencies` are required for the app to run.
58. Versioning follows SemVer (semantic versioning).
59. Can publish your own packages.
60. Alternatives include Yarn and pnpm.

61. Express.js – most popular Node.js framework.
62. Koa.js – lightweight and modern.
63. NestJS – full-featured, TypeScript-first.
64. Hapi.js – rich plugin system.
65. Socket.IO – real-time bidirectional event-based communication.
66. Next.js – server-side rendering for React.
67. Fastify – fast and low-overhead web framework.
68. Passport.js – authentication middleware.
69. Sequelize – ORM for SQL databases.
70. Mongoose – ODM for MongoDB.

71. Mocha – test framework.
72. Chai – assertion library.
73. Jest – testing framework from Facebook.
74. Supertest – HTTP assertions for APIs.
75. Debugging via `node inspect` or Chrome DevTools.
76. Nodemon – restarts server on file changes.
77. ESLint – linting for code quality.
78. Prettier – code formatting.
79. Environment variables managed using `dotenv`.
80. Logging done via `winston` or `morgan`.

81. REST APIs.
82. Real-time chat applications.
83. Microservices architecture.
84. Serverless backends.
85. Single Page Application (SPA) backends.
86. IoT data collection.
87. Data streaming apps.
88. Command-line tools.
89. Job schedulers.
90. Dashboard applications.

91. Netflix
92. LinkedIn
93. Walmart
94. Uber
95. PayPal
96. Trello
97. Medium
98. NASA
99. eBay
100. Twitter (for internal tools)
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
                painter = painterResource(R.drawable.nodejs),
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
                        text = NodejsInfo,
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )

                }
            }
        }
    }
}
