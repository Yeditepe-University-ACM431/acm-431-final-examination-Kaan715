package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItemScreen() {

    // TODO 1: Create a mutable state to hold completion status (Boolean)
    // Initial value should be false

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )

        // TODO 2: Show text "Completed" or "Not Completed"
        // depending on completion state

        Button(
            onClick = {
                // TODO 3: Toggle completion state
            }
        ) {
            Text("Change Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {
    // TODO: Call TaskItemScreen
}




        
        // TODO 2: Add composable for "taskDetail/{title}"
    }
}
