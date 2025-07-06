package com.example.homemassage.data.model

data class Booking(
    val technicianId: String,
    val userId: String,
    val dateTime: String,
    val address: String,
    val note: String
)