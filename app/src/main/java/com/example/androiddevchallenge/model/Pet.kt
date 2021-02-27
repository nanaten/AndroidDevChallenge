package com.example.androiddevchallenge.model

import java.io.Serializable

data class Pet(
    val id: Int,
    val name: String,
    val type: Type,
    val sex: Sex,
    val color: String,
    val memo: String,
    val image: Int
): Serializable {
}

enum class Type: Serializable {
    CAT,
    DOG
}

enum class Sex: Serializable {
    MALE,
    FEMALE
}