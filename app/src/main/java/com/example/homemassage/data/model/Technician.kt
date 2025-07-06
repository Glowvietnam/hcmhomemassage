package com.example.homemassage.data.model

data class Technician(
    val id: String,
    val name: String,
    val skills: List<String>,
    val rating: Float,
    val photoUrl: String,
    val bio: String
)