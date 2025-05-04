package com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ojasx.devpick.ui.theme.deepBlue
import com.ojasx.devpick.ui.theme.lightYellow
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import android.widget.ImageView
import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import com.ojasx.devpick.R
import com.ojasx.devpick.ui.theme.Coral
import com.ojasx.devpick.ui.theme.magenta
import com.ojasx.devpick.ui.theme.peach
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController


@Composable
fun HtmlInfoScreen(navController: NavController) {

    val htmlInfo = """
1. HTML stands for HyperText Markup Language.
2. It is the standard language for creating web pages.
3. HTML describes the structure of a webpage using elements.
4. Elements are the building blocks of HTML.
5. HTML elements are represented by tags.
6. Tags are written using angle brackets, like <p>.
7. Most elements have an opening tag and a closing tag.
8. For example: <p>This is a paragraph.</p>
9. HTML documents start with a doctype declaration.
10. The basic structure begins with <html>...</html> tags.

11. Inside <html>, you use <head> and <body>.
12. The <head> section contains metadata about the page.
13. The <title> tag defines the title shown in the browser tab.
14. The <body> contains everything you see on the webpage.
15. Headings in HTML are from <h1> (largest) to <h6> (smallest).
16. Paragraphs are written with <p> tags.
17. Line breaks are done using <br>.
18. Horizontal lines use <hr>.

19. You can make text bold with <b> or <strong>.
20. Italic text uses <i> or <em>.
21. Underline text uses <u>.
22. Links are created using the <a> tag.
23. Example: <a href="https://example.com">Visit</a>
24. Images use the <img> tag.
25. Example: <img src="image.jpg" alt="Description">

26. Lists can be ordered (<ol>) or unordered (<ul>).
27. List items use <li> inside the list tags.
28. Example:
29. <ul>
30.   <li>Item 1</li>
31.   <li>Item 2</li>
32. </ul>

33. Tables are built with <table>, <tr>, <td>, and <th>.
34. Forms allow user input using <form> tags.
35. Input fields use <input>, <textarea>, <select>, etc.
36. Buttons are created using the <button> tag.
37. You can group elements with <div> and <span>.
38. HTML5 introduced new semantic tags.

39. Semantic tags include:
40. <header> - defines a page header
41. <footer> - defines a page footer
42. <section> - groups related content
43. <article> - independent content
44. <nav> - navigation links
45. <main> - main content of the document
46. <aside> - side content like a sidebar

47. You can apply styles using the style attribute.
48. Example: <p style="color:red;">Red text</p>
49. Or, use CSS (Cascading Style Sheets) for better styling.
50. External CSS can be linked using <link> tag in <head>.

51. HTML can embed JavaScript with <script> tags.
52. Scripts can be internal or linked externally.
53. HTML is not case-sensitive but lowercase is preferred.
54. Always close your tags for good practice.
55. Use the alt attribute in <img> for accessibility.
56. Use title attributes to provide tooltips.

57. HTML5 supports audio and video.
58. Example:
59. <video controls>
60.   <source src="video.mp4" type="video/mp4">
61. </video>

62. <audio controls>
63.   <source src="sound.mp3" type="audio/mpeg">
64. </audio>

65. HTML is interpreted by web browsers.
66. It forms the skeleton of every webpage.
67. You can validate HTML at validator.w3.org.
68. Responsive design is enhanced with media queries and CSS.
69. HTML is open and free to use.
70. Accessibility can be improved using ARIA attributes.

71. HTML entities allow special characters.
72. Example: &lt; for < and &gt; for >
73. Commenting is done with <!-- Comment here -->
74. IDs and classes help identify and style elements.
75. Use the id attribute for unique identification.
76. Use the class attribute to group elements.

77. HTML works with CSS and JavaScript to build UI.
78. HTML documents have a MIME type of text/html.
79. All modern browsers support HTML5.
80. You can test HTML using CodePen, JSFiddle, or local files.

81. Doctype declaration example: <!DOCTYPE html>
82. HTML evolves with versions (HTML4, XHTML, HTML5).
83. HTML is constantly maintained by W3C and WHATWG.
84. Layout techniques include flexbox and grid (via CSS).
85. Inline elements do not start on a new line.
86. Block elements always start on a new line.

87. HTML makes websites accessible to everyone.
88. Best practice is writing clean, semantic code.
89. Avoid inline styles in large projects.
90. Use meta tags for SEO optimization.

91. Examples of meta tags:
92. <meta charset="UTF-8">
93. <meta name="viewport" content="width=device-width, initial-scale=1.0">
94. <meta name="description" content="Learn HTML basics">

95. Test your HTML skills by building a personal site.
96. Use <iframe> to embed other pages or videos.
97. Hosting platforms include GitHub Pages and Netlify.
98. HTML is the gateway to front-end development.
99. Every web developer must master HTML.
100. Keep practicing and building – that's how you learn!
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
                painter = painterResource(R.drawable.html),
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
                        text = htmlInfo,
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )

                }
            }
        }
    }
    }