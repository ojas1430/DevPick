package com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen.FrontEndInfoScreen

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
fun CssInfoScreen(navController: NavController) {

    val CssInfo = """# 🎨 CSS Theory in 100 Lines

1. CSS (Cascading Style Sheets) controls the layout and appearance of HTML content.
2. It separates design from structure, promoting maintainability.
3. CSS is made up of **selectors** and **declarations**.
4. A rule looks like: `selector { property: value; }`
5. **Tag selectors** target elements directly (e.g., `p`, `h1`).
6. **Class selectors** use a dot (e.g., `.container`).
7. **ID selectors** use a hash (e.g., `#main`).
8. The `*` selector applies styles to all elements.
9. Pseudo-classes like `:hover`, `:active`, `:nth-child()` add interactivity.
10. The **Box Model** is the core layout concept in CSS.

11. The Box Model has 4 parts: content, padding, border, margin.
12. `margin` creates space outside the element.
13. `padding` adds space inside the element.
14. `border` surrounds the padding.
15. Use `box-sizing: border-box;` for predictable sizing.
16. **Display types** define element behavior.
17. `block`: full-width, starts on new line.
18. `inline`: wraps content, no new line.
19. `inline-block`: like inline, but allows box sizing.
20. `none`: hides element completely.

21. Flexbox provides 1D responsive layouts.
22. Use `display: flex` on a container.
23. `justify-content` aligns items horizontally.
24. `align-items` aligns items vertically.
25. `flex-direction: row/column` changes layout direction.
26. Grid offers 2D layouts (rows and columns).
27. `display: grid` enables grid layout.
28. `grid-template-columns` defines column count and size.
29. `gap` adds spacing between grid items.
30. Use media queries for **responsive design**.

31. Syntax: `@media (max-width: 768px) { ... }`
32. Allows adjusting layout for different screen sizes.
33. Useful units: `px`, `em`, `rem`, `%`, `vh`, `vw`.
34. `rem` is based on root font size (good for scaling).
35. CSS supports **colors** in many formats.
36. Examples: `#ff0000`, `rgb(255, 0, 0)`, `red`.
37. Use `background-color` for background color.
38. Use `color` for text color.
39. Fonts are defined with `font-family`.
40. Use fallbacks: `font-family: Arial, sans-serif;`

41. Font sizing: `font-size`, `font-weight`, `line-height`.
42. Text alignment: `text-align: left/center/right`.
43. `text-decoration` controls underline, etc.
44. `letter-spacing` and `word-spacing` refine text.
45. Links are styled with `a`, `a:hover`, `a:visited`.
46. `cursor: pointer;` adds interactivity.
47. Borders are defined with `border: 1px solid #ccc;`
48. Use `border-radius` for rounded corners.
49. `box-shadow` adds depth and elevation.
50. `text-shadow` adds glow or outline to text.

51. `opacity` makes elements transparent.
52. `visibility: hidden;` hides without removing layout space.
53. `display: none;` removes the element from layout flow.
54. `position` controls element placement.
55. Types: `static`, `relative`, `absolute`, `fixed`, `sticky`.
56. `z-index` controls layering.
57. `overflow` handles content overflow: `visible`, `hidden`, `scroll`, `auto`.
58. `max-width` and `min-width` control responsiveness.
59. `height: auto;` adapts to content.
60. `object-fit: cover;` controls image scaling inside containers.

61. Transitions animate changes smoothly.
62. `transition: all 0.3s ease;` is common.
63. `:hover` with transition creates smooth hover effects.
64. Transforms rotate, scale, or move elements.
65. Example: `transform: scale(1.2);`
66. `animation` creates keyframe animations.
67. `@keyframes slide { from {} to {} }` defines steps.
68. CSS Variables simplify theme control.
69. Syntax: `--main-color: #333;`
70. Access with `var(--main-color);`

71. SCSS and LESS are CSS preprocessors.
72. They allow nesting, variables, and functions.
73. `calc()` allows mathematical expressions (e.g., `width: calc(100% - 20px);`)
74. `clamp()` provides responsive sizing between min and max.
75. Normalize.css resets default browser styles.
76. Utility-first CSS (like Tailwind) offers predefined classes.
77. BEM (Block Element Modifier) is a naming convention for clarity.
78. Use comments `/* like this */` for code clarity.
79. Group related styles into sections.
80. Always test on multiple screen sizes.

81. Use semantic HTML to pair well with CSS.
82. Avoid excessive `!important`; use proper specificity.
83. External stylesheets are added with `<link>`.
84. Internal styles go in `<style>` tags in HTML.
85. Inline styles go inside HTML tags, but should be avoided.
86. Minify CSS in production to improve performance.
87. Keep CSS modular in large projects.
88. Organize using components or layout sections.
89. Use CSS for accessibility (e.g., visible focus states).
90. Combine CSS with ARIA roles for better UI clarity.

91. Developer tools in browsers help inspect styles.
92. Use `Ctrl + Shift + I` or right-click > Inspect.
93. Always test styles in multiple browsers.
94. Keep fallback styles for older browsers.
95. Use a consistent unit system (`rem` is recommended).
96. Use shorthand properties (`margin: 10px 20px;`).
97. Avoid overly nested selectors for simplicity.
98. Limit global styles to reduce conflicts.
99. CSS makes the web beautiful, responsive, and engaging.
100. Mastering CSS improves both user experience and developer efficiency.

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
                painter = painterResource(R.drawable.css),
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
                        text = CssInfo,
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )

                }
            }
        }
    }
}