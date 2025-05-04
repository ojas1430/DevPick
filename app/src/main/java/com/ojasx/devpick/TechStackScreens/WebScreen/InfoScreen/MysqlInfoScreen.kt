package com.ojasx.devpick.TechStackScreens.WebScreen.InfoScreen

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
fun MysqlInfoScreen(navController: NavController) {


    val mysqlInfo = """"  1. MySQL is an open-source relational database management system (RDBMS).
2. It is based on Structured Query Language (SQL).
3. Developed by MySQL AB in 1995.
4. Acquired by Sun Microsystems, then Oracle Corporation.
5. It stores data in tables made of rows and columns.
6. MySQL is widely used in web applications.
7. Compatible with Linux, Windows, macOS.
8. Popular in LAMP stack (Linux, Apache, MySQL, PHP/Python).
9. Uses client-server architecture.
10. Supports multi-user access.

11. Data in MySQL is organized into databases.
12. Each database can have multiple tables.
13. Tables consist of rows (records) and columns (fields).
14. Data types include INT, VARCHAR, DATE, and TEXT.
15. Supports primary keys and foreign keys.
16. Normalization is used to reduce data redundancy.
17. SQL is used to perform CRUD operations.
18. CRUD = Create, Read, Update, Delete.
19. `SELECT` is used to retrieve data.
20. `INSERT` is used to add data.

21. `UPDATE` modifies existing data.
22. `DELETE` removes data from tables.
23. Constraints ensure data accuracy.
24. Common constraints: NOT NULL, UNIQUE, CHECK, DEFAULT.
25. Primary key uniquely identifies each record.
26. Foreign key establishes relationships between tables.
27. Indexes improve data retrieval speed.
28. MySQL supports both InnoDB and MyISAM storage engines.
29. InnoDB supports transactions and foreign keys.
30. MyISAM is faster but lacks transactions.

31. Transactions are used for grouped SQL operations.
32. Transactions support ACID properties.
33. ACID = Atomicity, Consistency, Isolation, Durability.
34. MySQL supports JOINs to combine data from tables.
35. Types of JOINs: INNER, LEFT, RIGHT, FULL OUTER.
36. `GROUP BY` groups rows with the same values.
37. `ORDER BY` sorts query results.
38. `WHERE` filters query results.
39. `HAVING` filters grouped data.
40. `LIMIT` restricts number of results returned.

41. Functions include COUNT(), SUM(), AVG(), MAX(), MIN().
42. You can use aliases with `AS` for readability.
43. Subqueries allow queries within queries.
44. Views are virtual tables based on SELECT queries.
45. Stored Procedures are reusable SQL blocks.
46. Triggers run automatically when events occur.
47. Users and permissions are managed for security.
48. `GRANT` and `REVOKE` assign and remove permissions.
49. Authentication is user/password based.
50. MySQL supports SSL for secure connections.

51. GUI tools include MySQL Workbench, phpMyAdmin.
52. MySQL Workbench provides modeling and admin features.
53. phpMyAdmin is web-based and user-friendly.
54. MySQL supports replication (master-slave).
55. Replication increases data availability.
56. Backup tools include `mysqldump` and `mysqlhotcopy`.
57. Sharding can be used for horizontal scaling.
58. Vertical scaling involves adding more CPU/RAM.
59. MySQL can be clustered for high availability.
60. Clustered MySQL uses NDB storage engine.

61. MySQL is written in C and C++.
62. It uses a layered architecture.
63. Query cache stores SELECT results for speed.
64. Query Optimizer chooses best query execution plan.
65. The storage engine layer manages table types.
66. SQL layer parses, plans, and optimizes queries.
67. The server layer handles connections and threads.
68. Buffer Pool stores data and index pages in RAM.
69. Binary log records all changes to the database.
70. Slow query log tracks inefficient queries.

71. MySQL 8.0 is the latest major release.
72. MySQL 8.0 supports Common Table Expressions (CTEs).
73. JSON support was added in recent versions.
74. Window functions allow advanced analytics.
75. Role-based access control is supported.
76. Improved security and password policies.
77. GIS support for spatial data (geographic).
78. Full-text search for large text fields.
79. Time zones and collation settings are supported.
80. Supports UTF-8, UTF8MB4 for emojis.

81. MySQL is free under the GNU GPL.
82. Enterprise edition includes advanced features.
83. Used by Facebook, Twitter, YouTube, Airbnb, Uber.
84. Popular in WordPress, Joomla, Drupal CMS platforms.
85. Amazon RDS offers MySQL as a managed service.
86. Google Cloud SQL supports MySQL too.
87. MySQL can be run in Docker containers.
88. Many ORMs support MySQL
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
                painter = painterResource(R.drawable.sql),
                contentDescription = "",
                modifier = Modifier
                    .size(150.dp)
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

                item {
                    Text(
                        text = mysqlInfo,
                        style = TextStyle(
                            fontSize = 16.sp
                        )
                    )

                }
            }
        }
    }
}

