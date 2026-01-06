package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        val taskDtos = api.getTasks()

        // TODO 2: Convert TaskDto list to Task list
        return taskDtos.map { it.toTask() }
    }
}
Example mapper:

kotlin
Copy code
fun TaskDto.toTask(): Task {
    return Task(
        id = id,
        title = title,
        completed = completed
    )
}
Option 2: Mapping inline (simpler, but less clean)
kotlin
Copy code
class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        return api.getTasks().map { dto ->
            Task(
                id = dto.id,
                title = dto.title,
                completed = dto.completed
            )
        }
    }
}





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

        // TODO 2: Convert TaskDto list to Task list
        return TODO("Provide the return value")
    }
}
