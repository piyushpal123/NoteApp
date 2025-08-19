package com.example.notes.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {

class title(orderType: OrderType): NoteOrder(orderType)
class Date(orderType: OrderType): NoteOrder(orderType)
class color(orderType: OrderType): NoteOrder(orderType)
}