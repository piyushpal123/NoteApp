package com.example.notes.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {

class title(orderType: OrderType): NoteOrder(orderType)
class Date(orderType: OrderType): NoteOrder(orderType)
class color(orderType: OrderType): NoteOrder(orderType)

    fun copy (orderType: OrderType): NoteOrder {
        return when(this) {
            is title -> title(orderType)
            is Date -> Date(orderType)
            is color -> color(orderType)
        }
    }
}