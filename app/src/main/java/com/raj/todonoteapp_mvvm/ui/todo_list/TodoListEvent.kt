package com.raj.todonoteapp_mvvm.ui.todo_list

import com.raj.todonoteapp_mvvm.data.Todo

sealed class TodoListEvent {
    data class DeleteTodoClick(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean) : TodoListEvent()
    object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todo: Todo) : TodoListEvent()
    object OnAddTodoClick : TodoListEvent()
}
