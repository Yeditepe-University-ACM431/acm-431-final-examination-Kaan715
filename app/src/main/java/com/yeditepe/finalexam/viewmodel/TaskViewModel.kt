package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

data class Task(
    val id: Int,
    val title: String,
    val isCompleted: Boolean
)

package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    val tasks = mutableStateListOf(
        Task(id = 1, title = "Study for exam", isCompleted = false),
        Task(id = 2, title = "Finish assignment", isCompleted = true)
    )

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = tasks[index]
            tasks[index] = task.copy(isCompleted = !task.isCompleted)
        }
    }
}
Why this is correct
mutableStateListOf → triggers recomposition in Compose ✅

copy() → keeps data class immutable ✅

indexOfFirst → safe and simple task lookup ✅

If you want, I can also help you connect this ViewModel to a Compose screen or implement a task list UI.



    

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
    }
}
